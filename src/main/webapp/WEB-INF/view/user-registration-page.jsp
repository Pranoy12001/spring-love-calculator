<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
</style>
</head>
<body>
	<h1 align="center">Please register here</h1>
	<form:form action="registration-success"
		modelAttribute="userRegistrationDTO" method="get">
		<div align="center">
			<label for="name">Name: </label>
			<form:input path="name" id="name" />
			<form:errors path="name" cssClass="error"/>
			<br> <label for="userName">User Name: </label>
			<form:input path="userName" id="userName" />
			<form:errors path="userName" cssClass="error"/>
			<br> <label for="password">Password: </label>
			<form:password path="password" id="password" />
			<br> <label for="country">Country: </label>
			<form:select path="countruyName">
				<form:option value="ind" label="India"></form:option>
				<form:option value="bd" label="Bangladesh"></form:option>
				<form:option value="sl" label="Sri Lanka"></form:option>
			</form:select>
			<br> <label for="hobbies">Hobbies: </label> Cricket:
			<form:checkbox path="hobbies" value="Cricket" />
			Reading:
			<form:checkbox path="hobbies" value="Reading" />
			Travel:
			<form:checkbox path="hobbies" value="Travel" />
			Programming:
			<form:checkbox path="hobbies" value="Programming" />
			<br> <label for="gender">Gender: </label> Male
			<form:radiobutton path="gender" value="male" />
			Female
			<form:radiobutton path="gender" value="female" />
			<br> <label for="age">Age: </label>
			<form:input path="age" id="age" />
			<br>
			<form:errors path="age" cssClass="error"/>
		</div>

		<div align="center">
			<h3>Communication:</h3>

			<label>Email</label>
			<form:input path="communicationDTO.email" />

			<label>Phone</label>
			<form:input path="communicationDTO.phone" />
		</div>
		<br>
		<div align="center">
			<input type="submit" value="Register">
		</div>
	</form:form>

</body>
</html>