public class Car {
		String carName;
		String color;
		String maker;
		int speed;

		public Car() {
			this("쏘나타","검정색","현대");
		} 
		
		public Car(String color) { 
			this("쏘나타",color,"현대");
		}

		public Car(String carName,String color) {
			this(carName,color,"현대");
		}

		public Car(String carName,String color, String maker) {
			//super();//생략가능.클래스 상속하기 위해선 반드시 메모리 올라가야함. 
					  //메모리 올라가는 시점은 생성자 호출되는 시점. new할때! 
					  //모든 클래스의 최상위 클래스는 object 이고 그것을 호출하는 것이 super이다.
			this.carName = carName;
			this.color = color;
			this.maker = maker;
		}
		
		int speedUp(int speed) { 
			this.speed += speed;
			return this.speed;
		}

		int speedDown(int speed) { 
			this.speed -= speed;
			if (this.speed <0)
				stop();
			return this.speed;
		}

		void stop() {
			speed= 0;
		}
		/*
		public String info() { 
			return maker + "에서 만든 " + color + " " + carName;
		}
		*/

		@Override
		public String toString() { //object class의 method를 override
			return maker + "에서 만든 " + color + " " + carName;
		}

		@Override
		public boolean equals (Object obj){//Object로 받아야함. t3이 됨.
			Car car = (Car)obj; // Object 형식을 Car로 바꿔서 carName 받아와야함.
						   //이 때 Car는 Object의 하위임으로 상위를 하위에 넣을 때는 형변환해야함.
			//if (carName == car.carName)) //""일 경우는 true,new String("")일 경우는 false 나옴.
			if (carName.equals(car.carName))//따라서 Object 비교는 ==보다 equals를 하는 것이 좋음.
				return true; //if 조건 만족하면 true
			return false;//아니면 false
		}
}
