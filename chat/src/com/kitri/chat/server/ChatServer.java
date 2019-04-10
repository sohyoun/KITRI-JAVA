package com.kitri.chat.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;
import java.util.Vector;

import com.kitri.chat.util.ChatConstance;

public class ChatServer implements Runnable{ //���⼭ thread ���ƾ��� ��ӹްų� implements�ؾ���. implements�� ����
	ServerSocket ss;//��������������.
	Vector<ChatClient> list = new Vector<ChatServer.ChatClient>();//<>���� chatserver�� ������ ���x
	
	public ChatServer() { //ù��°�� ���⼭ �������� ���� thread ������ client������ �׷� innerclass ������ inout �ϰ� �ٽ� thread
		
		try {
			ss = new ServerSocket(ChatConstance.PORT);//1. 
			System.out.println("Ŭ���̾�Ʈ ���� �����....");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void run() {//����ó��...
		while(true) {//thread�� ���ѷ����� ���α׷� ���� ������ ��� �Ǿ����.
			//client ��ٸ�
			try {
				Socket socket = ss.accept();
				System.out.println("Ŭ���̾�Ʈ ���� ���� : "+socket);//Ŭ���̾�Ʈ ���� ����
				new ChatClient(socket).start();//client�����Ҷ� ���� chatclient ���� : ��ȭ�� �Դٰ��� �� �� �ִ�. // ���� thread��.
				//�ᱹ
				//client �����ڸ��� inout ������ �׷��ڸ��� thread ����.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	class ChatClient extends Thread{ //inner class : �� Ŭ���� �ȿ��� �ۿ� �ִ� class�� ���������� �� �� �ִ�.
						//���⵵ thread�ؾ���. ����� ������ �޴°Ŷ� extends�ؼ� thread
						//�޼��� ó��
		String name; //��ȭ��
		BufferedReader in;
		OutputStream out;
		Socket socket;
		
		public ChatClient(Socket socket) {
			try {
				this.socket = socket;
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = socket.getOutputStream();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		@Override
		public void run() {//�޼���ó��...
			boolean flag = true;
			while(flag) {
				try {
					String msg = in.readLine();
					System.out.println("Ŭ���̾�Ʈ�� ���� �޼��� : "+msg);//protocol|�޼�������...
					StringTokenizer st = new StringTokenizer(msg,"|");//tokenizer�� protocol �̾Ƴ�
					int protocol = Integer.parseInt(st.nextToken());
					switch(protocol) {
						case ChatConstance.CS_CONNECT : {
//								100|��ȿ��
							name = st.nextToken();//��ȿ��
//							int size = list.size();
//							for(int i=0;i<size;i++) {
//								ChatClient cc = list.get(i);
//							}
							multicast(ChatConstance.SC_CONNECT+"|"+name);
							list.add(this);//���� list�� �߰�.
							for(ChatClient cc : list) {//���� ������ ��� �����
								unicast(ChatConstance.SC_CONNECT+"|"+cc.name);//������ list���� ������� �̸��� ���. ������ ������ ���̴� �׳� out.write�̴�. ���� ��� ������� �̸� ������ ���̴� cc.name
							}
						}break;
						case ChatConstance.CS_ALL : {
//							200|�ȳ��ϼ���...
							String tmp = st.nextToken(); //�ȳ��ϼ���...
							multicast(ChatConstance.SC_MESSAGE+"|["+name+"] "+tmp);//200|[��ȿ��] �ȳ��ϼ���...
							
						}break;
						case ChatConstance.CS_TO : {
//							250|ȫ�浿|�ȳ�??
							String to = st.nextToken();//ȫ�浿
							String tmp = st.nextToken();//�ȳ�
//							ȫ�浿���׸� �ȳ� ����
							for(ChatClient cc : list) {
								if(cc.name.equals(to)) { //�̸��� ȫ�浿�̶� ���ٸ�
									cc.unicast(ChatConstance.SC_MESSAGE+"|��"+name+tmp);//cc(�ӼӸ���뿡��) ����
									break;
								}
							}
						}break;
						case ChatConstance.CS_PAPER : {
//							300|�����|�޼���
							String to = st.nextToken();
							String tmp = st.nextToken();
							for(ChatClient cc : list) {
								if(cc.name.equals(to)) {
									cc.unicast(ChatConstance.SC_PAPER+"|"+name+"|"+tmp);
									break;
								}
							}
							
						}break;
						case ChatConstance.CS_RENAME : {
//							400|�����Ҵ�ȭ��
							String newname = st.nextToken();
							multicast(ChatConstance.SC_RENAME+"|"+name+"|"+newname);
							name = newname;
							
						}break;
						case ChatConstance.CS_DISCONNECT : {
//							900|
							//������鿡�� ���� �����ߴٰ� �Ѹ���
							multicast(ChatConstance.SC_DISCONNECT+"|"+name);//���⼱ �����׵� �����Ѵٰ� ����.
							//list���� ���� ����
							list.remove(this);//�� �̱� ������ �׳� remove �ص� �ȴ�.(for��X)
							//thread����������(=while�� ����������) / �׳� break�ϸ� switch case ���������� ������ flag�� ������ 
							flag = false;
							//in,out,socket close
							in.close();
							out.close();
							socket.close(); // in,out,socket�� null�̾����� ���ʿ� ������ �ɷ��� ���̱� ������ ���⼱ if�� �� �ʿ� X
							//while�� flag�ٲ��� ���� ���� run method ���� ���̰� �װ��� thread�� ������ ��
						}break;
					
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		private void multicast(String msg) { // ������鿡�� msg �Ѹ���
											////���� for�� // �� for�� �ȿ��� �� �� ����. ���� ������ ��� �����
			for(ChatClient cc : list) {//��ü�� �ѷ���
				cc.unicast(msg);//200|[��ȿ��] �ȳ��ϼ���...
								//cc�ȿ� ����ִ� (���� ���� ����)��� ����鿡�� ��ȿ���� ���Դٰ� ����(name : ��)
			}
		}
		
		private void unicast(String msg)  {//Ư��������� msg �Ѹ���
			try {
				out.write((msg+"\n").getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	public static void main(String[] args) {
//		ChatServer cs = new ChatServer();
//		Thread t = new Thread(cs);//2.
//		t.start();
		new Thread(new ChatServer()).start(); // 3���� 1�ٷ� �͸�
	}

	
}
