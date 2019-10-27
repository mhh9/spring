package com.kgitbank.mvc02;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {

	@Autowired
	//�̱��水ü(��ü�� �ϳ��� ���)
	BbsDAO dao;
	
	@RequestMapping("insert2") //��û�� ��Ī�Ǹ� �ؿ��ִ� �޼��带 ������ ����
	public void insert(String id, String title, String content, String writer) throws Exception {
		System.out.println("insert��û ����");
		System.out.println("�Է��� id�� " + id);
		System.out.println("�Է��� pw�� " + title);
		System.out.println("�Է��� name�� " + content);
		System.out.println("�Է��� tel�� " + writer);
		dao.insert(id, title, content, writer);
	}
	
	@RequestMapping("delete2")
	public void delete(String id) throws Exception {

		System.out.println("delete��û ����");
		System.out.println("������ id��: " + id);
		dao.delete(id);
	}
	
	@RequestMapping("select2")
	public void select(String id, Model model) throws Exception {
		BbsDTO dto = dao.select(id);
		model.addAttribute("dto", dto);
	
	}
}
