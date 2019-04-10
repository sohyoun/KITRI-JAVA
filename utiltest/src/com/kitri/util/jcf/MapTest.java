package com.kitri.util.jcf;

import java.util.*;

public class MapTest {
	public static void main(String[] args) {
		//HashMap과 Hashtable
		//Hashtable은 동기화 되어있음
		//key값이 같으면 data가 바뀌어 버림
		
//		Map<String, PlayDto> map = new HashMap<String, PlayDto>();//k에는 Object DT/ V에는 Value
		Map<String, PlayDto> map = new Hashtable<String, PlayDto>();
		
		//Map은 key가 중요하다. key에 같은 값이 들어가면 덮어쓰기가 된다.
		//따라서 등번호가 같은 사람이 있음으로 앞에 팀명을 붙여 구분한다. (팀안에서 등번호는 중복 X)
		map.put("DS24", new PlayDto(24, "오재원", 4, 0.321));
		map.put("DS9", new PlayDto(9, "페르난데스", 3, 0.421));
		map.put("KW24", new PlayDto(24, "박병호", 3, 0.431));
		map.put("HH19", new PlayDto(19, "정근우", 7, 0.321));
		
		int size =map.size();
		System.out.println("등록 인원 : "+ size);
		
		int number = 24;
		System.out.println("두산의 " + number + "번의 선수 정보!!");
		PlayDto playDto = map.get("DS"+number);
		System.out.println(playDto); // Map은 내가 집어넣은 key값을 기억해야한다.
									 // Map안에는 주소값이 저장됨.(주소값=key값)
		
		//Map은 순서없이 집어넣음으로 return할 때 Collection이다.
		//values()는 모든 값을 얻어온다. return값 Collection
		//keySet()는 모든 key값을 Set으로 얻어온다.
		
	}
}
