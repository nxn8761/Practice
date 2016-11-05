package com.naga.hackerrank;

import java.util.Scanner;

	public class LilysHomework {

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int a[] = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i]  = scanner.nextInt();
	        }
	        int minIndex = 0;
	        int temp  = 0;
	        int swapCount = 0;
	        boolean flag = false;
	        for(int i = 0;i<n;i++)
	         {
	            flag = false;
	            for(int j=i+1;j<n;j++)
	            {
	                if(a[i]>a[j])
	                {
	                    flag = true;
	                    minIndex = j;
	                }
	            }
	            if(flag)
	            {
	                // swap minIndex , a[i]
	                temp = a[minIndex];
	                a[minIndex] = a[i];
	                a[i] = temp;
	                swapCount++;
	            }
	        }
	        
	        System.out.println(swapCount);
	    }
	}