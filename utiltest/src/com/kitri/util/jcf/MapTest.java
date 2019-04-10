package com.kitri.util.jcf;

import java.util.*;

public class MapTest {
	public static void main(String[] args) {
		//HashMap�� Hashtable
		//Hashtable�� ����ȭ �Ǿ�����
		//key���� ������ data�� �ٲ�� ����
		
//		Map<String, PlayDto> map = new HashMap<String, PlayDto>();//k���� Object DT/ V���� Value
		Map<String, PlayDto> map = new Hashtable<String, PlayDto>();
		
		//Map�� key�� �߿��ϴ�. key�� ���� ���� ���� ����Ⱑ �ȴ�.
		//���� ���ȣ�� ���� ����� �������� �տ� ������ �ٿ� �����Ѵ�. (���ȿ��� ���ȣ�� �ߺ� X)
		map.put("DS24", new PlayDto(24, "�����", 4, 0.321));
		map.put("DS9", new PlayDto(9, "�丣������", 3, 0.421));
		map.put("KW24", new PlayDto(24, "�ں�ȣ", 3, 0.431));
		map.put("HH19", new PlayDto(19, "���ٿ�", 7, 0.321));
		
		int size =map.size();
		System.out.println("��� �ο� : "+ size);
		
		int number = 24;
		System.out.println("�λ��� " + number + "���� ���� ����!!");
		PlayDto playDto = map.get("DS"+number);
		System.out.println(playDto); // Map�� ���� ������� key���� ����ؾ��Ѵ�.
									 // Map�ȿ��� �ּҰ��� �����.(�ּҰ�=key��)
		
		//Map�� �������� ����������� return�� �� Collection�̴�.
		//values()�� ��� ���� ���´�. return�� Collection
		//keySet()�� ��� key���� Set���� ���´�.
		
	}
}
