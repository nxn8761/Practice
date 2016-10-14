package com.naga.demos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyThreadExample
{

	public static void main(String[] args)
	{
		List x = new ArrayList<String>();
		
		double f = (float)20/100;
		
		float taxp = (float) 8/100;
		
		Scanner scanner = new Scanner(System.in);
		
		
		int y = scanner.nextInt();
		
		
		
		EvenThread m1  = new EvenThread();
		OddThread m2  = new OddThread();
		
		m1.run();
		m2.start();
		
	}

}

class EvenThread implements Runnable
{
	String name;
	
	EvenThread()
	{
		super();
	}
	
	EvenThread(String name)
	{
		this.name = name;
	}
	
	public void run()
	{
		
		try
		{
			Thread.sleep(1000);
			System.out.println("am even");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
 
 class OddThread extends Thread 
 {
 	String name;
 	
 	OddThread()
 	{
 		super();
 	}
 	
 	OddThread(String name)
 	{
 		this.name = name;
 	}
 	
 	public void run()
 	{
 		
 		try
 		{
 			Thread.sleep(1000);
 			System.out.println("How are you, am odd ");
 		} 
 		catch (Exception e)
 		{
 			e.printStackTrace();
 		}
 		
 	}
 	
 }
