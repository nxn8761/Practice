package com.naga.demos;

import java.util.Scanner;

public class Pangram
{
	 public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	       String input = scanner.nextLine();
	       
	       input = input.toLowerCase();
	        int count = 0;
	       for(char alphabet = 'a'; alphabet <= 'z';alphabet++) 
	       {
	           if(input.indexOf(alphabet)>=0)
	            {
	               count++;
	           }
	           
	        }
	        System.out.print(count);
	        
	        if(count==26)
	        {
	            System.out.print("pangram");
	        }
	        else
	         {
	             System.out.print("not pangram");
	        }
	        
	    }
}
