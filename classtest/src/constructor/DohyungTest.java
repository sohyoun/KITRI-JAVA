package constructor;

public class DohyungTest {
	public static void main(String[] args) {
		Rect r1=new Rect(); 
		//default 
		//���ΰ�4�̰� ���ΰ�3�� �簢���� ���̴� 12�̰� �ѷ��� 14�Դϴ�.
		r1.calcArea();
		r1.calcRound();
		System.out.println("���ΰ� "+r1.width+"�̰� ���ΰ� "+r1.height+"�� �簢���� ���̴� "+r1.area+"�̰� �ѷ��� "+r1.round+"�Դϴ�.");
		
		int width = 5;
		int height = 3;
		Rect r2=new Rect(width,height);
		//����� ����,���� ����
		r2.calcArea(width,height);
		r2.calcRound(width,height);
		System.out.println("���ΰ� "+r2.width+"�̰� ���ΰ� "+r2.height+"�� �簢���� ���̴� "+r2.area+"�̰� �ѷ��� "+r2.round+"�Դϴ�.");
		

		Circle c1=new Circle();
		//default
		//�������� 4�� ���� ���̴� 48.xxx�̰� �ѷ��� 24.xxx�Դϴ�.
		c1.calcArea();
		c1.calcRound();
		System.out.println("�������� "+c1.radius+"�� ���� ���̴� "+c1.area+"�̰� �ѷ��� "+c1.round+"�Դϴ�.");

		int radius = 5;
		Circle c2=new Circle(radius);
		//����� ������ ����
		c2.calcArea(radius);
		c2.calcRound(radius);
		System.out.println("�������� "+c2.radius+"�� ���� ���̴� "+c2.area+"�̰� �ѷ��� "+c2.round+"�Դϴ�.");


	}
}
