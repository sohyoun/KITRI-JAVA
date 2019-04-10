package com.kitri.util.jcf;

import java.util.*;

public class CollectionTest {
	public static void main(String[] args) {
//		Collection coll = new ArrayList();
		Collection coll = new HashSet();
		System.out.println("초기 크기 : "+ coll.size());
		coll.add("홍길동");
		coll.add("이순신");
		coll.add("강감찬");
		coll.add("윤봉길");
//		coll.add(new Integer(10));//쓸때는 오류 안나지만 불러올 때 Int를 String으로 바꾸지 못함으로 오류.
								  //서로다른 DT을 넣는것은 필요가 없음
		System.out.println("마지막 크기 : "+ coll.size());//크기가 유동적으로 바뀜
		
		Object ob[] = coll.toArray();//String 불가 get없음
		int len = ob.length;
		for(int i=0;i<len; i++) {
			System.out.println((String) ob[i]);
		}//Arraylist를 참조하면 때문에 순서가 그대로 나온다.
		 //HashSet을 참조하면 순서가 바뀌어서 나온다.
	}
}
