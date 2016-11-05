package com.naga.demos;

import java.lang.reflect.Field;

import com.naga.beans.StudentBean;

/** Through Reflection we can access private variables */

public class AccessPrivateVariables
{

	public static void main(String[] args) throws Exception
	{

		Class student = StudentBean.class;
		
		Field f = student.getDeclaredField("id");
		
		f.setAccessible(true);
		
		System.out.println(f.get(new StudentBean()));
		
	}

}
