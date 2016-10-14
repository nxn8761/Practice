package com.naga.demos;

public class XORDemo
{

	public static void main(String[] args)
	{
		int a[]= {1,1,3,2,3};
		
		//System.out.println(5 ^ 5 ^ 3 ^ 2 ^ 6 ^ 10 ^ 2 ^ 9 ^ 3 ^ 6 ^ 6 );
		
		int unpaired = 0;
		
		for(int i=0;i<a.length;i++)
		{
			unpaired = unpaired ^ a[i];
			//System.out.println(unpaired);
		}

		System.out.println(unpaired);
	}

}
