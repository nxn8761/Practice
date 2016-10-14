package com.naga.demos;

public class MultiThreadingDemo
{

	public static void main(String[] args) throws InterruptedException
	{
		Print obj = new Print();
		EvenThreadDemo m1 = new EvenThreadDemo("Even",obj);
		OddThreadDemo m2 = new OddThreadDemo("odd",obj);
		
		m1.setPriority(Thread.MIN_PRIORITY);
		m2.setPriority(Thread.MAX_PRIORITY);
		m1.start();
		m2.start();
		
		m1.join();
		m2.join();
		System.out.println("Main Method completed");
	}

}

class Print
{
	/*synchronized public void printMethod(String name , int n)
	{
		try
		{
		
			for(int i=0;i<5;i++)
			{
				System.out.println(name + " is executing "+i*n);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			
			System.out.println(e.getMessage());
		}
	}*/
	
	/** Alternate Synchronization - as a block */
	
	public void printMethod(String name , int n)
	{
		synchronized(this)
		{
			for(int i=0;i<5;i++)
			{ 
				System.out.println(name + " is executing "+i*n);
				try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException e)
				{
					
					System.out.println(e.getMessage());
				}
		  }
		}
		
	}
	
}
class EvenThreadDemo extends Thread
{
	String name;
	Print print;
	EvenThreadDemo( String name,Print obj )
	{
		this.name = name;
		this.print = obj;
	}
	
	public void run()
	{
		print.printMethod(name, 5);
	}
}

class OddThreadDemo extends Thread
{
	String name;
	Print print;
	
	OddThreadDemo(String name,Print obj )
	{
		this.name = name;
		this.print = obj;
	}
	
	public void run()
	{
		print.printMethod(name, -5);
	}
}