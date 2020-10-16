<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>
	<h1 align="center">Your registration is successful</h1>
	<h2>The details entered by you are: </h2>
	Name: ${userRegistrationDTO.name}<br>
	User Name: ${userRegistrationDTO.userName}<br>
	Password: ${userRegistrationDTO.password}<br>
	Country Name: ${userRegistrationDTO.countruyName}<br>
	Hobbies: 
		<c:forEach var="temp" items="${userRegistrationDTO.hobbies}">
			${temp}
		</c:forEach>
	<br>
	Gender: ${userRegistrationDTO.gender}
</body>
</html>