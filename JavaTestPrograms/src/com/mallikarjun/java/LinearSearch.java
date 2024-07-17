package com.mallikarjun.java;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		// read size of array

		System.out.println("Enter size of an array: ");
		int n = in.nextInt(); 
		// create array with required size
		int []arr = new int[n];		

		// read elements into array
		System.out.println("Enter elements of array: ");
		for(int i=0; i< n; i++)
		{			
			int temp = in.nextInt();
			arr[i] = temp;
		}
		// read key to search
		System.out.println("Enter key to be found: ");
		int key = in.nextInt(); 

		//  user defined way
		int pos = findKeyLinearSearch(arr, arr.length, key);

		if(pos != -1)
			System.out.println("Found "+ key+ " at position: "+ pos);
		else
			System.out.println("Key is not available in array!!");

		in.close();
	}



	// find key element using linear search
	private static int findKeyLinearSearch(int[] arr, int length, int key) {
		// TODO Auto-generated method stub
		int foundAt = -1;
		for(int i=0; i< length; i++)
		{
			if(arr[i] == key)
			{
				foundAt = i+1;
			}
		}
		return foundAt;
	}

}
