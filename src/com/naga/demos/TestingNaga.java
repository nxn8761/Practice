package com.naga.demos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class TestingNaga
{

	public static void main(String[] args) throws Exception
	{
	
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    
		    String sr;
		    
		    if((sr=br.readLine())!=null)
		    {
		      
		    }
		    String inputArr[]= sr.split(" ");
		    
		   int n = Integer.parseInt(inputArr[0]);
		   int p = Integer.parseInt(inputArr[1]);
		   int q = Integer.parseInt(inputArr[2]);
		    
		    //int n = 7;
		    //int p = 2;
		    //int q= 3;
		    
		    String s = "";
		    
		    for(int i=1;i<=n;i++)
		    {
		     s = "";
		     if(i%p==0 && i%q!=0)
		     {
		       s = "wat";
		     }
		     int x = i;
		     int r = 0;
		     boolean isContainsP = false;
		     boolean isContainsQ = false;
		      while(x>0)
		      {
		        r = x%10;
		        x = x/10;
		        
		        if(r==p)
		        {
		          isContainsP = true;
		        }
		        if(r==q)
		        {
		          isContainsQ = true;
		        }
		      }
		      
		      if(isContainsP && !isContainsQ)
		      {
		        s= s.concat("son");
		      }
		      
		      if(s.equals(""))
		        System.out.print(i);
		      else
		      System.out.print(s);
		      System.out.print(" ");
		    }
	}
}
