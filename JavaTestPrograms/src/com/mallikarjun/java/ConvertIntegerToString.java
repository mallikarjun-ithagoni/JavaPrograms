package com.mallikarjun.java;

import java.util.Scanner;

public class ConvertIntegerToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number to convert: ");
		int num = in.nextInt();
		
		String s = Integer.toString(num);
		System.out.println("String after conversion: "+s);
		
		in.close();
	}

}
