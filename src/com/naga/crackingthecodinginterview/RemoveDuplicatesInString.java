package com.naga.crackingthecodinginterview;

/** Design an algorithm and write code to remove the duplicate characters in a string 
    without using any additional buffer. 
	NOTE: One or two additional variables are fine. An extra copy of the array is not. */

public class RemoveDuplicatesInString
{

	public static void main(String[] args)
	{

		String s = "nagpr";
		boolean flag = false;
		
		for(int i=0;i<s.length();i++)
		{
			flag = false;
			for(int j = i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					flag =true;
					// if you want to remove only 1 dup character and keep the other 
				   //s = s.substring(0,i)+s.substring(i+1);
				   
				   // if you want to remove both duplicate characters
				   s = s.substring(0,i)+s.substring(i+1,j)+s.substring(j+1);
				   break;
				}
			}
			if(flag)
			i=0;
		}
		
		System.out.println(s);
	}

}


/**for(int i=0;i<s.length();i++)
{
      sub = s.substring(0, i) + s.substring(i+1, s.length());
int index = sub.indexOf(s.charAt(i));
if(index<0)
{
       System.out.println(s.charAt(i));
             break;
}
      
}*/
