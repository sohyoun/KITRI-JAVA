import java.awt.*;

public class IsATest extends Frame{ //���� �� Ŭ������ frame�̴�. ����� ��¥�� frame�̴� ��� ����
	//Frame f = new Frame("Is A Test!!!"); //���� �Ƚᵵ��.
	Button b = new Button("@������@");

	public IsATest() {		
		super("Is A Test!!!"); //��ӹ޾Ƽ� Frame Title ������ super �̿�.
		setLayout(new FlowLayout());		
		add(b); //�׷��� ������ f.�Ⱥٿ��� ��. ��� this. �پ���ϴµ� ���� ����.
		setSize(400,300);
		setLocation(300,200);
		setVisible(true);

	}

	public static void main(String[] args) {
		IsATest iat = new IsATest();
	}
}
