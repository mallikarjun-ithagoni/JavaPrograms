package com.mallikarjun.java;

import java.io.*;
import java.util.*;

public class GetDayOfTheGivenDate {
	
	/*
    * Complete the 'findDay' function below.
    *
    * The function is expected to return a STRING.
    * The function accepts following parameters:
    *  1. INTEGER month
    *  2. INTEGER day
    *  3. INTEGER year
    */

	public static String getDay(int day) {
		String nameOfDay = "";
		
		switch(day) {
		case 1:
			nameOfDay = "SUNDAY"; break;
		case 2:
			nameOfDay = "MONDAY"; break;
		case 3:
			nameOfDay = "TUESDAY"; break;
		case 4:
			nameOfDay = "WEDNESDAY"; break;
		case 5:
			nameOfDay = "THURSDAY"; break;
		case 6:
			nameOfDay = "FRIDAY"; break;
		case 7:
			nameOfDay = "SATURDAY"; break;
		}		
		return nameOfDay;
	}
	
	public static String getDayFromDate(int day, int month, int year) {
		Calendar temp = Calendar.getInstance();
		temp.set(Calendar.YEAR, year);
		temp.set(Calendar.MONTH, month-1);
		temp.set(Calendar.DATE, day);
		return getDay( temp.get(Calendar.DAY_OF_WEEK) );	
	}
	   
   public static void main(String[] args) throws IOException {
	   
	Scanner in = new Scanner(System.in);
	System.out.println("Enter year: ");
	int year = in.nextInt();
	int month = in.nextInt();
	int day = in.nextInt();
	
    String res = GetDayOfTheGivenDate.getDayFromDate(month, day, year);
    System.out.println(res);
    
    in.close();
}

}
