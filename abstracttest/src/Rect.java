public class Rect extends Dohyung{ //�簢���� ���������� ��ӹ���.
								   //������ �߻�class������ �ݵ�� override�ؾ���.
	int width;
	int height;

	public Rect(int width, int height) {
		this.width=width;
		this.height = height;
	}
	
	
	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getRound() { // ������ �ο�. getRound �̸��� Ʋ���� ������. ���� class Dohyung�� method�� �̸� ���ƾ���.
		return (width + height)*2;
	}
	
}
