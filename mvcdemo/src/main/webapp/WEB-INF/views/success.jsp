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
<div class="container">
	<h2>Name : </h2> <h4>${user.userName}</h4>
		<h2>Email : </h2> <h4>${user.email}</h4>
		<h2>password : </h2> <h4>${user.password}</h4>
</div>
</body>
</html>