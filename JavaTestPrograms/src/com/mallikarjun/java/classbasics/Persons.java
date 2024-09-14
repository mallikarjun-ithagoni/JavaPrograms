package com.mallikarjun.java.classbasics;

import java.util.Scanner;


/*
 * The `this` keyword can be used to call another constructor in the same class.
*
True
False
 */

public class Persons{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner in = new Scanner(System.in);
	     String tempName = in.nextLine();
	     int tempAge = in.nextInt();
	        
	     Person person = new Person(tempName, tempAge);
	     System.out.println("Person Name is "+ person.getName() + " and he is "+person.getAge()+" years old");
	     
	     in.close();
	
	}
}