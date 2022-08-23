<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exercício 2</title>
</head>
<body>
	<%! 
		
	
		public ArrayList<Integer> armazenar() { 
			ArrayList<Integer> lista = new ArrayList<Integer>();
			for(int i = 1; i <= 10000; i++) {
				if(i % 5 == 0) {
					lista.add(i);
				}
			}
			
			return lista;
		}
	%>
	
	<table>
		<% 
			for(Integer i = 0; i < armazenar().size(); i++) {
				out.print("<tr>" + "<td>" + armazenar().get(i) + "</td>" + "</tr>");
			}
		%>
	</table>
	
	
</body>
</html>