<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.time.*" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ex1</title>
</head>
<body>
<%! LocalDate today = LocalDate.now(); %>
<table>
	<%
		for(int i = 1; i<=45; i++) {
			if(today.plusDays(i).getDayOfMonth() % 2 == 0) {
				out.print("<tr> <td>" + today.plusDays(i).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+"</tr> </td>");
			}
		}
	%>
</table>

<%= "------------------------------" %>

<table>
	<%
		for(int i = 1; i<=45; i++) {
			if(today.minusDays(i).getDayOfMonth() % 2 != 0) {
				out.print("<tr> <td>" + today.minusDays(i).format(DateTimeFormatter.ofPattern("dd/MM")) +"</tr> </td>");
			}
		}
	%>
</table>
	
</body>
</html>