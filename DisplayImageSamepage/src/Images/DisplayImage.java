package Images;




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

@WebServlet(name = "DisplayImage", urlPatterns = {"/DisplayImage"})
@MultipartConfig
public class DisplayImage extends HttpServlet {

	private static final long serialVersionUID = 1L;
	@Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
        final String path = request.getParameter("destination");
        final Part filePart = ((HttpServletRequest) request).getPart("file");
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
        response.getOutputStream().print(fileName);
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