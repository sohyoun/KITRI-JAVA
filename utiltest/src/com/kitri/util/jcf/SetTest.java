package com.kitri.util.jcf;

import java.util.*;

public class SetTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();//<>�ȿ� Type ����
		set.add("Ȳ����");
		set.add("�ڹ̷�");
		set.add("������");
		set.add("������");
		set.add("�ڹ̷�");//�������� ���� ������ �������. ���� set.size = 4
		System.out.println("set�� ũ�� : "+set.size());
		
		//.toArray() : Object �迭 �ȿ� �ְ� String���� ����ȯ
		Object ob[] = set.toArray();
		int len = ob.length;
		for(int i=0;i<len;i++) {
			System.out.println((String) ob[i]);
		}
		System.out.println("----------------------------------");
		//.toArray(T[] a) : �ѹ��� type ������ �� �ִ�. size�� 0���� �ϸ� �˾Ƽ� �������
		String str[] = set.toArray(new String[0]);
		for(int i=0;i<len;i++) {
			System.out.println(str[i]);
		}
		
		System.out.println("----------------------------------");
		Iterator<String> iterate = set.iterator();
		for(int i=0;i<len;i++) {
			System.out.println(iterate.next());
		}
		System.out.println("----------------------------------");
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}
	}
}
