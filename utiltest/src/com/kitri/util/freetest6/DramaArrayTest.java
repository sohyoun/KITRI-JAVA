package com.kitri.util.freetest6;

public class DramaArrayTest {
	public static void main(String[] args) {
		Drama drama[] = new Drama[4];
		drama[0]= new Drama("그 겨울, 바람이 분다.","SBS","김규태","조인성","송혜교");
		drama[1]= new Drama("백년의 유산","MBC","주성우");
		drama[2]= new Drama("아이리스2","KBS","표민수","장혁","이다해");
		drama[3]= new Drama("최고다 이순신","KBS","윤성식","","아이유");
		
		int len = drama.length;
		int count=1;
		for (int i = 0; i < len; i++) {
			System.out.print(count+".");
			System.out.println(drama[i]);
			count++;
		}
	}
	
}
