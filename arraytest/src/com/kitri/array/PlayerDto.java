package com.kitri.array;

//Class�̸��� Dto,�� Vo ���δ�.
//Dto: Data Transfer Object ������ �����ִ°�ü/�Ϲ��� DTO�� ������ default���� ����
//Vo: Value Object ���� ����ִ� ��ü
//Bean: ������

public class PlayerDto {//�߱����� 643
	
	//�׻� private. �ܺο��� �����ϴ°� ������.
	private int number;//���ȣ
	private String name;//�����̸�
	private int position;//���� position
	private double grade;//�߱����������� ����
	private String positionStr[] = {"����Ÿ��","����","����","1���","2���","3���","���ݼ�","���ͼ�","�߰߼�","���ͼ�"};

	public PlayerDto(int number, String name, int position, double grade) {
		super();
		this.number = number;
		this.name = name;
		this.position = position;
		this.grade = grade;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position= position;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "PlayerDto [���ȣ=" + number + ",\t������=" + name 
				+ ",\t������=" + positionStr[position] + ",\t" + (position!=1 ? "Ÿ��":"�����") + "]";
	}
}
