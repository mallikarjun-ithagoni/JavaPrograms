package com.mallikarjun.java;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number to find factorial: ");
		int number = in.nextInt();
		
		int res = factorial(number);
		System.out.println("Recursion: Factorial of "+number + " is: "+ res);
		int res2 = factorialBruteForce(number);
		System.out.println("BruteForce: Factorial of "+number + " is: "+ res2);
		
		in.close();
	}

	private static int factorial(int num) {
		// TODO Auto-generated method stub
		if(num == 0)
			return 1;
		return num * factorial(num-1);
	}
	
	private static int factorialBruteForce(int num) {
		// TODO Auto-generated method stub
		int res = 1;
		while(num >0)
		{
			res *= num;
			num--;
		}
		return res;
	}

}
