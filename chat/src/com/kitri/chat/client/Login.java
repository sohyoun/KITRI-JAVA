package com.kitri.chat.client;

import java.awt.event.*;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.StringTokenizer;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


import com.kitri.chat.util.ChatConstance;

public class Login extends JFrame implements ActionListener,Runnable,ListSelectionListener{
	
	Socket socket;
	String myid;
	BufferedReader in;
	OutputStream out;
	
	JLabel ip;
	JLabel name;
	JTextField ipTf;
	JTextField nameTf;
	JButton cancel;
	JButton ok;
	
	Chat chat;
	Paper paper;
	Rename rename;

	public Login() {
		super("Login!!");
		initGUI();
		
		chat = new Chat();
		paper = new Paper();
		rename = new Rename();
		
		//Loginâ��event���
		nameTf.addActionListener(this);
		ok.addActionListener(this);
		cancel.addActionListener(this);
		
		//Chatâ event ���
		chat.globalsend.addActionListener(this);
		chat.whomsend.addActionListener(this);
		chat.paper.addActionListener(this);
		chat.rename.addActionListener(this);
		chat.exit.addActionListener(this);
		chat.list.addListSelectionListener(this);
		chat.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				closeProcess();
			}
		});
		//Paperâ event ���
		paper.cancel.addActionListener(this);
		paper.ok.addActionListener(this);
		paper.answer.addActionListener(this);
		//Renameâ event ���
		rename.ok.addActionListener(this);
		rename.cancel.addActionListener(this);
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			getContentPane().setBackground(new java.awt.Color(244,243,242));
			{
				ip = new JLabel();
				getContentPane().add(ip);
				ip.setText("\uc544\uc774\ud53c");
				ip.setBounds(12, 12, 60, 30);
				ip.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
				ip.setFocusable(false);
				ip.setRequestFocusEnabled(false);
				ip.setHorizontalAlignment(SwingConstants.CENTER);
			}
			{
				name = new JLabel();
				getContentPane().add(name);
				name.setText("\ub300\ud654\uba85");
				name.setBounds(12, 47, 60, 30);
				name.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
				name.setFocusable(false);
				name.setRequestFocusEnabled(false);
				name.setHorizontalAlignment(SwingConstants.CENTER);
			}
			{
				ipTf = new JTextField();
				getContentPane().add(ipTf);
				ipTf.setBounds(78, 12, 209, 30);
			}
			{
				nameTf = new JTextField();
				getContentPane().add(nameTf);
				nameTf.setBounds(78, 47, 209, 30);
			}
			{
				ok = new JButton();
				getContentPane().add(ok);
				ok.setText("\ub85c\uadf8\uc778");
				ok.setBounds(83, 83, 61, 32);
				ok.setBackground(new java.awt.Color(237,236,233));
				ok.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
			}
			{
				cancel = new JButton();
				getContentPane().add(cancel);
				cancel.setText("\ucde8 \uc18c");
				cancel.setBounds(153, 83, 59, 32);
				cancel.setBackground(new java.awt.Color(237,236,233));
				cancel.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
			}
			pack();
			this.setSize(303, 150);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Login inst = new Login();
				inst.setLocationRelativeTo(null);
				inst.setResizable(false);
				inst.setVisible(true);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if(ob == nameTf || ob == ok) {
			connectProcess();
		} else if(ob == cancel) {
			System.exit(0);
		} else if(ob == chat.globalsend) {
			globalsendProcess();
		} else if(ob == chat.whomsend) {
			whomsendProcess();
		} else if(ob == chat.paper) {
			paperProcess();
		} else if(ob == paper.ok) {
			paperSendProcess();
		} else if(ob == paper.cancel) {
			paper.setVisible(false);
			paper.letter.setText("");
		} else if(ob == paper.answer) {
			paperAnswerProcess();
		} else if(ob == chat.rename) {
			rename.oldname.setText(myid);
			renameProcess();
		} else if(ob == rename.ok) {
			renameSendProcess();
		} else if(ob == rename.cancel) {
			rename.setVisible(false);
			rename.newname.setText("");
		} else if(ob == chat.exit) {
			closeProcess();
		} 
	}
	

	@Override
	public void valueChanged(ListSelectionEvent e) {
		String selName = chat.list.getSelectedValue();
		chat.whom.setText(selName);
	}
	

	private void renameProcess() {
		rename.oldname.setText(myid);
		rename.setVisible(true);
	}
	
	private void renameSendProcess() {
//		400|�����Ҵ�ȭ��
		String newname = rename.newname.getText().trim();
		rename.newname.setText("");
		if(newname.length()<3) { // ��ȭ���� 3�����̻��̾����.
			JOptionPane.showMessageDialog(this, "��ȭ���� 3���̻��Դϴ�.", "��ȭ�����", JOptionPane.WARNING_MESSAGE);
			return;
		}
		myid = newname;
		//������ �ִ� �̸��̸� �ִ��̸��̶�� ���� ������.
		sendMessage(ChatConstance.CS_RENAME+"|"+newname);
//		viewMessage(newname+"���� ��ȭ�� ����");
		rename.setVisible(false);
	}
	
	
//	1. to, msg �޾ƶ� (��ȿ���˻� - to�� null����/msg�� null����/msg�ʱ�ȭ)
//	2. server ����
//	3. paper â close (�ʱ�ȭ)
	private void paperProcess() {
		//1.
		String from = myid;
		String to = chat.whom.getText();
		if(to.isEmpty()) {
			JOptionPane.showMessageDialog(chat, "����ڸ� �����ϼ���.","����ڿ���",JOptionPane.ERROR_MESSAGE);
			return;
		}
		if(to.equals(myid)) {
			JOptionPane.showMessageDialog(chat, "�ڽſ��� �޼�����???","����ڿ���",JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		paper.from.setText(myid);
		paper.to.setText(to);
		paper.setVisible(true);
	
	}
	
	
	private void paperSendProcess() {
//		server���� msg ����
		//paperProcess�� to�� msg ������
		String to = paper.to.getText();
		String msg = paper.letter.getText();
		sendMessage(ChatConstance.CS_PAPER+"|"+to+"|"+msg);
		viewMessage(to+"���� �޼��� ���� : "+msg);
//		paper â close
		paper.setVisible(false);
		
	}
	
	private void paperAnswerProcess() {
		String to = paper.from.getText();
		String from = paper.from.getText();
//		String amsg = "------------����---------------\n";
//		paper.letter.append(amsg);
		String msg = paper.letter.getText();
		sendMessage(ChatConstance.CS_PAPER+"|"+to+"|"+msg);
		viewMessage(to+"���� �޼��� ���� : "+msg);
//		paper.card.show(paper.cardp, "ok");
		paper.setVisible(false);	
	}

//	1.server���� �����ٰ� �����ֱ�
//	2.
	private void closeProcess() {
		sendMessage(ChatConstance.CS_DISCONNECT+"|");
		
	}
	
//	1.list���� ��� get
//	2.�޼��� get (��ȿ���˻� �����,�ڽ�,�޼���)
//	3.��󿡰� �޼��� ����
	private void whomsendProcess() {
//		1.
		String msg = chat.whomsend.getText().trim();
		chat.whomsend.setText("");
		if(msg.isEmpty()) {
			return;
		}
//		2.
		String to = chat.whom.getText();
		if(to.isEmpty()) {
			JOptionPane.showMessageDialog(chat, "����ڸ� �����ϼ���.","����ڿ���",JOptionPane.ERROR_MESSAGE);
			return;
		}
		if(to.equals(myid)) {
			JOptionPane.showMessageDialog(chat, "�ڽſ��� �ӼӸ���???","����ڿ���",JOptionPane.INFORMATION_MESSAGE);
			return;
		}
//		3.
		sendMessage(ChatConstance.CS_TO+"|"+to+"|"+msg);
		viewMessage("��"+to+"��"+msg);
		
	}

	
//	1. �޼��� get (��ȿ���˻�)
//	2. server�� �޼��� ����
	private void globalsendProcess() {
//		1.
		String msg = chat.globalsend.getText().trim();
		chat.globalsend.setText("");
		if(msg.isEmpty()) {
			return;
		}
//		2.
		sendMessage(ChatConstance.CS_ALL+"|"+msg);
		
	}

	
//	1.ip,��ȭ�� get(��ȿ���˻�(��ȭ�� 3�� �̻�.))
//	2.1�� ip�� �̿��ؼ� Socket ����.
//	3.IO(BufferedReader,OutputStream) ����.
//	4.loginâ �ݰ�, chatâ ����.
//	5.server�� �޼��� ����.()
//	6.Thread ����(Runnable implements)
	private void connectProcess() {
		String ip = ipTf.getText().trim();
		myid = nameTf.getText().trim();
		if(myid.length()<3) { // ��ȭ���� 3�����̻��̾����.
			JOptionPane.showMessageDialog(this, "��ȭ���� 3���̻��Դϴ�.", "��ȭ�����", JOptionPane.WARNING_MESSAGE);
			return;
		}
		
		try {
			socket = new Socket(ip, ChatConstance.PORT);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = socket.getOutputStream();
			this.setVisible(false);
			chat.setVisible(true);
			sendMessage(ChatConstance.CS_CONNECT+"|"+myid);
			new Thread(this).start();//run�޼ҵ� ����.
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private void sendMessage(String msg) {
		try {
			out.write((msg+"\n").getBytes());//���� enter�� �ݵ�� �������Ѵ�.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		boolean flag = true;
		while(flag) {
			try {
				String msg = in.readLine();
				System.out.println("������ ���� �޼��� : "+msg);//protocol|�޼�������...
				StringTokenizer st = new StringTokenizer(msg,"|");//tokenizer�� protocol �̾Ƴ�
				int protocol = Integer.parseInt(st.nextToken());
				switch(protocol) {
					case ChatConstance.SC_CONNECT : {
//						100|�����ڴ�ȭ��.
						String tmp = st.nextToken();
						viewMessage("[�˸�]"+tmp+"���� �����ϼ̽��ϴ�.");
						
						chat.listData.add(tmp);//chatâ�� Jlist�� add�ȵ�. Vector �̿��ؾ���.
						//vector�� �����Ų���� list�� ������Ѿ���.
						chat.list.setListData(chat.listData);
						
					}break;
					case ChatConstance.SC_MESSAGE : {//������ â
//						200|[��ȿ��] �ȳ��ϼ���...
//						200|�پ�ȿ�Ρپȳ�???
						String tmp = st.nextToken();//[��ȿ��] �ȳ��ϼ���...
						viewMessage(tmp);
						
						
					}break;
					case ChatConstance.SC_PAPER : {
//						300|���������ȭ��|�޼���
						//�޼��� ����
						String from = st.nextToken();
						String tmp = st.nextToken();
						paper.from.setText(from);
						paper.to.setText(myid);
						paper.letter.setText(tmp);
						viewMessage(from+"���� �޼��� ���� : "+tmp);
						//�ؿ� ��ư�� ��������
						paper.card.show(paper.cardp, "answer");
						paper.setVisible(true);
					
					}break;
					case ChatConstance.SC_RENAME : {
//						400|��������ȭ��|�����Ĵ�ȭ��
						String oldname = st.nextToken();
						String newname = st.nextToken();
						int i = chat.listData.indexOf(oldname);
						chat.listData.set(i, newname);
						chat.list.setListData(chat.listData);
						viewMessage(oldname+"�� "+newname+"���� ����Ǿ����ϴ�.");
						
					}break;
					case ChatConstance.SC_DISCONNECT : {
//						900|������ ���
						String tmp = st.nextToken();
						if(!tmp.equals(myid)) { //������ �ٸ������
							viewMessage("[�˸�]"+tmp+"���� ������ �����Ͽ����ϴ�.");
							chat.listData.remove(tmp);//list���� tmp�� �ش��� vector ����.
							chat.list.setListData(chat.listData);//list���� ����
						} else { // ���϶�
							//thread ����
							flag = false;
							//in,out,socket close
							in.close();
							out.close();
							socket.close();
							System.exit(0);
						}
					}break;
				
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
//	�ǳ� append�ϰ� setCaretPosition �ϱ� �������� method��
	private void viewMessage(String msg) {
		chat.area.append(msg+"\n");//���� �־������ ������ ������.
		chat.area.setCaretPosition(chat.area.getDocument().getLength());//scrollbar�ڵ����� ����.
	}

}
