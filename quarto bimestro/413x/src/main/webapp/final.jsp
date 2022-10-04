<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultado</title>
</head>
<body>
	<%
		out.print("Data definida pelo usuário: " + session.getAttribute("data"));
	%>
</body>
</html>