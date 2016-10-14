package com.naga.demos;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerDemo
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		
		scanner.nextLine(); // this is needed to move the cursor to next line
		
		String y = scanner.next();
		
		
		System.out.println(x +"-----"+y);
		
		System.out.println(Pattern.matches(".s", "as"));//true (2nd char is s)  
		System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s)  
		System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)  
		System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)  
		System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s) 
	}
	
}
