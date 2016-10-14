package com.naga.algorithms;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstRepeatedCharacter
{

	/** Complexity is O(N) */
	
	public static void main(String[] args)
	{
		String s = "naggcn";
		String sub = null;
		
		for(int i=0;i<s.length();i++)
		{
			sub = s.substring(i+1);
			if(sub.indexOf(s.charAt(i))>=0)
			{
				System.out.println(s.charAt(i));
				break;
			}
			
		}
		
		/** 2nd Approach */
		Set<Character> charSet = new HashSet();
		for(int i=0;i<s.length();i++)
		{
			if(!charSet.add(s.charAt(i)))
			{
				System.out.println(s.charAt(i));
				break;
			}
			
		}
		
		Map<Character,Integer> myMap = new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++)
		{
			if(myMap.containsKey(s.charAt(i)))
			{
				int value = myMap.get(s.charAt(i));
				value++;
				myMap.put(s.charAt(i), value);
			}
			else
			{
				myMap.put(s.charAt(i), 1);
			}
		}
		
		for(Entry<Character,Integer> variable : myMap.entrySet())
		{
			if(variable.getValue()>1)
			{
				System.out.println("First Repeating Character "+variable.getKey());
				break;
			}
			
		}

	}

}
