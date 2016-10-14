package com.naga.demos;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetExample
{

	public static void main(String[] args)
	{
		
		   
		  Set<String> al=new TreeSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  al.add("Aaay");  
		  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  
		 System.out.println((int)(Math.pow(2, 4)));
	}  
}
