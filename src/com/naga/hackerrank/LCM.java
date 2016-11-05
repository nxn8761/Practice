package com.naga.hackerrank;

public class LCM
{

	// L.C.M of M,N = (M * N ) / GCD of (M,N)
	
	
	public static void main(String[] args)
	{
		
		int a[] = {2,5,6,7};
		
		
		int result  = a[0];
		
		for(int i=1;i<a.length;i++)
		{
			result = (result*a[i])/gcd(result,a[i]);
		}

		System.out.println("LCM is " +result);
	}

	
	static int gcd(int a , int b)
	{
		while(a!=b)
		{
			if(a>b)
			{
				a = a-b;
			}
			else if(a<b)
			{
				b = b-a;
			}
		}
		
		return a;
		
	}

}
