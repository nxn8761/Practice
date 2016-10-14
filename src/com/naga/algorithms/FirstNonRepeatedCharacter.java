package com.naga.algorithms;

public class FirstNonRepeatedCharacter
{

	public static void main(String[] args)
	{
		
		String s = "abcdbcde";
		
		
	   /* for(int i=0;i<sub.length();i++)
		{
	    	boolean flag = false;
			for(int j=i+1;j<sub.length();j++)
			{
				if(sub.charAt(i)==sub.charAt(j))
				{
					flag = true;
				}
			}
			if(!flag)
			{
				System.out.println(sub.charAt(i));
				break;
			}
			else
			{
				// remove character from string
				Character ch = sub.charAt(i);
				sub = sub.substring(0,i)+sub.substring(i+1);
				int index = sub.indexOf(ch);
				sub = sub.substring(0,index)+sub.substring(index+1);
				i=-1;
			}
		}*/
		
		String sub = null;
		
		 /*for(int i=0;i<s.length();i++)
			{
			 	sub = s.substring(0, i) + s.substring(i+1, s.length());
		    	boolean flag = false;
				for(int j=0;j<sub.length();j++)
				{
					if(s.charAt(i)==sub.charAt(j))
					{
						flag = true;
					}
				}
				if(!flag)
				{
					System.out.println(s.charAt(i));
					break;
				}
				
		   }*/
		
		/** O(N) Complexity */ 
		 for(int i=0;i<s.length();i++)
			{
			 	sub = s.substring(0, i) + s.substring(i+1, s.length());
		    	int index = sub.indexOf(s.charAt(i));
		    	if(index<0)
		    	{
		    		System.out.println(s.charAt(i));
					break;
		    	}
				
			}
	}

}
