package com.kitri.util.jcf;

import java.util.*;

public class CollectionTest {
	public static void main(String[] args) {
//		Collection coll = new ArrayList();
		Collection coll = new HashSet();
		System.out.println("�ʱ� ũ�� : "+ coll.size());
		coll.add("ȫ�浿");
		coll.add("�̼���");
		coll.add("������");
		coll.add("������");
//		coll.add(new Integer(10));//������ ���� �ȳ����� �ҷ��� �� Int�� String���� �ٲ��� �������� ����.
								  //���δٸ� DT�� �ִ°��� �ʿ䰡 ����
		System.out.println("������ ũ�� : "+ coll.size());//ũ�Ⱑ ���������� �ٲ�
		
		Object ob[] = coll.toArray();//String �Ұ� get����
		int len = ob.length;
		for(int i=0;i<len; i++) {
			System.out.println((String) ob[i]);
		}//Arraylist�� �����ϸ� ������ ������ �״�� ���´�.
		 //HashSet�� �����ϸ� ������ �ٲ� ���´�.
	}
}
