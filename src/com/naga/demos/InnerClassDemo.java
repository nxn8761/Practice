package com.naga.demos;

public class InnerClassDemo
{

	public static void main(String[] args)
	{
		
		Outer outerObj = new Outer();
		
		Outer.Inner inner =  outerObj.new Inner();
		
		inner.print();
		
		//outerObj.
		
		OuterStatic.InnerStatic obj = new OuterStatic.InnerStatic();

	}

}

/** Member Inner Class */
class Outer
{
	int i;
	
	Inner inner = new Inner();
	
	public void outerPrint()
	{
		System.out.println("outer show");
	}
	
	class Inner
	{
		int j;
		public void print()
		{
			System.out.println(i);
			outerPrint();
		}
	}
}


/** Static Inner Class */
class OuterStatic
{
	int i;
	
	static class InnerStatic
	{
		int j;
	}
}

