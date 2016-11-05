package com.naga.demos;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo
{

	public static void main(String[] args)
	{

		Map<String,String> hashMap = new HashMap<String,String>();
		
		hashMap.put("naga", "sachin");
		
		hashMap.put("demo", null);
		
		hashMap.put(null, null);
		
		System.out.println("hello nAGA HASHMAP allows null key and values..." + hashMap.size());
		
		Map<String,String> hashTable = new Hashtable<String,String>();
		
		hashTable.put("naga", "sachin");
		
		hashTable.put("saching", null);
		
	}

}
