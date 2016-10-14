package com.naga.demos;

//*******************************************************************
//NOTE: please read the 'More Info' tab to the right for shortcuts.
//*******************************************************************

import java.lang.Math; // headers MUST be above the first class

//one class needs to have a main() method
public class HelloWorldDemo
{
// arguments are passed using the text field below this editor
public static void main(String[] args)
{

 MyThread m1 = new MyThread();
 MyThread m2 = new MyThread();
 m1.start();
 m2.start();
 
}
}

//you can add other public classes to this editor in any order
class MyThread extends Thread
{

	private volatile static int i;
public void run()
{
  while(i<10)
  {
    System.out.println(i);
    try
    {
    	Thread.sleep(1000);
    	i++;
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}

}