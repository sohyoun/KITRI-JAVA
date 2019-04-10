import java.awt.*;
import java.awt.event.*;

public class InterfaceTest extends Frame implements WindowListener,ActionListener{
											//다중 implements 가능
	Button b1 = new Button("@눌러봐@");

	public InterfaceTest() {		
		super("Interface Test!!!"); 
		setLayout(new FlowLayout());		
		add(b1);
		setBackground(new Color(250,210,210));
		setSize(400,300);
		setLocation(300,200);
		setVisible(true);
		
		//WindowListener wl = new InterfaceTest(); 
		addWindowListener (this);//감시자 버튼 누르면 감지해서 실행시켜줌.
		b1.addActionListener(this);//감시할 객체는 이 클래스이다. this
		

	}
	//WindowListener를 implements하면 그안의 메소드 7개를 다 override해야함.
	//많은 method중 하나만 쓸 수 있음으로 아답타가 있다.
	public void windowDeactivated(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {System.exit(0);}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
	//반드시 구현해야할 method가 하나밖에 없는 것은 아답타를 만들 필요가 없다.
	public void actionPerformed(ActionEvent e){
		int r = (int)(Math.random() * 256);
		int g = (int)(Math.random() * 256);
		int b = (int)(Math.random() * 256);
		setBackground(new Color(r,g,b));
		}

	public static void main(String[] args) {
		InterfaceTest iat = new InterfaceTest();
	}


}
