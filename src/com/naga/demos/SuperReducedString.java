package com.naga.demos;

public class SuperReducedString
{

	public static void main(String[] args)
	{
		String s = "baab";
		System.out.println(recursiveMethod(s));

	}
	
	public static String recursiveMethod(String s )
	{
		boolean flag = false;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				s = s.substring(0,i)+s.substring(i+2);
				flag = true;
				break;
			}
		}
		
		if(flag)
		{
			s = recursiveMethod(s);
		}
		return s;
	}

}
