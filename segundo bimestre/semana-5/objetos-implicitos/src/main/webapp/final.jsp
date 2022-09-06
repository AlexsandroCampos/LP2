<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		List<String> inputs = List.of("nome", "idade", "email", "endereco", "bairro", "cidade", "cep");
	%>
	<%
		for(String input : inputs) {
			if(request.getParameter(input).startsWith("")) {
				response.sendRedirect(request.getContextPath() + "/formulario.jsp");
				break;
			}
			else {
				out.print("<h1>" + request.getParameter(input) + "</h1>");
			}
		}
		
	%>
</body>
</html>