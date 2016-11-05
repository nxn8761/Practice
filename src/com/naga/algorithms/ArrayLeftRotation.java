package com.naga.algorithms;

import java.util.Scanner;

public class ArrayLeftRotation
{

	/** the commented solution complexity is not good */
	
	/*public static int[] arrayLeftRotation(int[] a, int n, int noOfRotations) 
    {
      int temp1 = 0;
      int temp2 = 0;
       for(int j=1;j<=noOfRotations;j++)
       {
          for(int i=n-1;i>0;i--)
          {
            if(i==n-1)
            {
               temp1 = a[i];
               temp2 = a[i-1];
               a[i] = a[0];
               a[i-1] = temp1;
            }
            else
            {
               temp1 = a[i-1];
               a[i-1] = temp2;
               temp2 = temp1;
            }
        	  
          }
       }
        return a;
    }*/

	public static int[] arrayLeftRotation(int[] a, int n, int k) 
    {
        if (k >= n) 
		{
            k = k % n;
        }
        
        if (k == 0) return a;
        
        int[] temp = new int[n];
        
        for (int i = 0; i < n; i++) 
		{
            if (i + k < n) 
			{
                temp[i] = a[i + k];
            } 
            else 
			{
                temp[i] = a[(i + k) - n];
            }
        }
        
        return temp;
    }
	
	public static int[] arrayLeftRotationAlternate(int[] a, int n, int k) 
    {
        if (k >= n) 
		{
            k = k % n;
        }
        
        if (k == 0) return a;
        
        int[] temp = new int[n];
        
        for (int i = 0; i < n; i++) 
		{
           temp[i] = a[(k+i)%n];
        }
        
        return temp;
    }
	
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
}
