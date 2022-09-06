<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/css.css">
<meta charset="UTF-8">
<title>Formulário</title>
</head>
<body>
	<form action="final.jsp" method="post">
		<label>Nome</label>
		<input type="text" name="nome">
		
		<label>Idade</label>
		<input type="number" name="idade">
		
		<label>Email</label>
		<input type="email" name="email">
		
		<label>Endereço</label>
		<input type="text" name="endereco">
		
		<label>Bairro</label>
		<input type="text" name="bairro">
		
		<label>Cidade</label>
		<input type="text" name="cidade">
		
		<label>CEP</label>
		<input type="text" name="cep">
		
		<input type="submit" value="Submeter">
	</form>
</body>
</html>