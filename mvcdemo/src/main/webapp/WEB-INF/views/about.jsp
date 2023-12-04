<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>About html</h1>
	<%
	/* String name= (String) request.getAttribute("name");
	Integer rollNumber= (Integer) request.getAttribute("rollNumber"); */
	%>

	<%--<h1> Hello my name is </h1>
<h2>My roll number is</h2> --%> 
 

	<h1>Hello my name is ${name }</h1>
	<h2>My roll number is ${rollNumber}</h2>
	<hr>
	
	<c:forEach var="i" items="${ list}">
		<h2>${i }</h2>
	</c:forEach>
</body>
</html>