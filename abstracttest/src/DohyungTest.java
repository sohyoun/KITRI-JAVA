public class DohyungTest {
	public static void main(String[] args) {
		Rect r1 = new Rect(4,5);

		System.out.println("���ΰ� "+r1.width+", ���ΰ� "+r1.height+"�� �簢���� ���̴� "
			+r1.getArea()+"�̰� �ѷ��� "+r1.getRound()+" �Դϴ�.");

		Circle c1 = new Circle(4);

		System.out.println("�������� "+c1.r+"�� ���� ���̴� "+c1.getArea()+
			"�̰� �ѷ���"+c1.getRound()+"�Դϴ�.");

		//Dohyung d = new Dohyung(); >> ������.

		/*
		Dohyung d1 = new Rect(4,3);//Rect ó���� super ���� >Dohyung �������, Dohyung super> Object �������
								   //d�� ���� Dohyung�� ����.
		System.out.println("���ΰ� "+d1.width+", ���ΰ� "+d1.height+"�� �簢���� ���̴� "
			+d1.getArea()+"�̰� �ѷ��� "+d1.getRound()+" �Դϴ�.");
			//>>������. why? Dohyung���� width,height�� ���� ����
			//getArea�� getRound�� ����X why? Rect class�� getArea,getRound�� ����Ǿ��ֱ� ����
		*/

		Dohyung d1 = new Rect(4,3);
		System.out.println("������ ���̴�"+d1.getArea()+"�̰� �ѷ��� "+d1.getRound()+" �Դϴ�.");
		//> ���� width,height�� ���� �� ������ getArea�� getRound�� ���Ҽ� �մ�.

		//Rect r2 = d1;//������. ���� Ŭ���� dohyung�� ����Ŭ���� Rect�� ������� �� ����.
						//��� ������ �簢���� �ƴϱ� ����

		Rect r2 = (Rect) d1; //���� �ٲ���� �Ѵ�.
		System.out.println("���ΰ� "+r2.width+", ���ΰ� "+r2.height+"�� �簢���� ���̴� "
			+r2.getArea()+"�̰� �ѷ��� "+r2.getRound()+" �Դϴ�.");

		//Circle c2 = (Circle)d1; //������ ������ ���� X
		//>>������ �����غ��� ����. d1���� Object,Dohyung,Rect�� ���� Circle�� ��� �ּҰ��� ������ �� ����.
		//>>Class cast Exception : Class�� ����ȯ �� �� ����.


		
	}
}
