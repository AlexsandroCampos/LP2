<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="resultado.jsp">
		<label for="par">Par</label>
		<input type="radio" value="impar" name="escolha" id="par">
		
		<label>Impar</label>
		<input type="radio" value="impar" name="escolha" id="impar">
		
		<input type="submit" value="JOGAR">
	</form>
</body>
</html>