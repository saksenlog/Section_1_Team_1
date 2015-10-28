<%-- 
    Document   : DonorDeclaration
    Created on : 27 Oct, 2015, 12:06:52 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Donor Declaration Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css" media="screen">
    </head>
    <body>
        <h1>Donor Declaration Page</h1>
        
        <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
        <a class="navbar-brand" href="#">Organdonationlive</a> 
    </div>
        
       <div>
        <ul class="nav navbar-nav">
          <li><a href="home.jsp">Home</a></li>
          <li><a href="Donor.jsp">Donor</a></li>
          <li><a href="#">Hospital</a></li>
          <li><a href="#">Custodian</a></li>
          <li><a href="#">Contact</a></li>        
          <li><a href="#">FAQ</a></li>
          
        </ul>
       </div>     
      </nav>
        
        <div class="container">
  <h2>Please fill the below declaration Form!</h2>
  <form class="form-horizontal" role="form" action="DonorDeclarationServlet" method="post">
      
    <div class="container">
  <h2>In the Case that organ/tissue donation for transplantation is possible after my death</h2>
  <p>I DECLARE:</p>
  <form role="form">
    <div class="checkbox">
        <label><input type="checkbox" value="">Yes,I give permission for organs and tissue to be taken  <br> from my body after doctor's certification of death </label>
    </div>
    <div class="checkbox">
      <label><input type="checkbox" value="">Yes,I give permission for the use of organs and tissue with the exception of the following:  </label>
    </div>
    <div class="checkbox">
      <label><input type="checkbox" value="">I'm declaring the following persons as my custodians </label>
    </div>
  </form>
</div>
      <div class="form-group">
        <label class="control-label col-sm-2" for="Custodian1 Name">Custodian1 Name</label>
        <div class="col-sm-3">
            <input type="text" class="form-control" name="Custodian1 Name" id="Custodian1 Name" placeholder="Custodian1 Name">
        </div>
        <div class="col-sm-3">
            <label class="control-label col-sm-2" for="Custodian1 Email">Custodian1 Email</label>
        </div>
        <div class="col-sm-3">
            <input type="text" class="form-control" name="Custodian1 Email" id="Custodian1 Email" placeholder="Custodian1 Email">
        </div>
    </div>
      <br> <br>
      <div class="form-group">
        <label class="control-label col-sm-2" for="Custodian2 Name">Custodian2 Name</label>
        <div class="col-sm-3">
            <input type="text" class="form-control" name="Custodian2 Name" id="Custodian2 Name" placeholder="Custodian2 Name">
        </div>
        <div class="col-sm-3">
            <label class="control-label col-sm-2" for="Custodian2 Email">Custodian2 Email</label>
        </div>
        <div class="col-sm-3">
            <input type="text" class="form-control" name="Custodian2 Email" id="Custodian2 Email" placeholder="Custodian2 Email">
        </div>
    </div>
      <br> <br>
      <div class="form-group">
        <label class="control-label col-sm-2" for="Custodian3 Name">Custodian3 Name</label>
        <div class="col-sm-3">
            <input type="text" class="form-control" name="Custodian3 Name" id="Custodian3 Name" placeholder="Custodian3 Name">
        </div>
        <div class="col-sm-3">
            <label class="control-label col-sm-2" for="Custodian3 Email">Custodian3 Email</label>
        </div>
        <div class="col-sm-3">
            <input type="text" class="form-control" name="Custodian3 Email" id="Custodian3 Email" placeholder="Custodian3 Email">
        </div>
    </div>
      <br> <br>
      <div class="form-group">
        <label class="control-label col-sm-2" for="Custodian4 Name">Custodian4 Name</label>
        <div class="col-sm-3">
            <input type="text" class="form-control" name="Custodian4 Name" id="Custodian4 Name" placeholder="Custodian2 Name">
        </div>
        <div class="col-sm-3">
            <label class="control-label col-sm-2" for="Custodian4 Email">Custodian4 Email</label>
        </div>
        <div class="col-sm-3">
            <input type="text" class="form-control" name="Custodian4 Email" id="Custodian2 Email" placeholder="Custodian2 Email">
        </div>
    </div>
      <br> <br>
    

    </body>
</html>
