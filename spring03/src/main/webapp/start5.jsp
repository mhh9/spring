<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">

	$(function() {
			correct ='apple'
			$('.ans').keyup(function() {
				answer = $('.ans').val()
				if(correct == answer){
					$('.a1').text('�����Դϴ�.')
				}else{
					$('.a1').text('������ �ƴմϴ�.')
				}
			});
		});
		
	
</script>
</head>
<body>
������ 3���� �Դϴ�.<br>
�����̸� �Է�: <input type="text" name="ans" class="ans"><br>
<div class="a1" style ="color: red"></div>
</body>
</html>