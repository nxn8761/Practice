package com.naga.demos;

import java.util.Arrays;

public class ArraysSort
{

	public static void main(String args[])
	{
		
		/** Fill an Arry */
		
		int sampleArray[] = new int[4];
		
		
		
		
		int intArray[]={1,2,3,4,0,-1};
		
		/** Add an element to int array */
		intArray = Arrays.copyOf(intArray,intArray.length+1);
		
		intArray[6] = -7;
		
		
		char charArray[]={'b','a','u'};
		
		Arrays.sort(intArray);
		
		for(int i =0;i<intArray.length;i++)
		{
			System.out.println(intArray[i]);
		}
		
		Arrays.sort(charArray);
		
		for(int i=0;i<charArray.length;i++)
		{
			System.out.println(charArray[i]);
		}
	}
}
