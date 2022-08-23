<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Random" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exercício 1</title>
</head>
<body>
	<%! 
		public Integer gerador() {
			Random gerador = new Random();
			return gerador.nextInt(1, 1001);
		}
	%>
	<h1>
		Número aleatório: 
		<%=
			gerador()
		%>
	</h1>
</body>
</html>