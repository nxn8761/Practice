package com.naga.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MinNumberNeededtoMakeItAnagram
{

	    public static int numberNeeded(String first, String second) 
	    {
	        Map<Character, Integer> count = new HashMap<>();
	        for( char ch: first.toCharArray() ) 
	        {
	            int ct = count.containsKey(ch) ? count.get(ch) : 0;
	            count.put(ch, (ct + 1));
	        }
	        
	        for( char ch: second.toCharArray() ) 
	        {
	            int ct = count.containsKey(ch) ? count.get(ch) : 0;
	            count.put(ch, (ct - 1));
	        }
	        
	        List<Integer> values = new ArrayList<>( count.values() );
	        int total = 0;
	        for( Integer v: values ) 
	        {
	            total += Math.abs(v);
	        }
	        return total;
	    }
	  
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String a = in.next();
	        String b = in.next();
	        System.out.println(numberNeeded(a, b));
	    }

}
