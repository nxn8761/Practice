package com.naga.demos;

import java.util.Scanner;

public class ForDemo
{

	public static void main(String[] args)
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
			//i = 0;
		}
		
		Scanner scanner = new Scanner(System.in);
		String B  = scanner.nextLine();
		System.out.println( B.replaceAll("010", ""));
        System.out.println((B.length() - B.replaceAll("010", "").length())/3);

	}

}
