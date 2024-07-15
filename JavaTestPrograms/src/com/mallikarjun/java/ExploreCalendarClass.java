package com.mallikarjun.java;

import java.util.Calendar;

public class ExploreCalendarClass {

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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal = Calendar.getInstance();
		System.out.println( cal.getTime()); // returns current time along with date and timezone
		
		// returns integer i.e. current year
		System.out.println( cal.get(Calendar.YEAR));
		
		// returns integer i.e. month of year
		System.out.println( cal.get(Calendar.MONTH));
		
		// returns integer i.e. date
		System.out.println( cal.get(Calendar.DATE));
		
		// returns integer i.e. day of the year 1-356
		System.out.println( cal.get(Calendar.DAY_OF_YEAR));		
		
		// returns integer i.e. date
		System.out.println( cal.get(Calendar.DAY_OF_MONTH));
		
		// returns integer for the day. 1-sunday, 2-monday ..
		System.out.println( cal.get(Calendar.DAY_OF_WEEK)); 
		
		// returns integer i.e. hour in 12hours format
		System.out.println( cal.get(Calendar.HOUR)); 
		
		// returns integer i.e. minutes
		System.out.println( cal.get(Calendar.MINUTE)); 
		
		// returns integer i.e. seconds
		System.out.println( cal.get(Calendar.SECOND)); 
		
		// returns integer i.e. maximum weeks in year
		System.out.println( cal.getMaximum(Calendar.WEEK_OF_YEAR)); 
		
		// returns integer i.e. maximum days in week
		System.out.println( cal.getMaximum(Calendar.DAY_OF_WEEK)); 
		
		// returns integer i.e. getMinimum weeks in year
		System.out.println( cal.getMinimum(Calendar.WEEK_OF_YEAR)); 
				
		// returns integer i.e. getMinimum days in week
		System.out.println( cal.getMinimum(Calendar.DAY_OF_WEEK)); 
		
		// Following instance is there to update time and test
		System.out.println("******* following are calendar updates ***********");
		/*
		 * Calendar temp = Calendar.getInstance(); temp.add(Calendar.YEAR, 2024);
		 * temp.add(Calendar.MONTH, 2); temp.add(Calendar.DATE, 3); System.out.println(
		 * getDay(temp.get(Calendar.DAY_OF_WEEK) ));
		 */
		
		System.out.println(getDayFromDate(5,8,2015) );
		
	}

}
