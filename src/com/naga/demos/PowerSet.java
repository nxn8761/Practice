package com.naga.demos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PowerSet
{

	public static void main(String[] args)
	{
		 Set<Integer> originalSet = new HashSet<Integer>();
		 originalSet.add(2);
		 originalSet.add(1);
		 originalSet.add(7);
		 originalSet.add(4);
		 Set<Set<Integer>> sets = powerSet(originalSet);
		 
		 System.out.println(sets);
		 
		 for(Set<Integer> set :sets)
		 {
			 System.out.println(set);
		 }

	}
	
	public static Set<Set<Integer>> powerSet(Set<Integer> originalSet) {
        Set<Set<Integer>> sets = new HashSet<Set<Integer>>();
    
        if (originalSet.isEmpty()) {
            sets.add(new HashSet<Integer>());
            return sets;
        }
        List<Integer> list = new ArrayList<Integer>(originalSet);
    
        Integer head = list.get(0);
    
        Set<Integer> rest = new HashSet<Integer>(list.subList(1, list.size()));
        for (Set<Integer> set : powerSet(rest)) {
            Set<Integer> newSet = new HashSet<Integer>();
            newSet.add(head);
            newSet.addAll(set);
            sets.add(newSet);
            sets.add(set);
        }
        return sets;
    }

}
