package constructor;

public class Car {
		String carName;
		String color;//�������� color
		String maker;
		int speed;

		public Car() {
			/*
			carName = "�Ÿ";
			color = "������";
			maker = "����";
			*/
			this("�Ÿ","������","����");
		} //��ü �ʱ�ȭ
		
		public Car(String color) { //�������� color
			/*
			carName = "�Ÿ";
			this.color = color; 
			maker = "����";
			*/
			this("�Ÿ",color,"����");
		}

		public Car(String carName,String color) {
			/*
			this.carName = carName;
			this.color = color;
			maker = "����";
			*/
			this(carName,color,"����");
		}

		public Car(String carName,String color, String maker) {
			this.carName = carName;
			this.color = color;
			this.maker = maker;
		}

		void speedUp() {
			speed+= 10;
		}

		int speedUp(int speed) { 
			this.speed += speed;
			return this.speed;
		}

		void speedDown() {
			speed-= 10;
			if (speed<0)
				stop();
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

		String info() {
			return ("���̸� : "+carName + "   ���� : " +color+"  ������ : "+maker);
		}//���ڰ��� ���� ������ this.�Ⱥٿ��� ��� ����.
}
