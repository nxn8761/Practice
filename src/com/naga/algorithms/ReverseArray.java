package com.naga.algorithms;

import java.util.Scanner;

public class ReverseArray
{

	public static void main(String[] args)
	{
		int arr[] = {4,5,6,7,8,9,10};
		
		int n = arr.length;
		
	        int temp = 0;
	        for(int i=0;i<arr.length/2;i++)
	        {
	            temp = arr[i];
	            arr[i] = arr[n-1-i];
	            arr[n-1-i] = temp;
	        }
	        
	          for(int i=0; i < n; i++){
	          System.out.print(arr[i] + " ");
	        }

	}

}
