import java.awt.*;
import java.awt.event.*;

public class AbstractTest3 extends Frame{
	
	Button b = new Button("@������@");

	public AbstractTest3() {		
		super("Is A Test!!!"); 
		setLayout(new FlowLayout());		
		add(b); 
		setSize(400,300);
		setLocation(300,200);
		setVisible(true);
		//4.�ڽ��� �����ڸ� �̿�
		//WindowAdapter�� �ڱ� �ڽ� ������ �̿��ϰ�ʹ�. 
		//������ �߻�Ŭ������ �ڽ��� ������ �̿��� ��ü ���� �Ұ���.
		//new �ϰ� �ʹٸ� ��� method�� override �ؾ��� > ���� �ȵ�.
		//WindowAdapter �� �߻�Ŭ�����ε� method�� �ô��� �߻�޼ҵ� X 
		//�ǹ̻��� abstract class  : �߻�Ŭ�����ε� ���� �߻�޼ҵ尡 ���� ��
		//�� class�� method �� �ƹ��ų� �ϳ��̻� override �ϸ� ��.
		//**1ȸ�� method��.>>�������� ��ü�� �����Ѵ�!
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
