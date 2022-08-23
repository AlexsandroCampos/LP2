<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exercício 4</title>
</head>
<body>
	<table border='1' style="margin-top: 10px;">
		<% 
			for(int i = 0; i<=10; i++) { 
				out.print("<tr>" + "<td>" + "10" + "</td>" + "<td>" + " * " + "</td>" +  "<td>" + i + "</td>"  + "<td>" + "=" + "</td>"  + "<td>" + i*10 + "</td>" + "</tr>");
			}
		%>
	</table>
	
	<table border="1" style="margin-top: 10px;">
		<% 
			for(int i = 0; i<=10; i++) { 
				out.print("<tr>" + "<td>" + "12" + "</td>" + "<td>" + " * " + "</td>" +  "<td>" + i + "</td>"  + "<td>" + "=" + "</td>"  + "<td>" + i*12 + "</td>" + "</tr>");
			}
		%>
	</table>
	
	<table border="1" style="margin-top: 10px;">
		<% 
			for(int i = 0; i<=10; i++) { 
				out.print("<tr>" + "<td>" + "14" + "</td>" + "<td>" + " * " + "</td>" +  "<td>" + i + "</td>"  + "<td>" + "=" + "</td>"  + "<td>" + i*14 + "</td>" + "</tr>");
			}
		%>
	</table>
	
	<table border="1" style="margin-top: 10px;">
				<% 
			for(int i = 0; i<=10; i++) { 
				out.print("<tr>" + "<td>" + "16" + "</td>" + "<td>" + " * " + "</td>" +  "<td>" + i + "</td>"  + "<td>" + "=" + "</td>"  + "<td>" + i*16 + "</td>" + "</tr>");
			}
		%>
	</table>
	
	
</body>
</html>