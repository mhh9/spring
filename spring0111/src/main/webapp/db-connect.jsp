<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	//Control(c)
	String id = request.getParameter("id");
	String pw = request.getParameter("password");
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");
	
	//Model(m)
	//1. ����̹� ����
	Class.forName("com.mysql.jdbc.Driver"); //void�� �޼��� ���������ε� ��
	//view(v)
	out.print("1. ����̹� ���� ����!");
	
	//2. DB����
	String url="jdbc:mysql://localhost:3307/spring"; //������ db
	String user="root"; //id
	String password="1234"; //password
	Connection con  = DriverManager.getConnection(url, user, password); //���� ����� ���� Driver manager�� 3���� ������ db�� ��������
	//return���� 
	out.print("2. DB���� ����!");
	
	//3. SQL����
	String sql = "insert into member values (?,?,?,?)"; //sql
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1, id);
	ps.setString(2, pw);
	ps.setString(3, name);
	ps.setString(4, tel);
	out.print("3. SQL���� ����!");
	
	//4. SQL����
	ps.executeUpdate();
	out.print("4. SQL���ۼ���!");
	
%>