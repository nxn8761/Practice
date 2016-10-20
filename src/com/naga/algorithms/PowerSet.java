package com.naga.algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PowerSet
{

	public static void main(String[] args)
	{
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(5);
		set.add(3);
		set.add(4);
		set.add(2);
		set.add(2);

		Set<Set<Integer>> powSet = powerSet(set);
		
		System.out.println("no. of subsets are.." +powSet.size());
		
		Iterator<Set<Integer>> ite = powSet.iterator();
		int key = 2;
		int count = 0;
		while(ite.hasNext())
		{
			HashSet<Integer> intSet = (HashSet)ite.next();
			
			if(intSet.size()==2)
			{
				int diff = 0;
				for(Integer val:intSet)
				{
					diff = val-diff;
				}
				if(Math.abs(diff)== key)
				{
					count++;
				}
			}
		}
		
		System.out.println(count);
	}

	
	public static Set<Set<Integer>> powerSet(Set<Integer> originalSet) 
	{
        Set<Set<Integer>> sets = new HashSet<Set<Integer>>();
        if (originalSet.isEmpty()) 
        {
            sets.add(new HashSet<Integer>());
            return sets;
        }
        List<Integer> list = new ArrayList<Integer>(originalSet);
        Integer head = list.get(0);
        Set<Integer> rest = new HashSet<Integer>(list.subList(1, list.size()));
        for (Set<Integer> set : powerSet(rest)) 
        {
            Set<Integer> newSet = new HashSet<Integer>();
            newSet.add(head);
            newSet.addAll(set);
            sets.add(newSet);
            sets.add(set);
        }
        return sets;
    }
}
