<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
	<form action="cadastro" method="post">
		<table>
			<tr>
				<td><label for="nome">Nome</label></td>
				<td><input type="text" placeholder="nome" name="nome" id="nome"></td>
			</tr>
			
			<tr>
				<td><label for="endereco">Endereço</label></td>
				<td><input type="text" placeholder="endereco" name="endereco" id="endereco"></td>
			</tr>
			
			<tr>
				<td><label for="bairro">Bairro</label></td>
				<td><input type="text" placeholder="bairro" name="bairro" id="bairro"></td>
			</tr>
			
			<tr>
				<td><label for="cidade">Cidade</label></td>
				<td><input type="text" placeholder="cidade" name="cidade" id="cidade"></td>
			</tr>
			
			<tr>
				<td><label for="cep">Cep</label></td>
				<td><input type="text" placeholder="cep" name="cep" id="cep"></td>
			</tr>
			
			<tr>
				<td><label for="telefone">Telefone</label></td>
				<td><input type="text" placeholder="telefone" name="telefone" id="telefone"></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Cadastrar"></td>
			</tr>
		</table>
	</form>
</body>
</html>