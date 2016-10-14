package com.naga.demos;

public class BinarySearch
{

	public static void main(String[] args)
	{
		    int[] data = {1,2,3,4,5};
		    int size = 5;
		
		    
		         int low = 0;
		         int high = size - 1;
		         int key = 2;
		          
		         while(high >= low) 
		         {
		             int middle = (low + high) / 2;
		             if(data[middle] == key) 
		             {
		            	 System.out.println("Index" + middle);
		                 break;
		            }
		            if(data[middle] < key)
		            {
		                low = middle + 1;
		            }
		            if(data[middle] > key)
		            {
		                high = middle - 1;
		            }
		       }

	}

}
