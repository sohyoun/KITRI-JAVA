package com.kitri.util.jcf;

import java.util.*;

public class PlayerList {
	//Vector�� ArrayList�� ���� (����� ���� ���ٰ� ���� �ȴ�.)
	//Vector�� synchronized(����ȭ)�Ǿ thread �Ҷ� ������ �Ϻ��� ����ȴ�.(���� ó���Ǵ� �� ��� ���� ���� ��Ŵ)
	//�׿� ���� ArrayList�� ����ȭ���� �ʾƼ� ������ �Ϻ��� ������� ������ �ξ� ������.(�� ���� ó���Ǵ� �� ���� ó��)
	//ArrayList�� �� ���̾���. (���� 100%) ArrayList�� ���� �Ϻ��� ������ ����. ���� ����ȭ�� ���߿� ���α׷������� ó�� ����
//	List<PlayDto> list = new ArrayList<PlayDto>();
	List<PlayDto> list = new Vector<PlayDto>(); // ����� ����. 

	
	private void playerRegister(PlayDto playDto) {
		list.add(playDto);
	}
	
	private void playerList() {
		System.out.println("========== �λ� ��� ����� ==========");
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
			System.out.println("�̷� ���� �����ϴ�.");
	}
	
	public static void main(String[] args) {
		PlayerList pl = new PlayerList();
		
		
		pl.playerRegister(new PlayDto(24, "�����", 4, 0.321));
		pl.playerRegister(new PlayDto(13, "����", 5, 0.351));
		pl.playerRegister(new PlayDto(34, "�����", 1, 0.001));
		pl.playerRegister(new PlayDto(9, "�丣������", 3, 0.421));
		pl.playerRegister(new PlayDto(38, "�����", 7, 0.384));

		pl.playerList();
		
		//��ȣ���� ���� ���� �̾Ƴ���
		int number = 28;
		System.out.println(number + "�� ���� ����!!!");
		PlayDto playDto = pl.playerSearch(number);
		pl.playerInfo(playDto);
		
		number = 13;
		double score = 0.357;
		System.out.println(number+"�� ������ ��Ÿ!!! Ÿ���� "+score+"�� ����");
		playDto = pl.playerSearch(number);
		playDto.setGrade(score);//List �ȿ��� Data�� ����Ǵ� ���� �ƴ϶� Data�� �ּҰ��� �����
		pl.playerInfo(playDto);
		
	}
}
