<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="insert">
		���̵� <input type="text" name="id"><br>
		��й�ȣ <input type="text" name="pw"><br>
		�̸�<input type="text" name="name"><br>
		��ȭ��ȣ<input type="text" name="tel"><br>
		<input type="submit" value="������ ����">
	</form>
	<hr color="red">
	
	<form action="select">
		���̵� <input type="text" name="id"><br>
		<input type="submit" value="���̵�� �˻�">
	</form>
	
	<hr color="red">
	<form action="delete">
		���̵� <input type="text" name="id"><br>
		<input type="submit" value="id�� ����">
	</form>
	
</body>
</html>