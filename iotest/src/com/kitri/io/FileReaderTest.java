package com.kitri.io;

import java.io.*;

public class FileReaderTest {
	public static void main(String[] args) {
		
		//fileInputStream의 character 형태 FileReader ..??
		//FileReader에는 method 없어서 상위 class의 inputStreamReader
		FileReader fr = null;
		FileWriter fw = null;
		try {
			File infile = new File("e:\\iotest\\hello.txt");
			fr = new FileReader(infile);
			long length = infile.length();
			char c[] = new char[(int) length];
			int x = fr.read(c);
			System.out.println(x + "characters read !!!");
			String str = new String(c);
			System.out.println(c);
			
			File outfile = new File("e:\\iotest\\hello_copy2.txt");
			fw = new FileWriter(outfile);
			//Write class에는 write(String str) method가 있다.
			fw.write(str); //여기까지만 하면 파일만 생성되고 아무것도 안됨. 닫질않아서
		} catch (FileNotFoundException e) {
			e.printStackTrace(); // 이건 왜쓰는거지?
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw!=null)
					fw.close();
				if(fr!=null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
