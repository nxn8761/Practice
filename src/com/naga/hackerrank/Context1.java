package com.naga.hackerrank;

import java.util.Scanner;

public class Context1
{

	    public static void main(String[] args) {
	        int[] a = {2,4};
	        int[] b= {16,32,96};
	        
	        // find LCM of Array A
	        // find GCD of Array B
	        // RUN Through from LCM to GCD 
	        
	        
	        int lcmValue  = a[0];
	        int gcdValue = b[0];
			
			for(int i=1;i<a.length;i++)
			{
				lcmValue = (lcmValue*a[i])/gcd(lcmValue,a[i]);
			}
	        
			for(int i=1;i<b.length;i++)
			{
				gcdValue = gcd(gcdValue,b[i]);
			}
			
			System.out.println(lcmValue + "..."+gcdValue);
	        
	        int count  = 0;
	        for(int i=lcmValue;i<=gcdValue;i++)
	        {
	          if(gcdValue%i==0)
	           {
	             count++;  
	          }
	        }
	        
	        System.out.println(count);
	        
	    }
	    
	    static int gcd(int a , int b)
		{
			while(a!=b)
			{
				if(a>b)
				{
					a = a-b;
				}
				else if(a<b)
				{
					b = b-a;
				}
			}
			
			return a;
		}

	}
