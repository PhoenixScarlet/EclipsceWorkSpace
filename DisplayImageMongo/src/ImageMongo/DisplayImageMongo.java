/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImageMongo;




import java.io.File;


import java.io.FileOutputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;

@WebServlet(name = "DisplayImageMongo", urlPatterns = {"/DisplayImageMongo"})
@MultipartConfig
public class DisplayImageMongo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
        final String path = "C:/Users/Trainee/eclipse-workspace/DisplayImageMongo/WebContent/images";
        final Part filePart = request.getPart("file");

        final String fileName = getFileName(filePart);
        String filename=path + File.separator+ fileName;
        
        OutputStream out = null;
        InputStream filecontent = null; 
        out = new FileOutputStream(new File(filename));
        filecontent = filePart.getInputStream();
        int read = 0;
        final byte[] bytes = new byte[1024];
        while ((read = filecontent.read(bytes)) != -1)
        {
            out.write(bytes, 0, read);
        }
        out.close();
        
        
        
        
        MongoClient mongoClient=new MongoClient("localhost",27017);
		System.out.println("connection established successfullly");
		
		DB db=mongoClient.getDB("UploadImage");
		//DBCollection dbc=db.getCollection("sample");
		
		String newFileName =fileName ;
		File imageFile = new File(filename);
		GridFS gfsPhoto = new GridFS(db, "photo");
		GridFSInputFile gfsFile = gfsPhoto.createFile(imageFile);
		
		gfsFile.setFilename(newFileName);
		gfsFile.save();
		
		System.out.println("File uploaded");
		
		
		GridFSDBFile imageForOutput = gfsPhoto.findOne(newFileName);
		imageForOutput.writeTo("C:/Users/Trainee/eclipse-workspace/DisplayImageMongo/WebContent/store/"+fileName);
		System.out.println(imageForOutput.getFilename());
		DBCursor cursor = gfsPhoto.getFileList();
		while (cursor.hasNext()) {
			System.out.println(cursor.next());
		} 
        response.getOutputStream().print(imageForOutput.getFilename());
    
}
private String getFileName(final Part part) {
   
    for (String content : part.getHeader("content-disposition").split(";")) {
        if (content.trim().startsWith("filename")) {
            return content.substring(
                    content.indexOf('=') + 1).trim().replace("\"", "");
        }
    }
    return null;
}
}
