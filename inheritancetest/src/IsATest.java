import java.awt.*;

public class IsATest extends Frame{ //이제 이 클레스는 frame이다. 결과가 어짜피 frame이니 상속 가능
	//Frame f = new Frame("Is A Test!!!"); //이제 안써도됨.
	Button b = new Button("@눌러봐@");

	public IsATest() {		
		super("Is A Test!!!"); //상속받아서 Frame Title 못쓰니 super 이용.
		setLayout(new FlowLayout());		
		add(b); //그렇기 때문에 f.안붙여도 됨. 대신 this. 붙어야하는데 생략 가능.
		setSize(400,300);
		setLocation(300,200);
		setVisible(true);

	}

	public static void main(String[] args) {
		IsATest iat = new IsATest();
	}
}
