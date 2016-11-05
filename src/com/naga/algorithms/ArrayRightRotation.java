package com.naga.algorithms;

public class ArrayRightRotation
{

	static int[] rightRotate(int[] a, int n, int k)
	{
		int temp[] = new int[a.length];
		
		
		for(int i=n-1;i>=0;i--)
		{
			if(i-k>=0)
			{
				temp[i] = a[i-k];
			}
			else
			{
				temp[i] = a[n+(i-k)];
			}
		}
		
		return temp;
	}
	
	public static void main(String args[])
	{
		int a[]= {1,2,7,6,5};
		
		int n = a.length;
		
		int noOfRotations = 1;
		
		a = rightRotate(a, n, noOfRotations);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
	}
}
