package com.naga.beans;

import java.io.Serializable;

public class StudentBean implements Serializable
{

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	
	public StudentBean()
	{
	}
	
	public StudentBean(int id)
	{
		this.id = id;
	}
	
	public boolean equals(Object obj)
	{
		StudentBean s = (StudentBean) obj;
		
		if(s==null)
		{
			return false;
		}
		if(s!=null && s.id.compareTo(this.id)==0)
		{
			return true;
		}
		System.out.println("equals() method");
		return false;
	}
	
	public int hashCode()
	{
		System.out.println("hashcode() method");
		return this.id.hashCode();
	}
	
	
}
