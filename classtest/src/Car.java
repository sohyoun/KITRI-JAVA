public class Car {
	String carName;
	String color;
	String maker;
	int speed; //��������

	//public Car(){} : default �����ڰ� ���������� ��������

	public void speedUp() {
		speed += 10;

	}

	public void speeddown() {
		speed -= 10;
		if (speed <0)//if�� �ؿ� �ڵ尡 1���� ��� {}��������
			stop();//��ü.method���� �ϴµ� 
				   //���� class�ȿ� ������ ����,method�� �׳� �� �� �ִ�.
	}

	public void stop() {
		speed = 0;
	}
}
