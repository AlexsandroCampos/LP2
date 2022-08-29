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
		public int inverter(Integer number) {
			String numberString = number.toString();
			String numberFormated = new String();
			for(int i = numberString.length() - 1; i>=0; i--) {
				numberFormated = numberFormated + numberString.charAt(i);
			}
			return Integer.parseInt(numberFormated);
		}
	%>
	
	<%= inverter(321) %>

</body>
</html>