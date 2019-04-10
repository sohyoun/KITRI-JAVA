package com.kitri.io;

import java.io.*;

public class BufferedReaderTest {
	public static void main(String[] args) {
		BufferedReader fin = null;//�Է��� ���ڿ��� �޾ƿ� �� �ִ°� BufferedReader�ۿ� ����
		FileWriter fw=null; // ����� ��������.FileWriter �ᵵ ��
		
		//BufferedReader ���� String������ Read �� �� �ִ�.
		//���� byte�� char ������ read �ϴ°� �� �Ⱦ�
		
		//BufferedReader ������ InputStream�� Reader,BufferedReader ������ �ؾ���
//		InputStream is = System.in;
//		Reader r= new InputStreamReader(is);
//		BufferedReader in = new BufferedReader(r);
		try {
			//���� ������ ���ٷ� ���̸�
			//system���� �о���°�
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("���� ���� �̸� : ");
			String infile = in.readLine();
			System.out.println("infile =="+infile);//readline�� enter�� �������� enter�������� �д´�. ���� enter ���� �ȵ�
			
			System.out.println("������ ���� �̸� : ");
			String outfile = in.readLine();
			fw= new FileWriter(new File(outfile));
			
			//file���� �о���� ��
			fin = new BufferedReader(new InputStreamReader(new FileInputStream(new File(infile))));
			//file ó������ ������ �о�;��ϴµ� readline�� ������������ �о��
			//���� ������ ������ ���� ��� ���پ� �о������ while���� �����.
			String str = null;
			while((str = fin.readLine())!=null) {
				System.out.println(str);
				fw.write(str+"\r\n");//�о���°��� ���� �������� �о�´� 
									 //���� �״�� write�ϸ� ���� ���� �� ���ٷ� ���̰� �ȴ�.
									 //�׷��Ƿ� �� \r\n�� �ٿ��ش�.
			}
			
			//src\\com\\kitri\\io\\FileTest.java ��� ġ�� 
			//���� ����� bin���� �� ��η� ���� file �о��
			
			//e:\\iotest\\hello.txt ��� ġ��
			//�� ����� hello.txt ���� �о��
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
