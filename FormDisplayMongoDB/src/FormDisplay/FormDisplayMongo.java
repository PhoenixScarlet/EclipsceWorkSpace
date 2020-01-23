package FormDisplay;

import java.io.IOException;

import java.util.LinkedHashMap;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

import com.mongodb.MongoClient;


@WebServlet(name = "FormDisplayMongo", urlPatterns = {"/FormDisplayMongo"})
public class FormDisplayMongo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 public void doPost(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
		      response.setContentType("text/html");
		      String id=request.getParameter("id").toString();
              String firstName=request.getParameter("first_name");
              String lastName=request.getParameter("last_name");
             
              
              MongoClient mongoClient=new MongoClient("localhost",27017);
			  System.out.println("connection established successfullly");
              DB db=mongoClient.getDB("mongodb");
      		  DBCollection dbc=db.getCollection("formdetails");
      		  
      		BasicDBObject documentDetail = new BasicDBObject();
      		documentDetail.put("_id",id);
      		documentDetail.put("First_Name",firstName);
      		documentDetail.put("Last_Name", lastName);
      		dbc.insert(documentDetail);	 
      		
      		LinkedHashMap<String,String> names = new LinkedHashMap<String,String>();
      		DBCursor cursorDoc = dbc.find();
      		while (cursorDoc.hasNext()) {
      			System.out.println(cursorDoc.next());
      			String ids=(String)cursorDoc.curr().get("_id");
      			String fnames=(String)cursorDoc.curr().get("First_Name");
      			String lnames=(String)cursorDoc.curr().get("Last_Name"); 
      			///names.put(fnames,lnames);
      			response.getWriter().print("<table> <tr>\r\n" + 
      					"    <th></th>\r\n" + 
      					"    <th></th> \r\n" + 
      					"    <th></th>\r\n" + 
      					"  </tr><tr>" + 
      					"    <td>"+ids+" "+"</td>" + 
      					"    <td>"+fnames+" "+"</td>" + 
      					"    <td>"+lnames+" "+"</td>" + 
      					"  </tr>");
      			
      		}
      		//response.getWriter().print(names);
      		/*ObjectMapper mapper = new ObjectMapper();
      		mapper.getJsonFactory().configure(JsonGenerator.Feature.ESCAPE_NON_ASCII, true);        
      		String jsonStr = mapper.writeValueAsString( names );
      		System.out.println("********"+jsonStr);
      		response.setContentType("text/plain");  
      		response.getOutputStream().print( jsonStr );*/
 	   }

	
}
//PrintWriter out = response.getWriter();  

/* JSONObject obj=new JSONObject();
 //JSONArray jArray = new JSONArray();
 try {
	obj.put("firstname",firstName);
	obj.put("lastname",lastName);
	String jsonData = obj.toString();
	String regex = "(?<=\"position\":)\"|\"(?=\\}\\])";
	response.getWriter().write(obj.toString().replaceAll(regex, ""));
} catch (JSONException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}*/