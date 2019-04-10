package com.kitri.chat.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;
import java.util.Vector;

import com.kitri.chat.util.ChatConstance;

public class ChatServer implements Runnable{ //여기서 thread 돌아야함 상속받거나 implements해야함. implements를 하자
	ServerSocket ss;//전역변수여야함.
	Vector<ChatClient> list = new Vector<ChatServer.ChatClient>();//<>안의 chatserver는 지워도 상관x
	
	public ChatServer() { //첫번째로 여기서 서버소켓 열고 thread 돌리면 client들어오고 그럼 innerclass 들어오고 inout 하고 다시 thread
		
		try {
			ss = new ServerSocket(ChatConstance.PORT);//1. 
			System.out.println("클라이언트 접속 대기중....");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void run() {//접속처리...
		while(true) {//thread가 무한루프로 프로그램 종료 전까지 계속 되어야함.
			//client 기다림
			try {
				Socket socket = ss.accept();
				System.out.println("클라이언트 접속 성공 : "+socket);//클라이언트 접속 성공
				new ChatClient(socket).start();//client접속할때 마다 chatclient 생성 : 대화를 왔다갔다 할 수 있다. // 예가 thread임.
				//결국
				//client 들어오자마가 inout 들어오고 그러자마자 thread 돌림.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	class ChatClient extends Thread{ //inner class : 이 클래스 안에선 밖에 있는 class를 자유자제로 쓸 수 있다.
						//여기도 thread해야함. 여기는 정보를 받는거라 extends해서 thread
						//메세지 처리
		String name; //대화명
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
		public void run() {//메세지처리...
			boolean flag = true;
			while(flag) {
				try {
					String msg = in.readLine();
					System.out.println("클라이언트가 보낸 메세지 : "+msg);//protocol|메세지형식...
					StringTokenizer st = new StringTokenizer(msg,"|");//tokenizer로 protocol 뽑아냄
					int protocol = Integer.parseInt(st.nextToken());
					switch(protocol) {
						case ChatConstance.CS_CONNECT : {
//								100|안효인
							name = st.nextToken();//안효인
//							int size = list.size();
//							for(int i=0;i<size;i++) {
//								ChatClient cc = list.get(i);
//							}
							multicast(ChatConstance.SC_CONNECT+"|"+name);
							list.add(this);//나를 list에 추가.
							for(ChatClient cc : list) {//나를 포함한 모든 사람들
								unicast(ChatConstance.SC_CONNECT+"|"+cc.name);//나에게 list안의 모든사람들 이름을 출력. 나에게 보내는 것이니 그냥 out.write이다. 또한 모든 사람들의 이름 보내는 것이니 cc.name
							}
						}break;
						case ChatConstance.CS_ALL : {
//							200|안녕하세요...
							String tmp = st.nextToken(); //안녕하세요...
							multicast(ChatConstance.SC_MESSAGE+"|["+name+"] "+tmp);//200|[안효인] 안녕하세요...
							
						}break;
						case ChatConstance.CS_TO : {
//							250|홍길동|안녕??
							String to = st.nextToken();//홍길동
							String tmp = st.nextToken();//안녕
//							홍길동한테만 안녕 보냄
							for(ChatClient cc : list) {
								if(cc.name.equals(to)) { //이름이 홍길동이랑 같다면
									cc.unicast(ChatConstance.SC_MESSAGE+"|☆"+name+tmp);//cc(귓속말상대에게) 전달
									break;
								}
							}
						}break;
						case ChatConstance.CS_PAPER : {
//							300|대상자|메세지
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
//							400|변경할대화명
							String newname = st.nextToken();
							multicast(ChatConstance.SC_RENAME+"|"+name+"|"+newname);
							name = newname;
							
						}break;
						case ChatConstance.CS_DISCONNECT : {
//							900|
							//모든사람들에게 내가 종료했다고 뿌리기
							multicast(ChatConstance.SC_DISCONNECT+"|"+name);//여기선 나한테도 종료한다고 간다.
							//list에서 나를 빼기
							list.remove(this);//나 이기 때문에 그냥 remove 해도 된다.(for문X)
							//thread빠져나오기(=while문 빠져나오기) / 그냥 break하면 switch case 빠져나가기 때문에 flag를 잡은것 
							flag = false;
							//in,out,socket close
							in.close();
							out.close();
							socket.close(); // in,out,socket이 null이었으면 애초에 위에서 걸렸을 것이기 때문에 여기선 if문 쓸 필요 X
							//while문 flag바껴서 끝날 꺼고 run method 끝날 것이고 그것은 thread가 끝나는 것
						}break;
					
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		private void multicast(String msg) { // 모든사람들에게 msg 뿌리기
											////향상된 for문 // 이 for문 안에는 나 는 없다. 나를 제외한 모든 사람들
			for(ChatClient cc : list) {//전체에 뿌려줌
				cc.unicast(msg);//200|[안효인] 안녕하세요...
								//cc안에 들어있는 (나는 아직 없음)모든 사람들에게 안효인이 들어왔다고 말함(name : 나)
			}
		}
		
		private void unicast(String msg)  {//특정사람한테 msg 뿌리기
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
		new Thread(new ChatServer()).start(); // 3줄을 1줄로 익명
	}

	
}
