<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
	$(function() { //body���� �ν��ϰ�, �ڹ� ��ũ��Ʈ ����
		//Ŭ���̶�� �̺�Ʈ �߻����� �� ó�����ִ� �Լ� �ʿ� -> �����Լ� �ۼ�
		$('.btn1').click(function() {
			//��ư�� Ŭ���ϸ�, �Է��� ���� ������ �´�.
			reValue = $('.reply').val()
			wriValue = $('.writer').val()
			$.ajax({
				url : "server.do", 
				data : {
					reply : reValue,
					writer : wriValue
				},
				success : function(result){
					alert("������ ��� ����")
					$('.d1').append('<img src=resources/img/goldenretriever.jpg width=230 height=300>')
					$('.d1').append(result)
				}
			});
		});
		
		
	});
	</script>
</head>
<body>
�ۼ���<input type="text" class="writer" name="writer">
��� ����<input type="text" class="reply" name="reply">
<input type ="button" class="btn1" value="��۴ޱ�">

<div class="d1"></div>
</body>
</html>