package com.naga.algorithms;

public class Anagram
{

	public static void main(String[] args)
	{
		System.out.println(isAnagram("naga","agan"));
	}

	
	static boolean isAnagram(String a, String b) {
        boolean isAnagram = false;
        a= a.toUpperCase();
        b= b.toUpperCase();
        // Complete the function by writing your code here.
        int string1Length = a.length();
        int string2Length = b.length();
        
        if(string1Length == string2Length)
        {
           for(int i=0;i<string1Length;i++)
           {
              int index = b.indexOf(a.charAt(i)); 
              if(index>=0)
              {
                  b = b.substring(0,index)+b.substring(index+1,b.length()); 
              }
             
           }
            if(b.length()==0)
            {
                isAnagram = true;
            }
        }
       return isAnagram;
       
    }

}
