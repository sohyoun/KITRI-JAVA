import java.awt.*;
import java.awt.event.*;

public class InterfaceTest extends Frame implements WindowListener,ActionListener{
											//���� implements ����
	Button b1 = new Button("@������@");

	public InterfaceTest() {		
		super("Interface Test!!!"); 
		setLayout(new FlowLayout());		
		add(b1);
		setBackground(new Color(250,210,210));
		setSize(400,300);
		setLocation(300,200);
		setVisible(true);
		
		//WindowListener wl = new InterfaceTest(); 
		addWindowListener (this);//������ ��ư ������ �����ؼ� ���������.
		b1.addActionListener(this);//������ ��ü�� �� Ŭ�����̴�. this
		

	}
	//WindowListener�� implements�ϸ� �׾��� �޼ҵ� 7���� �� override�ؾ���.
	//���� method�� �ϳ��� �� �� �������� �ƴ�Ÿ�� �ִ�.
	public void windowDeactivated(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {System.exit(0);}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
	//�ݵ�� �����ؾ��� method�� �ϳ��ۿ� ���� ���� �ƴ�Ÿ�� ���� �ʿ䰡 ����.
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
