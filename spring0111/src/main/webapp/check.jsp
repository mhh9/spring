<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body> 
 	<%
 	String id = request.getParameter("id");
 	String password = request.getParameter("password");
 	String name = request.getParameter("name");
 	String tel = request.getParameter("tel");
 	%>
 	����� �Է��� id�� <%= id %><br>
 	����� �Է��� password�� <%= password %><br>
 
 
</body>
</html>