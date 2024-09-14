package com.mallikarjun.java.strings;

import java.util.Scanner;

public class StringTesHackerRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner in = new Scanner(System.in);
	     String test = in.nextLine();
	        		
		//String test = new String("madam");
		StringBuffer temp = new StringBuffer(test);
		temp.reverse();
		if(test.contains(temp))
		{
			System.out.println("TRUE");
		}
		else System.out.println("FALSE");
			
		in.close();
		
		int n = test.length();
		int count = 0;
		for(int i=0; i < n; i++){
			/*
			 * if(test.charAt(i) == 'A' || test.charAt(i) == 'a' || test.charAt(i) == 'E' ||
			 * test.charAt(i) == 'e' || test.charAt(i) == 'I' || test.charAt(i) == 'i' ||
			 * test.charAt(i) == 'O' || test.charAt(i) == 'o' || test.charAt(i) == 'U' ||
			 * test.charAt(i) == 'u' ) { count++; }
			 */

			  if( test.charAt(i) == 'a' || test.charAt(i) == 'e' || test.charAt(i) == 'i' ||
			   test.charAt(i) == 'o' ||  test.charAt(i) == 'u' ) { 
				  count++; }
			 
		}
		System.out.println(count);
	}

}
