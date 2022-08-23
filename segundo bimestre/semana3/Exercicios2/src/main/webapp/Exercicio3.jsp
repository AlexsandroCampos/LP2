<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.time.*" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exercício 3</title>
</head>
<body>
	<table>
		<% 
			LocalDate date = LocalDate.now();
			for(int i =1; i<=7; i++) {
				out.print("<tr>" + "<td>" + date.minusDays(i).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "</td>" + "</tr>");
			}
		%>
	</table>
</body>
</html>