<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Random" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Random r = new Random();
		Integer numero = r.nextInt(101);
		out.print(numero + "<br>");
		
		if(request.getParameter("escolha").equals("par") && numero % 2 == 0 ) {
			out.print("Usuário venceu!");
		} else if(request.getParameter("escolha").equals("impar") && numero % 2 != 0 ) {
			out.print("Usuário venceu!");
		}
		else {
			out.print("Usuário perdeu!");
		}
	%>
</body>
</html>