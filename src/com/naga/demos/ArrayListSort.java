package com.naga.demos;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ArrayListSort
{

	public static void main(String[] args)
	{

	   List<Integer> intList = new ArrayList();
	   
	   for(int i=7;i>=-4;i--)
	   {
		   intList.add(i);
	   }
	   
	   System.out.println("size of the list is "+intList.size());
	   
	   /** Sorting  */
	   
	   Collections.sort(intList);
	   
	   for(int x:intList)
	   {
		   System.out.println(x);
	   }
	   
	   
	}

}
