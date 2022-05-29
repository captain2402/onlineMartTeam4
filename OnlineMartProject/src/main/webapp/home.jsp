<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="mart.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>HOME</h1>

<form action="SearchController">

Enter your phone number : 
<input type="text" name="phone">
<input type="submit" value="search">
</form>
<%RegistrationModel rm = (RegistrationModel)session.getAttribute("registr"); %>
<%if(rm!=null){ %>
<h1><%=rm.getEmail()%></h1>
<h1><%=rm.getName() %></h1>
<%} %>
</body>
</html>