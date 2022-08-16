<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		for(int i=0; i<=1000; i++) {
			if(i % 2 == 0)
				out.print("<h1>"+ i + "</h1>");
		}
	%>
</body>
</html>