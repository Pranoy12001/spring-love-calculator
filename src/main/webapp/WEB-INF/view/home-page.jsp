<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
</style>
<script type="text/javascript">
function validateUserName() {
	var userName = document.getElementById("yn").value;
	
	if (userName.length < 3 || userName.length > 15) {
		alert("our name must be between 3 to 15 character");
		return false;
	}
	
	
	
	return true;
	
}
</script>
</head>
<body>
	<h1 align="center">Love Calculator</h1>
	<hr />
	<form:form action="process-homepage" method="get"
		modelAttribute="userInfo" onsubmit="return validateUserName()">
		<div align="center">
			<p>
				<label for="yn">Your Name: </label>
				<form:input id="yn" path="userName" />
				<form:errors path="userName" cssClass="error" />
			</p>
			<p>
				<label for="cn">Crush Name: </label>
				<form:input type="text" id="cn" path="crushName" />
				<form:errors path="crushName" cssClass="error" />
			</p>
			<p>
				<form:checkbox path="termsAndConditions" id="termsAndConditions"/>
				I am Agree that this is for fun
				<form:errors path="termsAndConditions" cssClass="error" />
			</p>
			<input type="submit" value="Calculator" />
		</div>
	</form:form>
</body>
</html>