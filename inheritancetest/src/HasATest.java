import java.awt.*;

public class HasATest {

	Frame f = new Frame("Has A Test!!!"); //frame Ã¢ ¸¸µë
	Button b = new Button("@´­·¯ºÁ@"); // button ¸¸µë

	public HasATest() {
		//f.setTitle("Has A Test!!!");
		f.setLayout(new FlowLayout());
		//b.setLabel("´­·¯ºÁ!!!"); // button¿¡ ±Û ¾¸
		f.add(b); //frame Ã¢¿¡ button add ÇÔ.
		f.setSize(400,300);
		f.setLocation(300,200);
		f.setVisible(true);

	}

	public static void main(String[] args) {
		HasATest hat = new HasATest();
	}
}
