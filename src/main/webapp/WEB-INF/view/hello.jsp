<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>ToDo-List</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>
	<h1>Hello World!</h1>
	<div class="container">
		<form action="#">
			<label for="name">Name: </label> <input name="name" type="text" /> <br>
			<label for="occupation">Occupation: </label> <input name="occupation"
				type="text" /> <br> <label for="hobby">Hobby: </label> <input
				name="hobby" type="text" /> <br> <input type="submit"
				value="Submit Info">
		</form>
	</div>
	<img alt="IDK" src="${pageContext.request.contextPath}/resources/image/funnyLooking.jpg">
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/script.js"></script>
</body>
</html>