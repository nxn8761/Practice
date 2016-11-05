package com.naga.hackerrank;


// https://en.wikipedia.org/wiki/Euclidean_algorithm

// L.C.M of M,N = (M * N ) / GCD of (M,N)
public class GCD
{

	public static void main(String[] args)
	{

		int[] arr = {16,32,96};
		
		int result = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			result = gcd(result,arr[i]);
		}
		
		System.out.println(result);
		
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
