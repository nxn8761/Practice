package com.naga.demos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.naga.beans.EmplBean;

public class TreeMapDemo
{

	public static void main(String[] args)
	{
		Map<EmplBean,String> map = new TreeMap<EmplBean,String>(new Comparator<EmplBean>()
				{
					public int compare(EmplBean e1, EmplBean e2)
					{
						//desc
						return ((Integer)e2.getSalary()).compareTo((Integer)e1.getSalary());
					}
				});
		
		map.put(new EmplBean("NAGA",190), "NAGA");
		
		map.put(new EmplBean("Satish",100), "Satish");
		
		map.put(new EmplBean("Agm",90), "Agm");
		
		System.out.println(map.size());
		
		for(Map.Entry<EmplBean,String> temp: map.entrySet() )
		{
			System.out.println(temp);
		}

		
		List<EmplBean> list = new ArrayList<EmplBean>();
		
		list.add(new EmplBean("NAGA",190));
		list.add(new EmplBean("Satish",100));
		
		
		EmplBean bean = new EmplBean("NAGA",190);
		System.out.println(list.contains(bean));
		
	}

}
