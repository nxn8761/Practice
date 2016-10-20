package com.naga.algorithms;

public class FibonacciSeries
{

	public static void main(String args[])
	{

		int n = 10;
		usingRecursion(n);
		System.out.println(" ");
		withoutRecursion(n);

	}

    static void usingRecursion(int n)
    {
		for (int i = 1; i < n; i++)
		{
			System.out.print(fibonacci(i) + " ");
		}
    }
	
	static int fibonacci(int n)
	{
		if (n == 1 || n == 2)
			return 1;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	static void withoutRecursion(int n)
	{
		int n1=1, n2=1, n3;
		System.out.print(n1 + " "+ n2 + " ");
		for(int i=1;i<n-2;i++)
		{
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			System.out.print(n3 + " ");
		}
	}

}