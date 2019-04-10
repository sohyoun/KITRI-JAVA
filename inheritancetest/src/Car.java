public class Car {
		String carName;
		String color;
		String maker;
		int speed;

		public Car() {
			this("�Ÿ","������","����");
		} 
		
		public Car(String color) { 
			this("�Ÿ",color,"����");
		}

		public Car(String carName,String color) {
			this(carName,color,"����");
		}

		public Car(String carName,String color, String maker) {
			//super();//��������.Ŭ���� ����ϱ� ���ؼ� �ݵ�� �޸� �ö󰡾���. 
					  //�޸� �ö󰡴� ������ ������ ȣ��Ǵ� ����. new�Ҷ�! 
					  //��� Ŭ������ �ֻ��� Ŭ������ object �̰� �װ��� ȣ���ϴ� ���� super�̴�.
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
			return maker + "���� ���� " + color + " " + carName;
		}
		*/

		@Override
		public String toString() { //object class�� method�� override
			return maker + "���� ���� " + color + " " + carName;
		}

		@Override
		public boolean equals (Object obj){//Object�� �޾ƾ���. t3�� ��.
			Car car = (Car)obj; // Object ������ Car�� �ٲ㼭 carName �޾ƿ;���.
						   //�� �� Car�� Object�� ���������� ������ ������ ���� ���� ����ȯ�ؾ���.
			//if (carName == car.carName)) //""�� ���� true,new String("")�� ���� false ����.
			if (carName.equals(car.carName))//���� Object �񱳴� ==���� equals�� �ϴ� ���� ����.
				return true; //if ���� �����ϸ� true
			return false;//�ƴϸ� false
		}
}
