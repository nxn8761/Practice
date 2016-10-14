package com.naga.demos;

import java.util.HashMap;
import java.util.Map;

import com.naga.beans.Report;
import com.naga.beans.StudentBean;

public class HashCodeDemo
{

	public static void main(String[] args)
	{

		Map<StudentBean,Report> studentMap = new HashMap<StudentBean,Report>();
		
		StudentBean s1 = new StudentBean(12);
		StudentBean s2 = new StudentBean(10);
		
		
		studentMap.put(s1, new Report());
		studentMap.put(s2, new Report());
		
		System.out.println(studentMap.size());
		
	}

}
