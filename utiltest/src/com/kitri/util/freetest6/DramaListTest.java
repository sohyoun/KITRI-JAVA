package com.kitri.util.freetest6;

import java.util.ArrayList;
import java.util.List;

public class DramaListTest {

	public static void main(String[] args) {
		List<Drama> list = new ArrayList<Drama>();
				
		list.add(new Drama("�� �ܿ�, �ٶ��� �д�.","SBS","�����","���μ�","������"));
		list.add(new Drama("����� ����","MBC","�ּ���"));
		list.add(new Drama("���̸���2","KBS","ǥ�μ�","����","�̴���"));
		list.add(new Drama("�ְ�� �̼���","KBS","������",null,"������"));
		
		System.out.println("����\t��ۻ�\t����\t����\t����");
		System.out.println("--------------------------------------");
		int size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.println(list.get(i));
		}
	}
	
}