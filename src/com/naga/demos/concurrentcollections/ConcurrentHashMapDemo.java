package com.naga.demos.concurrentcollections;

import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo
{

	public static void main(String[] args)
	{
		ConcurrentHashMap<Integer,String> cmap = new ConcurrentHashMap();
		
		cmap.put(1,"243");
	    cmap.put(2,"23");
	    cmap.put(-1,"2d3");
	    
	    int count = 4;
	    
	   for(Entry<Integer,String>  var: cmap.entrySet())
	   {
		   count++;
		   cmap.put(count, "naga");
		   System.out.println(var.getKey() + "-->"+ var.getValue() );
	   }
	   
	   System.out.println(cmap.size());

	}

}
