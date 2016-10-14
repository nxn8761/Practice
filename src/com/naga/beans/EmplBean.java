package com.naga.beans;

public class EmplBean 
{

	private String name;
	
	private int salary;
	
	public EmplBean(String name , int salary)
	{
		this.name = name;
		this.salary = salary;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getSalary()
	{
		return salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}

	
	public String toString()
	{
		return "Name: "+this.name+"-- Salary: "+this.salary;
	}
	
	public boolean equals(Object obj)
	{
		if(obj == null)
		{
			return false;
		}
		else if(obj instanceof EmplBean && this.getName().equals(((EmplBean)obj).getName()))
		{
			return true;
		}
		return true;
	}
	
	public int hashCode()
	{
		return 1*((Integer)this.getSalary()).hashCode();
	}
}
