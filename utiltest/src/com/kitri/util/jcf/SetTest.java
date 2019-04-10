package com.kitri.util.jcf;

import java.util.*;

public class SetTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();//<>안에 Type 지정
		set.add("황선혜");
		set.add("박미래");
		set.add("이혜린");
		set.add("조윤영");
		set.add("박미래");//같은것을 썻기 때문에 덮어써짐. 따라서 set.size = 4
		System.out.println("set의 크기 : "+set.size());
		
		//.toArray() : Object 배열 안에 넣고 String으로 형변환
		Object ob[] = set.toArray();
		int len = ob.length;
		for(int i=0;i<len;i++) {
			System.out.println((String) ob[i]);
		}
		System.out.println("----------------------------------");
		//.toArray(T[] a) : 한번에 type 지정할 수 있다. size는 0으로 하면 알아서 만들어줌
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
