<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/home-style.css">
</head>
<body>
	<div class="div-header">
		<h1 class="h1-header">Welcome to the show</h1>
		<nav class="nav-header">
			<a href="${pageContext.request.contextPath}/say-hello">Hello page</a>
			<a href="${pageContext.request.contextPath}/say-welcome">Welcome page</a>
		</nav>
	</div>
</body>
</html>