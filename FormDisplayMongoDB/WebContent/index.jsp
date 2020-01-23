<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js">            
            </script>
         <script type="text/javascript">
    $(document).ready(function () {
          $("#btnSubmit").click(function (event) {
            event.preventDefault();
            
            var x = document.forms["formsubmit"]["firstname"].value;
            var y=document.forms["formsubmit"]["lastname"].value;
            if (x == ""||y=="") {
              alert("Name must be filled out");
              return false;
            }
            
           // var form = $('#formsubmit');
     $.ajax({
     type: "POST",
     url:"FormDisplayMongo",
     data:$("#formsubmit").serialize(),
     success: function (data) {
    	 alert("success!!!");
     var result=data;
     
     $('#result').append(result);
     },
     error: function (e) {
    	 alert("Error!!!"+" "+e);
         $('#result').append(e);
     }
     
     });
     
     });
    });
   
     </script>
     <style>

</style>
</head>
<body>

  <form  method = "POST" id="formsubmit" enctype="multipart/form-data">
         id: <br>
         <input type = "number" name = "id" id="">
         <br>
         First Name:<br>
         <input type = "text" name = "first_name" id="firstname">
         <br>
         Last Name:<br>
         <input type = "text" name = "last_name" id="lastname"/>
         <br>
         <br><input type = "submit" value = "Submit" id="btnSubmit" />
      </form>
       <table>
  <tr>
    Firstname Lastname Age
  </tr >
  <tr id="result">
  </tr>
  </table>

</body>
</html>