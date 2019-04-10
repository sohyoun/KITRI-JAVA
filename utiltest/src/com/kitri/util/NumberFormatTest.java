package com.kitri.util;

import java.text.DecimalFormat;
import java.text.Format;

public class NumberFormatTest {
	public static void main(String[] args) {
		double number = 3563242365453.126;
		
//		0 : �ڸ� ��� 0���� ����
//		# : �׳�
//		(Oracle�� 0,9����)
		Format f = new DecimalFormat("##,###,###,###,###.##");
		String num = f.format(number);
		System.out.println(num);
	}
}
