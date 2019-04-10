import java.awt.*;
import java.awt.event.*;

public class AbstractTest3 extends Frame{
	
	Button b = new Button("@눌러봐@");

	public AbstractTest3() {		
		super("Is A Test!!!"); 
		setLayout(new FlowLayout());		
		add(b); 
		setSize(400,300);
		setLocation(300,200);
		setVisible(true);
		//4.자신의 생성자를 이용
		//WindowAdapter를 자기 자신 생성자 이용하고싶다. 
		//하지만 추상클래스는 자신의 생성자 이용해 객체 생성 불가능.
		//new 하고 싶다면 모든 method를 override 해야함 > 말이 안됨.
		//WindowAdapter 는 추상클래스인데 method를 봤더니 추상메소드 X 
		//의미상의 abstract class  : 추상클래스인데 실제 추상메소드가 없는 것
		//그 class의 method 중 아무거나 하나이상만 override 하면 됨.
		//**1회성 method임.>>동적으로 객체를 구현한다!
		WindowAdapter wl = new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		};
		addWindowListener(wl);

	}

	public static void main(String[] args) throws Exception{
		AbstractTest3 iat = new AbstractTest3();
	}

}
