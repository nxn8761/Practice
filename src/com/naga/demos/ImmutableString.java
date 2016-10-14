package com.naga.demos;

import java.util.Scanner;

public class ImmutableString
{

	public static void main(String[] args)
	{

		String value = "Immutable";
		System.out.println(value);
		value.concat("vinu");
		System.out.println(value);
		
		StringBuilder buff = new StringBuilder("Mutable");
		
		buff = new StringBuilder("afksdfks");
		
		buff.append("jakfj");
		
		System.out.println(buff.toString());
		
	
	}

}
