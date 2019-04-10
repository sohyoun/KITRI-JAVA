package com.kitri.array;

//Class이름에 Dto,나 Vo 붙인다.
//Dto: Data Transfer Object 데이터 보내주는객체/일반적 DTO는 생성자 default값만 갖음
//Vo: Value Object 값이 들어있는 객체
//Bean: 껍데기

public class PlayerDto {//야구게임 643
	
	//항상 private. 외부에서 접근하는거 안좋음.
	private int number;//등번호
	private String name;//선수이름
	private int position;//선수 position
	private double grade;//야구선수마다의 성적
	private String positionStr[] = {"지명타자","투수","포수","1루수","2루수","3루수","유격수","좌익수","중견수","우익수"};

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
		return "PlayerDto [등번호=" + number + ",\t선수명=" + name 
				+ ",\t포지션=" + positionStr[position] + ",\t" + (position!=1 ? "타율":"방어율") + "]";
	}
}
