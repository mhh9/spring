package com.kgitbank.mvc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

	//�ڵ� import ctrl+shift+o
	public void insert(String id, String pw, String name, String tel) throws Exception {

		//Model(m)
		//1. ����̹� ����
		Class.forName("com.mysql.jdbc.Driver"); //void�� �޼��� ���������ε� ��
		//view(v)
		System.out.print("1. ����̹� ���� ����!");

		//2. DB����
		String url="jdbc:mysql://localhost:3307/spring"; //������ db
		String user="root"; //id
		String password="1234"; //password
		Connection con  = DriverManager.getConnection(url, user, password); //���� ����� ���� Driver manager�� 3���� ������ db�� ��������
		//return���� 
		System.out.print("2. DB���� ����!");

		//3. SQL����
		String sql = "insert into member values (?,?,?,?)"; //sql
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.print("3. SQL���� ����!");

		//4. SQL����
		ps.executeUpdate();
		System.out.print("4. SQL���ۼ���!");

	}
	public void delete(String id) throws Exception {

		//Model(m)
		//1. ����̹� ����
		Class.forName("com.mysql.jdbc.Driver"); //void�� �޼��� ���������ε� ��
		//view(v)
		System.out.print("1. ����̹� ���� ����!");

		//2. DB����
		String url="jdbc:mysql://localhost:3307/spring"; //������ db
		String user="root"; //id
		String password="1234"; //password
		Connection con  = DriverManager.getConnection(url, user, password); //���� ����� ���� Driver manager�� 3���� ������ db�� ��������
		//return���� 
		System.out.print("2. DB���� ����!");

		//3. SQL����
		String sql = "delete from member where id = ?"; //sql
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);

		System.out.print("3. SQL���� ����!");

		//4. SQL����
		ps.executeUpdate();
		System.out.print("4. SQL���ۼ���!");

	}
	public MemberDTO select(String id) throws Exception {

		//Model(m)
		//1. ����̹� ����
		Class.forName("com.mysql.jdbc.Driver"); //void�� �޼��� ���������ε� ��
		//view(v)
		System.out.print("1. ����̹� ���� ����!");

		//2. DB����
		String url="jdbc:mysql://localhost:3307/spring"; //������ db
		String user="root"; //id
		String password="1234"; //password
		Connection con  = DriverManager.getConnection(url, user, password); //���� ����� ���� Driver manager�� 3���� ������ db�� ��������
		//return���� 
		System.out.print("2. DB���� ����!");

		//3. SQL����
		String sql = "select * from member where id = ?"; //sql
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);

		System.out.print("3. SQL���� ����!");

		
		//4. SQL����
		ResultSet rs = ps.executeQuery();
		MemberDTO dto2 = null;
		//curd�߿��� r���ٸ� //��ȯ�Ǵ� ���� �޾���
		if(rs.next()) {//�˻� ����� �ִ��� üũ:true
			String gid = rs.getString(1);//id, ù��° Į���� �����
			String pw = rs.getString(2); 
			String name = rs.getString(3);
			String tel = rs.getString(4);

			System.out.println(gid);
			System.out.println(pw);
			System.out.println(name);
			System.out.println(tel);
			
			dto2 = new MemberDTO();
			dto2.setId(gid);
			dto2.setPw(pw);
			dto2.setName(name);
			dto2.setTel(tel);
		}	
		System.out.print("4. SQL���ۼ���!");

		return dto2;

	}
}
