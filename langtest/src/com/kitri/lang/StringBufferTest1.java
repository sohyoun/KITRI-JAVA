package com.kitri.lang;

public class StringBufferTest1 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();//�� �ʱ� ũ�� 16���� �ӽ������������
		int cap = sb1.capacity(); // �ʱ� ũ�� ���ϴ� method
		//length() : ���ڿ��� �� ���ϴ� method
		System.out.println("�ʱ� ũ�� : " + cap + "\t���ڿ� �� : " + sb1.length());
		
		//StringBuffer(int capacity) : �ڱⰡ ����ũ�� ���� ����
		StringBuffer sb2 = new StringBuffer(8);//���� 8�� ����� ����(�ʱ� ũ�� : 8)
		StringBuffer sb3 = new StringBuffer("hello ");//hello �ϰ� 16���� �� ���� ����(�ʱ� ũ�� : 22)
		int cap3 = sb3.capacity();
		System.out.println("ũ�� : " + cap3 + "\t���ڿ� �� : " + sb3.length());
		//String�� �ѹ� ����� ���� �Һ��̾ concat�ص� s �ٽ� ������ hello�� ����.
		String s = "hello ";
		s.concat("java");
		System.out.println(s);//hello
		//������ StringBuffer�� �ӽ���������� ����� �������� ����� �ٷ� �ٷ� �����.
		//append() : ~�� ���̴� method
		//�������� 16�� ä���.
		System.out.println("1. sb3 == " + sb3); // hello
		sb3.append("java");
		System.out.println("2. sb3 == " + sb3); // hello java
		sb3.append(" !!!!!");
		System.out.println("3. sb3 == " + sb3);
		cap3 = sb3.capacity();
		System.out.println("ũ�� : " + cap3 + "\t���ڿ� �� : " + sb3.length());
		//�������� 16 �� ���� �� 16���� �������� �ٽ� ����
		sb3.append(" !!!!!!");
		System.out.println("4. sb3 == " + sb3);
		cap3 = sb3.capacity();
		System.out.println("ũ�� : " + cap3 + "\t���ڿ� �� : " + sb3.length());
		
		//insert(int offset, boolean b) : �������� �߰� ���ڿ��� insert
		sb3.insert(10, "@@@");
		System.out.println("5. sb3 === " + sb3);
		
		//delete(int start, int end)
		sb3.delete(10, 12);//10���� 12 ������
		System.out.println("6. sb3 === " + sb3);
		
		//deleteCharAt(int index) : index�� �ش��ϴ� ���� 1�� ����
		sb3.deleteCharAt(10);//10���� 12 ������
		System.out.println("7. sb3 === " + sb3);
		
		//indexOf(String str) : �� ���ڿ��� ���°�� �ִ°�
		
		//replace(int start, int end, String str) : start���� end�������� str�� �ٲ��
		sb3.replace(6, 10, "�ڹ�");
		System.out.println("8. sb3 === " + sb3);
		
		//reverse() : �Ųٷ�
		sb3.reverse();
		System.out.println("9. sb3 === " + sb3);
		sb3.reverse();
		
		//setCharAt(int index, char ch) : index�� �ش��ϴ� ���ڸ� ch�� �ٲ��
		sb3.setCharAt(9, '@');
		System.out.println("10. sb3 === " + sb3);
		
		//toString() : StringBuffer�� String���� �ٲ�.
		String s1 = new String(sb3);
		String s2 = sb3.toString();
		System.out.println(s2);
		
		System.out.println("---------------------------");
		
		//����
		String str = "hello �ڹ� !!!";
		String findStr ="����Ŭ";
		String replaceStr = "java";
		int where = str.indexOf(findStr);
//		System.out.println(where);
//		System.out.println(sb.length());
		if (where<0) {
			System.out.println(findStr +"�� �����ϴ�.");
		}
		else {
			StringBuffer sb = new StringBuffer(str);
			System.out.println(sb);
			sb.replace(where, where + findStr.length(), replaceStr);
			System.out.println(sb);
		}
		
		
		
		//charSequence : interface �̱� ������ implementing class�̿� 
		//���ڿ� ���� �ӽ�������� �����.
	}
}
