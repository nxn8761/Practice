package com.naga.algorithms;

public class MissingNumber
{

	/** solution 1 */
	public static void main(String args[])
	{
		
		int arr[] = {1,2,3,5};
		
		int n = arr.length+1;
		
		System.out.println("from Method1..." + methodOne(arr,n));
		
		System.out.println("from Method2..." + methodTwo(arr,n));
		
	}
	
	static int methodOne(int arr[], int n)
	{
		//sum of all numbers  = (n* (n+1)) / 2;
		
		int expectedSum = (n* (n+1)) / 2;
		
		int originalSum =  0;
		
		for(int i=0;i<arr.length;i++)
		{
			originalSum += arr[i];
		}
		
		int missingElement  = expectedSum - originalSum ;
		
		return missingElement;
	}
	
	/** solution 2 - assume that array is sorted */
	static int methodTwo(int arr[], int n)
	{
		int missingElement = 0;
		int diff = 0;
		for(int i=0;i<arr.length;i++)
		{
			diff = arr[i+1]-arr[i];
			if(diff!=1)
			{
				missingElement = arr[i]+1;
				break;
			}
		}
		
		return missingElement;
	}
}
