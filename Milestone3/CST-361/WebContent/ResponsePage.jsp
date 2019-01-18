<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Hello <%= request.getAttribute("userID")  %>
<br><br>
Your local weather in <%= request.getAttribute("location")%> :
<br><br>


</body>
</html>