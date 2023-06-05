<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>join-form</h1>
<form action="/sample/memberjoin" method="post">
userid : <input type="text" name="userid"><br>
userpw : <input type="password" name="userpw"><br>
username : <input type="text" name="userName"><br>
email: <input type="text" name="email"><br>
<input type = "submit" value="가입">
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
</form>
<a href="/customLogin">test</a>
</body>
</html>