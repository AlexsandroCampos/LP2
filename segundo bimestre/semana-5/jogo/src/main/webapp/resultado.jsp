<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Random" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultado!!!</title>
</head>
<body>
	<%!
		Random rd = new Random();
	%>
	
	<%
		int chiuaua = rd.nextInt(0, 100);
		out.print(chiuaua);
		if(chiuaua % 2 == 0) {
			out.print("<h1>" + request.getParameter("nome") + ", Ganhow!! </h1>");
		} else {
			out.print("<h1>" + request.getParameter("nome") + ", Perdew!! </h1>");
		}
	%>
</body>
</html>