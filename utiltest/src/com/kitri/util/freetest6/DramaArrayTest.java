package com.kitri.util.freetest6;

public class DramaArrayTest {
	public static void main(String[] args) {
		Drama drama[] = new Drama[4];
		drama[0]= new Drama("�� �ܿ�, �ٶ��� �д�.","SBS","�����","���μ�","������");
		drama[1]= new Drama("����� ����","MBC","�ּ���");
		drama[2]= new Drama("���̸���2","KBS","ǥ�μ�","����","�̴���");
		drama[3]= new Drama("�ְ�� �̼���","KBS","������","","������");
		
		int len = drama.length;
		int count=1;
		for (int i = 0; i < len; i++) {
			System.out.print(count+".");
			System.out.println(drama[i]);
			count++;
		}
	}
	
}
