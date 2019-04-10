package com.kitri.util;

import java.text.DecimalFormat;
import java.text.Format;

public class NumberFormatTest {
	public static void main(String[] args) {
		double number = 3563242365453.126;
		
//		0 : 자리 비면 0으로 해줌
//		# : 그냥
//		(Oracle은 0,9였음)
		Format f = new DecimalFormat("##,###,###,###,###.##");
		String num = f.format(number);
		System.out.println(num);
	}
}
