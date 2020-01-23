
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HOME</title>
    <center><h1>DISPLAY IMAGE</h1></center>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js">            
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
            url: "DisplayImageMongo",
            data: data,
            processData: false,
            contentType: false,
            cache: false,
            success: function (data) {
            	
            	 var path="images/"+data;
            	 
                  setTimeout(function() { 
                   alert("Loading Complete...Image Uploaded successfully!!!");
                  
                   
                  $("#icon").append("<img  src="+path+" width='100' height='100'  ><br>");
                  $("#icon").append(data+"<br>");
                   
                 $("#largeimage").html('<img src="'+path+'" width="600" height="516" >');
                 $("#largeimage").append("<br>"+data);
                
                 
                 
                   $( "img" ).on( "click", enlargedImage );   
                 	function enlargedImage() {
                 		 $largeimage = $(this).clone().css({height:"516", width:"600"});
                         $("#largeimage").html($largeimage);
                         var imgsrc = this.src;
                         var name=imgsrc.split("/",imgsrc.length );
                  	     var len=name.length-1;
                  	     var n=name[len]+" ";
                  	     $("#largeimage").append("<br>"+n);
                 	}        
                  }, 2000);  
          		  
            		 
                console.log("SUCCESS : ", data);
                $("#btnSubmit").prop("disabled", false);
            },
            
            error: function (e) {
                $("#icon").text(e.responseText);
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
 
   resize:both;
   margin-left: 200px;
   margin-right: 200px;
}

input[type=submit] {
  background-color: #778899;
  border: none;
  color: white;
  padding: 5px 10px;
  text-decoration: none;
  margin: 4px 2px;
  cursor: pointer;
}
.iconimage{
  color: white;
}
.split {
  height: 100%;
  width: 50%;
  position: fixed;
  z-index: 1;
  top: 0;
  overflow-x: hidden;
  padding-top: 20px;
}

.left {
  left: 0;
  background-color:#B8B8B8 ;
}

.right {

  right: 0;
  background-color: #B8B8B8;
}


/*.centered {
 position: absolute;
  top: 20%;
  left: 50%;
  transform: translate(-50%, -50%);
  text-align: center;
}*/

</style>
    <body>
    
       <form method="POST"  enctype="multipart/form-data" id="fileUploadForm" >
        <div align="center" class="split left">    
<h3 align="center" class="uploadform">UPLOAD IMAGE</h3>
    <b>Upload File:</b><input type="file" name="file" id="file" /><input type="submit" value="Upload" id="btnSubmit"/> 
    <div  align="center" id="largeimage"></div>
</div>
</form>

<div class="split right">
<h3 align="center" class="uploadform">DISPLAY IMAGE</h3>
<div align="center" id="icon" class="iconmage"></div>
 </div>

 
 
    </body>
</html>
