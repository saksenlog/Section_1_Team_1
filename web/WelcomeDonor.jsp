<%-- 
    Document   : WelcomeDonor
    Created on : 27 Oct, 2015, 1:38:43 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Donor page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css" media="screen">
    </head>
    <body>
        <h1>Welcome to Donor Room</h1>
        Welcome <%=session.getAttribute("userName")%>
<a href='logout.jsp'>Log out</a>
        
        <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
        <a class="navbar-brand" href="#">Organdonationlive</a> 
    </div>
        
       <div>
        <ul class="nav navbar-nav">
          <li><a href="home.jsp">Home</a></li>
          <li class ="active"><a href="Donor.jsp">Donor</a></li>
          <li><a href="#">Hospital</a></li>
          <li><a href="#">Custodian</a></li>
          <li><a href="#">Contact</a></li>        
          <li><a href="#">FAQ</a></li>
         
        </ul>
       </div>     
      </nav>
        
        
            <div class="container">
                <form action="DonorDeclaration.jsp" method="get"> 
        <div class="form-group">        
            <div class="col-sm-offset-2 col-sm-10">
          <input type="submit" class="btn btn-default" value="Donor Declaration  "> <br>
          </div>
        </div>
                    <br>
                    <br><br>
                <form action="" method="get"> 
        <div class="form-group">        
              <div class="col-sm-offset-2 col-sm-10"> 
          <input type="submit" class="btn btn-default" value="View/Edit Custodian">
          </div>
        </div>
    </body>
</html>
