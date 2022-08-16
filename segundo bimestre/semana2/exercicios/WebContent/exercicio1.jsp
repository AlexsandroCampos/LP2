<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.time.*" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import=" java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% LocalDate date = LocalDate.now(); %>
<% String dataFormatada = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));  %>

<%= "<h1>" + dataFormatada + "</h1>" %>

	
</body>
</html>