package com.naga.algorithms;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeHeight
{

	public static void main(String[] args)
	{
		  int a1[]={2,3,4};
	       int a2[] = {4,5,6};
	    
	    // merge to list
	       
	       List<Integer> intList = new ArrayList<Integer>();
	       for (int index = 0; index < a1.length; index++)
	       {
	           intList.add(a1[index]);
	       }
	       List<Integer> intList2 = new ArrayList<Integer>();
	       for (int index = 0; index < a2.length; index++)
	       {
	           intList2.add(a2[index]);
	       }
	    
	       intList.retainAll(intList2);
	       
	       intList.forEach(i->System.out.println(""+i));
	       
	      // a1List.forEach(System.out::println);
	}

}
