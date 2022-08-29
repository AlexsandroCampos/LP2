<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!
		public int quantidadeCaracteres(String string) {
			return string.length();
		}
	
		public int quantidadeConsoantes(String string) {
			string.toLowerCase();
			return string.replaceAll("a", "").replaceAll("e", "").replaceAll("i", "").replaceAll("o", "").replaceAll("u", "").length();
		}
	%>
	<%= "<p>" + quantidadeCaracteres("pizza") + "</p>" %>
	<%= "<p>" + quantidadeConsoantes("pizza") + "</p>" %>
</body>
</html>