package com.mallikarjun.java;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class ExploreNumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberFormat nf = NumberFormat.getInstance();
		int salary = 1595621;
		
		System.out.println(nf.getCurrency()); // INR
		System.out.println(nf.getCurrency().getDisplayName()); // Indian Rupee
		System.out.println(nf.format(salary));
	
		nf.setCurrency(Currency.getInstance(Locale.CHINA));
		System.out.println(nf.getCurrency()); // CNY
		System.out.println(nf.getCurrency().getDisplayName()); // Chinese Yuan
		System.out.println(nf.format(salary));
		
		nf.setCurrency(Currency.getInstance(Locale.ITALY));
		System.out.println(nf.getCurrency()); // EUR
		System.out.println(nf.getCurrency().getDisplayName()); // Euro
		System.out.println(nf.format(salary));
		
		//currency format for india is not set in number format class
		@SuppressWarnings("deprecation")
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(new Locale("en","in"));
		System.out.println(nf2.getCurrency()); // INR
		System.out.println(nf2.getCurrency().getDisplayName()); // Indian Rupee
		String s = nf2.format(salary);
		System.out.println(s);
		System.out.println("After new conversion");
		//System.out.println(getIndianCurrency(s));
	}

	private static String getIndianCurrency(String s) {
		// TODO Auto-generated method stub
	//	System.out.println(" getIndianCurrency start *********");
		// convert given string to array
		
		//String someValue= "52.23";
		//Double doubleVal = Double.parseDouble(someValue);
		//System.out.println(doubleVal);
		
		Double doubleVal = Double.parseDouble(s);
		System.out.println(doubleVal);
		//int sal2 = (int)sal;
		//s = Integer.toString(sal2);
		//System.out.println(sal);
		char givenString[] = s.toCharArray();
		//System.out.println("After array conversion: " + givenString);
		StringBuilder currency = new StringBuilder();
		int thousands , more ;
		thousands = more = 0;
		
		// start from string end to parse,
		for(int i= givenString.length-1; i>=0; i--)
		{
			if(thousands < 3)
			{
				// for thousands and below.
				currency.append(givenString[i]);
				thousands++;
				//System.out.println(givenString[i]);
			}
			else if(more<2)
			{
				// after thousands for every second place need separation.
				if(more == 0)
				{
					currency.append(",");
					currency.append(givenString[i]);
					more++;
					//System.out.println(givenString[i]);
				}
				else
				{
					currency.append(givenString[i]);
					more = 0; // this help to further processing.
					//System.out.println(givenString[i]);
				}
					
			}
		}		
		//System.out.println(currency.reverse().toString());
		return currency.reverse().toString();
	}

}
