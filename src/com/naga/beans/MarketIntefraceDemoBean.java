package com.naga.beans;

public class MarketIntefraceDemoBean implements Cloneable
{
	private int a;
	private String s;

	public int getA()
	{
		return a;
	}

	public void setA(int a)
	{
		this.a = a;
	}

	public String getS()
	{
		return s;
	}

	public void setS(String s)
	{
		this.s = s;
	}

	/* public Object clonableMethod() throws CloneNotSupportedException
	{
		return clone();
	} */
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
