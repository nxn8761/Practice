package com.naga.demos;

import java.util.Arrays;

public class Test
{


	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	     /*   Scanner scanner = new Scanner(System.in);
	        int a,b = 0;
	        try
	       {
	           a = 2;

	           b = 0;
	            System.out.println(a/b);
	        }
	       catch(Exception e)
	       {
	          System.out.println( e.getMessage() + " " + e.getCause() + " "+e.toString());
	       }*/
	    	
	    	 int sum = 1;
    	     int a[]= {1,2,3,4};
    	     int result[] = Arrays.copyOf(a, 4);
	    	    
	    	    for(int i=0;i<4;i++)
	    		{
	    	   	   sum = 1;
	    	       for(int j=0;j<4;j++)
	    	       {
	    	          if(i!=j)
	    	          sum = sum*a[j];
	    	       }
	    	       result[i]=sum;
	    	     } 
	    	    
	    	    System.out.println(Arrays.toString(result));
	        
	    }
}
