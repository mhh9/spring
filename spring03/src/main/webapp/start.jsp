<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/out.css">
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
	//jquery�� �̿��� �ž�.
	//body�κ��� ���� �а� �ڹ� ��ũ��Ʈ�� ��������ּ���! function����
	$(function() {
		//input�� �Է��� �� ������ ������
		//var inputValue = $('input').val() //type������ ����. 
		//alert('�Էµ� ����'+inputVal)
		var idValue = $('#id').val() //id�� �޴� ��� #id�̸�
		alert('�ԷµǾ� �ִ� id�� '+ idValue)
		
		var pwValue  = $('#pw').val()
		alert('�ԷµǾ� �ִ� pw�� '+ pwValue)
		
		//Ŭ������ .�� ����Ѵ�.
		//var ClassValue = $('.in')
	});
	
</script>
</head>
<body>
������ 3���� �Դϴ�.<br>
���̵� �Է�: <input type="text" name="id" value="root" id="id" class="in"><br>
�н����� �Է�: <input type="text" name="pw" value="1234" id="pw" class="in">
</body>
</html>