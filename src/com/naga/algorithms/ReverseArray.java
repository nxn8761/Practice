package com.naga.algorithms;

import java.util.Scanner;

public class ReverseArray
{

	public static void main(String[] args)
	{
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] arr = new int[n];
	        for(int i=0; i < n; i++){
	            arr[i] = in.nextInt();
	        }
	        in.close();
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
