<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulário</title>
</head>
<body>
	<form action="verificar.jsp" method="get">
		<label>Dia</label>
		<input type="number" name="dia">
		
		<label>Mês</label>
		<input type="number" name="mes">
		
		<label>Ano</label>
		<input type="number" name="ano">
		
		<input type="submit" value="Enviar">
	</form>
</body>
</html>