<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>커스텀 로그인</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<link href="${path}/resources/css/login.css?after" rel="stylesheet" type="text/css" />
</head>
<body>

<div>

  <div class="intro_div" style="margin-top: 100px; padding-top: 50px; padding-bottom: 50px;">
  <h1><p class="Gpont">당신을 위한 도서관</p></h1>

  <div class="intro_font">
  <p>당신의 손 끝에서 만들어지는</p>
  <p>단 하나 뿐인</p>
  <p>도서관</p>
  </div>

  	<div class="form_st">
  	<form method='post' action="/login" style="display:inline-block;">
  		<div style="margin-bottom: 10px" >
    		<input type='text' name='username' class="form-control input_st" placeholder="아이디를 입력해주세요">
  		</div>

  		<div style="margin-bottom: 10px;">
  			<input type="password" name='password' class="form-control input_st" placeholder="비밀번호를 입력해주세요">
  		</div>

  		<div style="margin-bottom: 20px;">
    		<input class="form-check-input" type='checkbox' name='remember-me' style="margin-right: 5px;"> <p class="remember_st">책갈피를 꼽는다</p>
  		</div>

  		<div>
    		<input class="btn btn-dark" type='submit' value="도서관에 발을 들인다">
  		</div>

    	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
  </form>
  </div>
  <a href="/sample/memberjoin"></a>

  </div>



 </div>
  <!-- bootstrap -->
  <script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
		integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js"
		integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V"
		crossorigin="anonymous"></script>
</body>
</html>