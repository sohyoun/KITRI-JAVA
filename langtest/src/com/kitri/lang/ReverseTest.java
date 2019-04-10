package com.kitri.lang;
import java.io.UnsupportedEncodingException;
public class ReverseTest {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		//charAt
		String str = "!!! avaJ olleH";
		int len = str.length();
		int en1=0;
		for (int i= len-1;i>=0;i--) {
			System.out.print(str.charAt(i));
			if (str.charAt(i)=='e') {
				en1=i;
			}
		}
		System.out.println();
		System.out.println("e�� "+(len-en1)+"��° �ֽ��ϴ�.");
		
		
		//getbytes
		byte b[] = str.getBytes();
		len = b.length;
		String bstr="";
		for (int i = len-1; i >=0; i--) {
			bstr+=(char)b[i];
			
		}
		System.out.println(bstr);
		
		//tochararray
		char c[] = str.toCharArray();
		len = c.length;
		int en2=0;
		for(int i = len-1; i >= 0; i--) {
			System.out.print(c[i]);
			if (c[i]=='e') {
				en2=i;
			}
		}
		System.out.println();
		System.out.println("e�� "+(len-en2)+"��° �ֽ��ϴ�.");
		
		//substring
		int en3=0;
		for(int i = len; i >= 1; i--) {
			String result = str.substring(i-1,i);
			if (result.equals("e")) {
				en3=i;
			}
			System.out.print(result); 
		}
		System.out.println();
		System.out.println("e�� "+(len-en3+1)+"��° �ֽ��ϴ�.");
		
		
		
	
		//e�� 2��° �ս��ϴ�.
		
	}
}
