public class Car {
	String carName;
	String color;
	String maker;
	int speed; //전역변수

	//public Car(){} : default 생성자가 내부적으로 숨어있음

	public void speedUp() {
		speed += 10;

	}

	public void speeddown() {
		speed -= 10;
		if (speed <0)//if문 밑에 코드가 1줄일 경우 {}생략가능
			stop();//객체.method여야 하는데 
				   //같은 class안에 있으면 변수,method는 그냥 쓸 수 있다.
	}

	public void stop() {
		speed = 0;
	}
}
