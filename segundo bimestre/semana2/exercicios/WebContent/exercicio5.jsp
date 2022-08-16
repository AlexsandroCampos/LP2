<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Random" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%! 
	 Random gerador = new Random();
	%>
	<table>
	<%
		for(int i=0; i<10; i++) {
				out.print("<tr>" + "<td>" + gerador.nextInt(101) + "</td>" + "</tr>");
		}
	%>
</table>
</body>
</html>