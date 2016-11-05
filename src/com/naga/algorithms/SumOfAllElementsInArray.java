package com.naga.algorithms;

import java.util.stream.IntStream;


public class SumOfAllElementsInArray
{

	public static void main(String[] args)
	{
		int array[] = {4,5,6,7,8,9,3,-42, 10};
		
		int size = array.length;
		
		int java8Sum = IntStream.of(array).sum();
		
		
		// we can reduce half iterations with this method but still the complexity is O(N)
		
		
		
		int sum = 0;
		for(int i=0;i<size/2;i++)
		{
			if(i==size-1-i)
			{
				sum = sum+array[i];
			}
			else
			{
				sum = sum+array[i]+array[size-1-i];
			}
		}
		
		if(size%2!=0)
		{
			sum = sum + array[size/2];
		}

		System.out.println("sum of all elements are "+ sum);
		System.out.println("sum of all elements using java8 is "+ java8Sum);
	}

}
