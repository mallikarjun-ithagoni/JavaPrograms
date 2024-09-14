package com.mallikarjun.java.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SplitStringInEqualLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
		//ArrayList<String> temps = new ArrayList<String>();
		//String stemp[] = new String[1000];
	
		String sample = new String("This is sample string");
		System.out.println(sample.toUpperCase());
		
		String another = "Second string";
		System.out.println(another);
		System.out.println(another.startsWith("S"));
		//System.out.println(another.);
		StringBuilder sbuilder = new StringBuilder("StringBuilder");
		sbuilder.append(", some additional string");
		System.out.println(sbuilder.toString());
		
		System.out.println("\n");
		System.out.println("\n");
		String hello = "Hello";
		StringBuffer sb = new StringBuffer(hello);
		sb.insert(5, new char[] {' ','W', 'o','r','l','d'});
		System.out.println(sb);
		System.out.println("\n");
		System.out.println("\n");
		
		
		System.out.println(hello);
		
		int k = 30;
		String big = "";
		
		for(int i=0; (i+k)<= s.length(); i++)
		{
			big += s.substring(i,i+k) +":";
		}
		
	
		System.out.println(big);
		
		String[] all = big.split(":");
		
		//System.out.println(all[0]);
	//	System.out.println(all[all.length-1]);
	
		for(int i=0;i <all.length; i++)
		{
			for(int j= i+1; j< all.length;j++)
			{
				if( all[i].charAt(0) > all[j].charAt(0) ) {
					String temp = all[i];
					all[i] = all[j];
					all[j] = temp;
				}
			}
		}
		
		System.out.println(all[0]);
		System.out.println(all[all.length-1]);
		
		/*
		 * for(int i=0;i <all.length; i++) { System.out.println(all[i]); }
		 */
	}

}
