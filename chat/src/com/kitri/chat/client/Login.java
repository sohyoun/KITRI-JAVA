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
		
		//Login창에event등록
		nameTf.addActionListener(this);
		ok.addActionListener(this);
		cancel.addActionListener(this);
		
		//Chat창 event 등록
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
		//Paper창 event 등록
		paper.cancel.addActionListener(this);
		paper.ok.addActionListener(this);
		paper.answer.addActionListener(this);
		//Rename창 event 등록
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
//		400|변경할대화명
		String newname = rename.newname.getText().trim();
		rename.newname.setText("");
		if(newname.length()<3) { // 대화명이 3글자이상이어야함.
			JOptionPane.showMessageDialog(this, "대화명은 3자이상입니다.", "대화명오류", JOptionPane.WARNING_MESSAGE);
			return;
		}
		myid = newname;
		//기존에 있는 이름이면 있는이름이라고 오류 떠야함.
		sendMessage(ChatConstance.CS_RENAME+"|"+newname);
//		viewMessage(newname+"으로 대화명 변경");
		rename.setVisible(false);
	}
	
	
//	1. to, msg 받아라 (유효성검사 - to가 null인지/msg가 null인지/msg초기화)
//	2. server 전송
//	3. paper 창 close (초기화)
	private void paperProcess() {
		//1.
		String from = myid;
		String to = chat.whom.getText();
		if(to.isEmpty()) {
			JOptionPane.showMessageDialog(chat, "대상자를 선택하세요.","대상자오류",JOptionPane.ERROR_MESSAGE);
			return;
		}
		if(to.equals(myid)) {
			JOptionPane.showMessageDialog(chat, "자신에게 메세지를???","대상자오류",JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		paper.from.setText(myid);
		paper.to.setText(to);
		paper.setVisible(true);
	
	}
	
	
	private void paperSendProcess() {
//		server에게 msg 전송
		//paperProcess의 to와 msg 가져옴
		String to = paper.to.getText();
		String msg = paper.letter.getText();
		sendMessage(ChatConstance.CS_PAPER+"|"+to+"|"+msg);
		viewMessage(to+"에게 메세지 보냄 : "+msg);
//		paper 창 close
		paper.setVisible(false);
		
	}
	
	private void paperAnswerProcess() {
		String to = paper.from.getText();
		String from = paper.from.getText();
//		String amsg = "------------답장---------------\n";
//		paper.letter.append(amsg);
		String msg = paper.letter.getText();
		sendMessage(ChatConstance.CS_PAPER+"|"+to+"|"+msg);
		viewMessage(to+"에게 메세지 보냄 : "+msg);
//		paper.card.show(paper.cardp, "ok");
		paper.setVisible(false);	
	}

//	1.server에게 나간다고 말해주기
//	2.
	private void closeProcess() {
		sendMessage(ChatConstance.CS_DISCONNECT+"|");
		
	}
	
//	1.list에서 대상 get
//	2.메세지 get (유효성검사 대상자,자신,메세지)
//	3.대상에게 메세지 전송
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
			JOptionPane.showMessageDialog(chat, "대상자를 선택하세요.","대상자오류",JOptionPane.ERROR_MESSAGE);
			return;
		}
		if(to.equals(myid)) {
			JOptionPane.showMessageDialog(chat, "자신에게 귓속말을???","대상자오류",JOptionPane.INFORMATION_MESSAGE);
			return;
		}
//		3.
		sendMessage(ChatConstance.CS_TO+"|"+to+"|"+msg);
		viewMessage("★"+to+"★"+msg);
		
	}

	
//	1. 메세지 get (유효성검사)
//	2. server로 메세지 전송
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

	
//	1.ip,대화명 get(유효성검사(대화명 3자 이상.))
//	2.1의 ip를 이용해서 Socket 생성.
//	3.IO(BufferedReader,OutputStream) 생성.
//	4.login창 닫고, chat창 열기.
//	5.server에 메세지 전송.()
//	6.Thread 실행(Runnable implements)
	private void connectProcess() {
		String ip = ipTf.getText().trim();
		myid = nameTf.getText().trim();
		if(myid.length()<3) { // 대화명이 3글자이상이어야함.
			JOptionPane.showMessageDialog(this, "대화명은 3자이상입니다.", "대화명오류", JOptionPane.WARNING_MESSAGE);
			return;
		}
		
		try {
			socket = new Socket(ip, ChatConstance.PORT);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = socket.getOutputStream();
			this.setVisible(false);
			chat.setVisible(true);
			sendMessage(ChatConstance.CS_CONNECT+"|"+myid);
			new Thread(this).start();//run메소드 돌림.
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private void sendMessage(String msg) {
		try {
			out.write((msg+"\n").getBytes());//끝에 enter를 반드시 보내야한다.
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
				System.out.println("서버가 보낸 메세지 : "+msg);//protocol|메세지형식...
				StringTokenizer st = new StringTokenizer(msg,"|");//tokenizer로 protocol 뽑아냄
				int protocol = Integer.parseInt(st.nextToken());
				switch(protocol) {
					case ChatConstance.SC_CONNECT : {
//						100|접속자대화명.
						String tmp = st.nextToken();
						viewMessage("[알림]"+tmp+"님이 접속하셨습니다.");
						
						chat.listData.add(tmp);//chat창의 Jlist는 add안됨. Vector 이용해야함.
						//vector에 적용시킨것을 list에 적용시켜야함.
						chat.list.setListData(chat.listData);
						
					}break;
					case ChatConstance.SC_MESSAGE : {//각자의 창
//						200|[안효인] 안녕하세요...
//						200|☆안효인☆안녕???
						String tmp = st.nextToken();//[안효인] 안녕하세요...
						viewMessage(tmp);
						
						
					}break;
					case ChatConstance.SC_PAPER : {
//						300|보낸사람대화명|메세지
						//메세지 받음
						String from = st.nextToken();
						String tmp = st.nextToken();
						paper.from.setText(from);
						paper.to.setText(myid);
						paper.letter.setText(tmp);
						viewMessage(from+"에게 메세지 받음 : "+tmp);
						//밑에 버튼을 답장으로
						paper.card.show(paper.cardp, "answer");
						paper.setVisible(true);
					
					}break;
					case ChatConstance.SC_RENAME : {
//						400|변경전대화명|변경후대화명
						String oldname = st.nextToken();
						String newname = st.nextToken();
						int i = chat.listData.indexOf(oldname);
						chat.listData.set(i, newname);
						chat.list.setListData(chat.listData);
						viewMessage(oldname+"은 "+newname+"으로 변경되었습니다.");
						
					}break;
					case ChatConstance.SC_DISCONNECT : {
//						900|나가는 사람
						String tmp = st.nextToken();
						if(!tmp.equals(myid)) { //나빼고 다른사람들
							viewMessage("[알림]"+tmp+"님이 접속을 종료하였습니다.");
							chat.listData.remove(tmp);//list에서 tmp에 해당한 vector 지움.
							chat.list.setListData(chat.listData);//list에다 적용
						} else { // 나일때
							//thread 닫음
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
//	맨날 append하고 setCaretPosition 하기 귀찮으니 method로
	private void viewMessage(String msg) {
		chat.area.append(msg+"\n");//엔터 넣어줘야지 밑으로 내려감.
		chat.area.setCaretPosition(chat.area.getDocument().getLength());//scrollbar자동으로 내림.
	}

}
