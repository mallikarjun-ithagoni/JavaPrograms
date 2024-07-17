package com.mallikarjun.java;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

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

		int pos = findkeyBinarySearch(arr, arr.length, key);
		if(pos != -1)
		System.out.println("Found "+ key+ " at position: "+ pos);
		else
		System.out.println("Key is not available in array!!");

		int pos2 = Arrays.binarySearch(arr, key); // this returns index value with start pos= 0
		if(pos2 != -1)
		System.out.println("Found "+ key + " at position: "+ (pos2+1));
		else
		System.out.println("Key is not available in array!!");

		in.close();
		}

		private static int findkeyBinarySearch(int[] arr, int length, int key) {
		// TODO Auto-generated method stub
			int start , end, mid;
			int foundAt = -1;
			start = 0;
			end = length-1;
	
			while(start <= end) {
				mid = (start + end)/2;
				if(arr[mid] == key){
				foundAt = mid+1;
				break;
				}
				else if(arr[mid] > key) {
				end = mid-1;
				}
				else {
				start = mid+1;
				}
			}
			return foundAt;
	}

}
