package com.kitri.io;

import java.io.*;

public class BufferedReaderTest {
	public static void main(String[] args) {
		BufferedReader fin = null;//입력은 문자열로 받아올 수 있는게 BufferedReader밖에 없음
		FileWriter fw=null; // 출력은 문제없음.FileWriter 써도 됨
		
		//BufferedReader 에는 String값으로 Read 할 수 있다.
		//따라서 byte나 char 값으로 read 하는거 잘 안씀
		
		//BufferedReader 쓰려면 InputStream과 Reader,BufferedReader 순으로 해야함
//		InputStream is = System.in;
//		Reader r= new InputStreamReader(is);
//		BufferedReader in = new BufferedReader(r);
		try {
			//위의 세줄을 한줄로 줄이면
			//system에서 읽어오는것
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("읽을 파일 이름 : ");
			String infile = in.readLine();
			System.out.println("infile =="+infile);//readline는 enter를 기준으로 enter전까지만 읽는다. 따라서 enter 포함 안됨
			
			System.out.println("복사할 파일 이름 : ");
			String outfile = in.readLine();
			fw= new FileWriter(new File(outfile));
			
			//file에서 읽어오는 것
			fin = new BufferedReader(new InputStreamReader(new FileInputStream(new File(infile))));
			//file 처음부터 끝까지 읽어와야하는데 readline은 엔터전까지만 읽어옴
			//따라서 파일이 끝날때 까지 계속 한줄씩 읽어오도록 while문을 써야함.
			String str = null;
			while((str = fin.readLine())!=null) {
				System.out.println(str);
				fw.write(str+"\r\n");//읽어오는것이 엔터 전까지만 읽어온다 
									 //따라서 그대로 write하면 엔터 없이 쭉 한줄로 붙이게 된다.
									 //그러므로 꼭 \r\n을 붙여준다.
			}
			
			//src\\com\\kitri\\io\\FileTest.java 라고 치면 
			//현재 경로인 bin에서 쓴 경로로 들어가서 file 읽어옴
			
			//e:\\iotest\\hello.txt 라고 치면
			//쓴 경로의 hello.txt 파이 읽어옴
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw!=null)
					fw.close();
				if(fin!=null)
					fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
