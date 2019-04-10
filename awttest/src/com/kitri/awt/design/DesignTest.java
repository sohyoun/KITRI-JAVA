package com.kitri.awt.design;

import java.awt.*;
//Window> preference> java >organize importes���� 
//number to imports�� 3���� �ٲ�\
//���� package�� class3�� �̻� ���� *�� �ٲ�
//cntl+shift+o : �˾Ƽ� import����

/*
 1. Frame ���
 2. ����ο� �ʿ��� ��ü ����
 3. ��ġ�ο��� design (Component ��ġ)
 **�׻� �۾��� ���� �� >> ū �� ������
 */
public class DesignTest extends Frame{
//		�����
	Panel pN = new Panel();
	Panel pS = new Panel(); //panel�� ���� default�� ����
	
	Label l = new Label("�Է�", Label.CENTER);//label�� �Ѳ����� ����
	TextField tf = new TextField();
	Button send = new Button("����");
	
	TextArea ta = new TextArea();
	
	Choice ch = new Choice();//Choice�� default ������ �ۿ� ����
	Button exit = new Button("����");
	
	public DesignTest() {
		super("Design Test !!!");
//		��ġ��
//		panel�� default�� flowlayout
		setLayout(new BorderLayout(0,10));
//		flowlayout�� defaultũ��ۿ� �ȵ����� borderlayout�����(����� ���� ŭ)
//		LayoutManager lm = new BorderLayout();
//		pN.setLayout(lm);
		pN.setLayout(new BorderLayout(10,0));//�͸����� ��ü ����/������ BorderLayout(int hgap,int vgap) : ���̻��� ���� ���⼱ hgap�� ��
		l.setBackground(new Color(150,210,210));//����
//		l.setForeground(new Color(100,30,70));//���ڻ�(������)
		l.setForeground(Color.magenta);//���ڻ�(static field ���)
		Font f = new Font("����",Font.BOLD, 20);
		l.setFont(f);
		pN.add(l,"West");
		pN.add(tf,"Center");
		send.setFont(f);
		pN.add(send,"East");
		
//		pS�� �� ��ư�� ũ�� �������� Gridelayout
		pS.setLayout(new GridLayout(1, 2, 10, 0));
//		choice�� �� �ֱ�
		ch.add("����");
		ch.add("���,��õ");
		ch.add("����");
		ch.add("��û");
		
		pS.add(ch);
		pS.add(exit);
		exit.setFont(f);
		//frame�� default�� borderlayout
		
		add(pN, "North");
		add(ta, "Center");
		add(pS, BorderLayout.SOUTH);
		
		//�׻� �������� setVisible!
//		setSize(300, 500);
//		setLocation(300, 200);
		setBounds(300, 200, 300, 500);//setSize�� setLocation��ģ��
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new DesignTest(); //�͸�ü����(�ش� Ŭ������ �޼ҵ� ���� �߰��� ȣ�� �� �ʿ䰡 ���� ������ ����)
		
	}
}
