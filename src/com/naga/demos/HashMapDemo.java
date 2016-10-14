package com.naga.demos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class HashMapDemo
{

	public static void main(String[] args)
	{
		String value = "hi,naga";
	    
	    String splitArry[]= value.split(",");
	    
	    System.out.println(splitArry[0]);
	    
		Map<String,String> tempMap = new HashMap<String,String>();
		
		List<Integer> intList = new ArrayList();
		
		intList.add(1);
		intList.add(1);
		intList.add(3);
		
		for(int x:intList)
		{
			System.out.println(x);
		}
		
		tempMap.put("1", "Sachin");
		tempMap.put("2", "Kohli");
		tempMap.put("3", "Dhoni");
		
		for(Map.Entry<String, String> entry : tempMap.entrySet())
		{
			System.out.println("Key is "+entry.getKey()+" Value is "+entry.getValue());
		}
		
		Map<String, List<Integer>> listMap = new HashMap<String,List<Integer>>();
		
		List<Integer> tempList = new ArrayList<Integer>();
		tempList.add(1);
		tempList.add(2);
		tempList.add(3);
		
		listMap.put("one", tempList);
		listMap.put("two", tempList);
		listMap.put("three", tempList);
		
		
		for(Map.Entry<String, List<Integer>> entry:listMap.entrySet())
		{
			System.out.println("Key from map is "+entry.getKey());
			for(int x:entry.getValue())
			{
				System.out.println(x);
			}
		}
	}
}
