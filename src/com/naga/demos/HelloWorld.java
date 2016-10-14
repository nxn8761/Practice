package com.naga.demos;

abstract class TestClass
{
  public abstract void area();
  
  
}

interface TestInterface
{
  int x = 5;
  public abstract void area();
  
  
}

class DemoClass implements TestInterface
{

	public void area()
	{
		// TODO Auto-generated method stub
		
	}
	
}
class Rectangle extends TestClass
{
  int  a= 2 , b=5;
   public void area()
   {
     System.out.println("Rectangle area " +a*b);
   }
}

class Square extends TestClass
{
  int  a= 2 , b=2;
   public void area()
   {
     System.out.println("Square area " +a*b);
   }
}


class MyClass
{
	int x = 2;
}
// our main class becomes a file but the main method is still found
public class HelloWorld
{
  
  public static void main(String args[])
  {
    	TestClass testClass = new Rectangle();
        testClass.area();
       // testClass.print();
        
         testClass = new Square();
         testClass.area();
         
         MyClass myclass = new MyClass();
         myclass.x = 2;
         
         TestInterface te = new DemoClass();
         System.out.println(te.x) ;
         
  }
   
}