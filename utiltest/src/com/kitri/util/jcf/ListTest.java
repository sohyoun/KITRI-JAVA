package com.kitri.util.jcf;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		System.out.println("list size ==" + list.size());
		list.add("����");
		list.add("������");
		list.add("�ڰǿ�");
		list.add("����ȯ");
		System.out.println("list size ==" + list.size());
		
		System.out.println("--- �λ��� Ÿ�� ---");
//		String str[] = list.toArray(new String[0]);
//		int len = list.size();
//		for (int i = 0; i < len; i++) {
//			System.out.println(i+1+"�� Ÿ�� : "+str[i]);
//		}
		
		int size = list.size();
		for (int i = 0; i < size; i++) { //list�� get�� �̿��ؼ� i��°�� ���� �� �ִ�.
			System.out.println(i+1+"�� Ÿ�� : "+list.get(i));
		}
		
		String name ="������";
//		int im = list.indexOf(name); //indexOf�� Ư��Object�� ���° �ִ��� ã�� �� �ִ�. DTO ȯ�濡���� �� ������.
//		System.out.println(name + "�� "+(im+1)+"�� Ÿ���Դϴ�.");
		for(int i=0;i<size;i++) {
			if(list.get(i).equals(name)) {
				System.out.println(name + "�� "+(i+1)+"�� Ÿ���Դϴ�.");
				break;
			}
		}
		
		String name2 ="�����";
//		list.set(im, name2);//set���� i��° �ִ� element�� �ٸ� ������ �ٲ� �� �ִ�.
		System.out.println(name + "�� "+name2+"�� ��ü");
//		for (int i = 0; i < size; i++) { 
//			System.out.println(i+1+"�� Ÿ�� : "+list.get(i));
//		}
		for(int i=0;i<size;i++) {
			if(list.get(i).equals(name)) {
				list.set(i, name2);
				System.out.println(i+1+"�� Ÿ�� : "+list.get(i));
				break;
			}
		}
	}
}
