<%@page import="java.util.List"%>
<%@page import="com.kgitbank.mvc04.BbsDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div><jsp:include page="top2.jsp"></jsp:include></div>

	<div id="total">
		<!-- ž �޴� ���� �κ� -->
		<div id="top">
			<jsp:include page="top.jsp"></jsp:include>
		</div>
		<!-- ��ٱ��� ������ų ��  -->
		<div id="top2">
			<jsp:include page="top2.jsp"></jsp:include>
		</div>

		<div id="content">
			<table border="1" bordercolor="red">
				<tr>
					<td>���̵�</td>
					<td width="100" id="t1">${dto.id}</td>
					</tr>
					<tr>
					<td>����</td>
					<td width="100" id="t1">${dto.title}</td>
					</tr>
					<tr>
					<td>�Խñ�</td>
					<td width="150" id="t2">${dto.content}</td>
					</tr>
					<tr>
					<td>�ۼ���</td>
					<td width="200" id="t3">${dto.writer}</td>
				</tr>
				
			</table>

		</div>

	</div>

</body>
</html>