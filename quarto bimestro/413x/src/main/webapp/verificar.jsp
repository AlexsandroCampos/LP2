<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.time.*" %>
<%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Verificar</title>
</head>
<body>
	<%
		String dia = request.getParameter("dia");
		String mes = request.getParameter("mes");
		String ano = request.getParameter("ano");
		
		if(dia.isBlank() || mes.isBlank() || ano.isBlank())
			response.sendRedirect(request.getContextPath() + "/data.jsp");
		else {
			LocalDate data = LocalDate.of(
					Integer.parseInt(ano),
					Integer.parseInt(mes),
					Integer.parseInt(dia)
			);
			session.setAttribute("data", data);
			response.sendRedirect(request.getContextPath() + "/final.jsp");
		}
			
	%>
</body>
</html>