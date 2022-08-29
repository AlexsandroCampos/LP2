<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!
		public Integer retornaSoma(ArrayList<Integer> vetor) {
			if(vetor.isEmpty()) {
				return 0;
			}
			
			if(vetor.size() == 1) {
				return vetor.get(0);
			}
			
			Integer maior = vetor.get(0);
			Integer menor = vetor.get(0);
			
			for(Integer number : vetor) {
				if(number > maior) {
					maior = number;
				}
				
				if(number < menor) {
					menor = number;
				}
			}
			
			return menor + maior;
		}
	%>
	
	<%
		out.print("<p>" + retornaSoma(new ArrayList<Integer>(List.of(100, 2, 3, 4))) + "</p>");
	%>
</body>
</html>