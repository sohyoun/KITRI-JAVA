package com.kitri.util.jcf;

import java.util.*;

public class PlayerList {
	//Vector와 ArrayList의 차이 (기능은 거의 같다고 보면 된다.)
	//Vector는 synchronized(동기화)되어서 thread 할때 순서가 완벽히 보장된다.(빨리 처리되는 것 상관 없이 순서 지킴)
	//그에 반해 ArrayList는 동기화되지 않아서 순서가 완벽히 보장되진 않지만 훨씬 빠르다.(더 빨리 처리되는 것 먼저 처리)
	//ArrayList를 더 많이쓴다. (거의 100%) ArrayList도 거의 완벽에 가깝기 때문. 또한 동기화를 나중에 프로그래밍으로 처리 가능
//	List<PlayDto> list = new ArrayList<PlayDto>();
	List<PlayDto> list = new Vector<PlayDto>(); // 결과는 같다. 

	
	private void playerRegister(PlayDto playDto) {
		list.add(playDto);
	}
	
	private void playerList() {
		System.out.println("========== 두산 베어스 팀명단 ==========");
		System.out.println("--------------------------------------");
		int size = list.size();
		for (int i = 0; i < size; i++) {

			System.out.println(list.get(i));
		}
	}
	
	private PlayDto playerSearch(int number) {
		PlayDto playDto = null;
		int size = list.size();
		for (int i = 0; i < size; i++) {
			PlayDto dto = list.get(i);
			if(number == dto.getNumber()) {
				playDto = dto;
				break;
			}
		}
		return playDto;
	}
	
	private void playerInfo(PlayDto playDto) {
		if(playDto != null)
			System.out.println(playDto);
		else
			System.out.println("이런 선수 없습니다.");
	}
	
	public static void main(String[] args) {
		PlayerList pl = new PlayerList();
		
		
		pl.playerRegister(new PlayDto(24, "오재원", 4, 0.321));
		pl.playerRegister(new PlayDto(13, "허경민", 5, 0.351));
		pl.playerRegister(new PlayDto(34, "린드블럼", 1, 0.001));
		pl.playerRegister(new PlayDto(9, "페르난데스", 3, 0.421));
		pl.playerRegister(new PlayDto(38, "김대한", 7, 0.384));

		pl.playerList();
		
		//번호갖고 선수 정보 뽑아내기
		int number = 28;
		System.out.println(number + "번 선수 정보!!!");
		PlayDto playDto = pl.playerSearch(number);
		pl.playerInfo(playDto);
		
		number = 13;
		double score = 0.357;
		System.out.println(number+"번 선수가 안타!!! 타율이 "+score+"로 변경");
		playDto = pl.playerSearch(number);
		playDto.setGrade(score);//List 안에는 Data가 저장되는 것이 아니라 Data의 주소값이 저장됨
		pl.playerInfo(playDto);
		
	}
}
