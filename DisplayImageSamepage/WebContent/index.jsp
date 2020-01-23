
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HOME</title>
    <center><h1>DISPLAY IMAGE</h1></center>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js">            
            </script>
            <script>
          $(document).ready(function () {
          $("#btnSubmit").click(function (event) {
            event.preventDefault();
            var form = $('#fileUploadForm')[0];
            var data = new FormData(form);
        $("#btnSubmit").prop("disabled", true);
        $.ajax({
            type: "POST",
            enctype: 'multipart/form-data',
            url: "DisplayImage",
            data: data,
            processData: false,
            contentType: false,
            cache: false,
            success: function (data) {
                var path="images/"+data;
                setTimeout(function() { 
                alert("Loading Complete");
                
                $("#result").html('<img src="'+path+'" width="900" height="516" >');
                $("#message").text("Image Uploaded successfully!!!");
                }, 2000);
                
                console.log("SUCCESS : ", data);
                $("#btnSubmit").prop("disabled", false);
            },
            error: function (e) {
                $("#result").text(e.responseText);
                console.log("ERROR : ", e);
                $("#btnSubmit").prop("disabled", false);
            }
        });
    });
});
            </script>
    
    </head>
   <style>
.uploadform{
   border: 3px solid black;
   margin-left: 200px;
   margin-right: 200px;
}
input[type=submit] {
  background-color: #778899;
  border: none;
  color: white;
  padding: 10px 20px;
  text-decoration: none;
  margin: 4px 2px;
  cursor: pointer;
}

</style>
    <body>
        <div class="uploadform">
    <center>
        
       <form method="POST" action="DisplayImage" enctype="multipart/form-data" id="fileUploadForm">  
           <table>
               <tr> <td><b>Upload File</b>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="file" name="file" id="file" /> </td></tr><br>
               <tr><td><b>Destination Directory</b><input type="text"  name="destination" id="dest"/></td></tr>
</table>
           
           <center><input type="submit" value="Upload" id="btnSubmit"/></center>
           <br>
        </form>
           
    </center>
        </div>
        <br>
        <center><div  id="message"></div></center><br>
    <center><div class="resultform" id="result"></div></center><br>
    </body>
</html>
