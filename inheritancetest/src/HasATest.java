import java.awt.*;

public class HasATest {

	Frame f = new Frame("Has A Test!!!"); //frame â ����
	Button b = new Button("@������@"); // button ����

	public HasATest() {
		//f.setTitle("Has A Test!!!");
		f.setLayout(new FlowLayout());
		//b.setLabel("������!!!"); // button�� �� ��
		f.add(b); //frame â�� button add ��.
		f.setSize(400,300);
		f.setLocation(300,200);
		f.setVisible(true);

	}

	public static void main(String[] args) {
		HasATest hat = new HasATest();
	}
}
