<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>당신의 도서관</title>
</head>
<body>

<header>
	<script>loadHTML("header.html");</script>
</header>

<div>
<table id ="board_list">
</table>
</div>

</body>
<script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	$(document).ready(
		$.ajax({
			url : "/library/boardAllUser",
			type : "get",
			dataType : "json",
			success : function(data){
				var str = ""
				$.each(data, function(index, item){
					str +="<tr>";
					str +="<td>"+item.title+"</td>";
					str +="</tr>";
				})
				$("#board_list").html(str);
			}
		})
		
	)
</script>

</html>