<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="java.time.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%! 
		List<String> inputs = List.of("dia", "mes", "ano"); 
		List<Integer> valores = new ArrayList<>();
	%>
	<%
		for(String input : inputs) {
			if(request.getParameter(input).isBlank()) {
				response.sendRedirect(request.getContextPath() + "/data.jsp");
				break;
			}
			
			try {
				valores.add(Integer.parseInt(request.getParameter(input)));
			}
			
			catch(Exception e) {
				response.sendRedirect(request.getContextPath() + "/data.jsp");
				break;
			}
			
			
		}
		LocalDate hoje = LocalDate.now();
	
		if(valores.size() == 3) {
			hoje = LocalDate.of(valores.get(2), valores.get(1), valores.get(0));
		}
	
		
		
		
		
		
		
		
	%>
	
	<table>

			<%
			if(valores.size() == 3) {
				for(int i=1; i<=10; i++) {
					out.print("<tr><td> " + hoje.minusDays(i) + "</td></tr>");
				}
			}
				
			%>

	</table>
</body>
</html>