<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <h2><center>ENTER PNR NO TO VIEW TICKET DETAILS</center></h2>
  </head>
  <body>
  <form action="viewwtick" method="post">
    <div class="form-group">
      <span class="form-label"></span>
      <center>
        <input
          class="form-control"
          type="text" 
          placeholder="ENTER YOUR PNR NO " name ="ticketnumber"
        />
        <div class="form-btn">
          <button class="submit-btn">SUBMIT</button>
        </div>
      </center>
    </div>
    </form>
  </body>
  
</html>
