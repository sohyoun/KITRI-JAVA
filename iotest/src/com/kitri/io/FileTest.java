package com.kitri.io;

import java.io.*;

public class FileTest {
	public static void main(String[] args) {
		InputStream in =null;
		OutputStream out =null;
		try {
			File infile = new File("e:\\iotest\\hello.txt");
			in = new FileInputStream(infile);
			long length = infile.length(); // file클래스의 method length(): 파일의 길이
			byte b[] = new byte[(int)length];
			int x = in.read(b);
			String str = new String(b,0,x);//byte b[]를 string화 시킴
			System.out.println(x+"bytes read !!!");
			System.out.println(str);
			
			File outfile = new File("e:\\iotest\\hello_copy.txt");
			out = new FileOutputStream(outfile);
			out.write(b);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {//상위 Exception은 먼저 나올 수 없다.(Eclipse가 알아서 해줌)
			e.printStackTrace();
		} finally {
			try {
				if(in!=null)
					in.close();
				if(out!=null)
					out.close();//io는 무조건 열었으면 닫아야한다.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
