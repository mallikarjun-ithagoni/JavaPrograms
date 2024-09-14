package com.mallikarjun.java;

public class Prime {

	public void checkPrime(int ...args)
	{
		System.out.println();
		for(int i=0; i<args.length; i++) {
			int n = args[i];
			boolean p = true;
			
			if(n<=1)
				p = false;
			
			for(int j=2; j < n; j++) {
				if(n%j == 0)
				{
					p = false;
				}
			}
			
			if(p == true)
			{
				System.out.print(n+ " ");
			}
		}
	}
}
