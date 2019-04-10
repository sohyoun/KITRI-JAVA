package com.kitri.util.jcf;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		System.out.println("list size ==" + list.size());
		list.add("허경민");
		list.add("정수빈");
		list.add("박건우");
		list.add("김재환");
		System.out.println("list size ==" + list.size());
		
		System.out.println("--- 두산의 타순 ---");
//		String str[] = list.toArray(new String[0]);
//		int len = list.size();
//		for (int i = 0; i < len; i++) {
//			System.out.println(i+1+"번 타자 : "+str[i]);
//		}
		
		int size = list.size();
		for (int i = 0; i < size; i++) { //list는 get을 이용해서 i번째를 뽑을 수 있다.
			System.out.println(i+1+"번 타자 : "+list.get(i));
		}
		
		String name ="정수빈";
//		int im = list.indexOf(name); //indexOf로 특정Object가 몇번째 있는지 찾을 수 있다. DTO 환경에서는 쓸 수없다.
//		System.out.println(name + "은 "+(im+1)+"번 타자입니다.");
		for(int i=0;i<size;i++) {
			if(list.get(i).equals(name)) {
				System.out.println(name + "은 "+(i+1)+"번 타자입니다.");
				break;
			}
		}
		
		String name2 ="오재원";
//		list.set(im, name2);//set으로 i번째 있는 element를 다른 것으로 바꿀 수 있다.
		System.out.println(name + "을 "+name2+"로 교체");
//		for (int i = 0; i < size; i++) { 
//			System.out.println(i+1+"번 타자 : "+list.get(i));
//		}
		for(int i=0;i<size;i++) {
			if(list.get(i).equals(name)) {
				list.set(i, name2);
				System.out.println(i+1+"번 타자 : "+list.get(i));
				break;
			}
		}
	}
}
