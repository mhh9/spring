package com.kgitbank.mvc02;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

@Repository
public class BbsDAO {

	public void insert(String id, String title, String content, String writer) throws Exception {

		Class.forName("com.mysql.jdbc.Driver"); //void�� �޼��� ���������ε� ��
		System.out.print("1. ����̹� ���� ����!");

		String url="jdbc:mysql://localhost:3307/spring"; //������ db
		String user="root"; //id
		String password="1234"; //password
		Connection con  = DriverManager.getConnection(url, user, password); //���� ����� ���� Driver manager�� 3���� ������ db�� ��������
		System.out.print("2. DB���� ����!");

		//3. SQL����
		String sql = "insert into bbs values (?,?,?,?)"; //sql
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, title);
		ps.setString(3, content);
		ps.setString(4, writer);
		System.out.print("3. SQL���� ����!");

		//4. SQL����
		ps.executeUpdate();
		System.out.print("4. SQL���ۼ���!");
	}
	public void delete(String id) throws Exception {

		Class.forName("com.mysql.jdbc.Driver"); //void�� �޼��� ���������ε� ��
		System.out.print("1. ����̹� ���� ����!");

		String url="jdbc:mysql://localhost:3307/spring"; //������ db
		String user="root"; //id
		String password="1234"; //password
		Connection con  = DriverManager.getConnection(url, user, password); //���� ����� ���� Driver manager�� 3���� ������ db�� ��������
		System.out.print("2. DB���� ����!");

		//3. SQL����
		String sql = "delete from bbs where id = ?"; //sql
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);

		System.out.print("3. SQL���� ����!");

		//4. SQL����
		ps.executeUpdate();
		System.out.print("4. SQL���ۼ���!");
	}

	public BbsDTO select(String id) throws Exception {
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
				String sql = "select * from bbs where id = ?"; //sql
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, id);

				System.out.print("3. SQL���� ����!");

				
				//4. SQL����
				ResultSet rs = ps.executeQuery();
				BbsDTO dto2 = null;
				//curd�߿��� r���ٸ� //��ȯ�Ǵ� ���� �޾���
				if(rs.next()) {//�˻� ����� �ִ��� üũ:true\
					
					String gid = rs.getString(1);//id, ù��° Į���� �����
					String pw = rs.getString(2); 
					String name = rs.getString(3);
					String tel = rs.getString(4);

					System.out.println(gid);
					System.out.println(pw);
					System.out.println(name);
					System.out.println(tel);
					
					dto2 = new BbsDTO();
					dto2.setId(gid);
					dto2.setTitle(pw);
					dto2.setContent(name);
					dto2.setWriter(tel);
				}	
				System.out.print("4. SQL���ۼ���!");

				return dto2;
	}
	
}
