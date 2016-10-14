package com.naga.demos.concurrentcollections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo
{

	public static void main(String[] args)
	{
		List<Integer> clist = new CopyOnWriteArrayList();
		//List<Integer> clist = new ArrayList();
		clist.add(2);
		clist.add(3);
		clist.add(4);
		
		for(Integer i: clist)
		{
			clist.add(9);
			System.out.println(i);
		}

	}

}
