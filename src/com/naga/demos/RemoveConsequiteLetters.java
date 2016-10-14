package com.naga.demos;

public class RemoveConsequiteLetters
{

	public static void main(String[] args)
	{
		String input = "sabaas";
		boolean flag = false;
		
		StringBuilder sb = new StringBuilder(input);
		
		while(true)
		{
			flag = false;
			for(int i=0;i<sb.length()-1;i++)
			{
				if(sb.charAt(i)==(sb.charAt(i+1)))
				{
					sb = sb.deleteCharAt(i);
					sb = sb.deleteCharAt(i);
					flag = true;
				}
			}
			if(sb.length()==0|| !flag)
			{
				break;
			}
		}
		
		/*int i = 0;
		while(true)
		{
			flag = false;
			if(sb.charAt(i)==(sb.charAt(i+1)))
			{
				sb = sb.deleteCharAt(i);
				System.out.println(sb.toString());
				sb = sb.deleteCharAt(i);
				System.out.println(sb.toString());
				flag = true;
			}
			i++;
			if(flag)
			{
				i= 0;
			}
			
			if(sb.length()==0 || i ==sb.length()-1)
			{
				break;
			}
		}*/
		System.out.println("output is "+sb.toString());
	}

}
