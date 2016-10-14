package com.naga.demos;

import com.naga.manager.PrintClass;

public class Reflection
{

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException 
	{
		
		/** approach  - - 1 */ 
		PrintClass pobj1 = new PrintClass();
		
		pobj1.printMethod();

		
		/** approach  - - 2 */ 
		
		Class c = Class.forName("com.naga.manager.PrintClass");
		PrintClass pObj2  = (PrintClass) c.newInstance();
		
		pObj2.printMethod();
		
		/** approach  - - 3 */ 
		PrintClass pobj3 = PrintClass.class.newInstance();
		pobj3.printMethod();
		
		
	}

}
