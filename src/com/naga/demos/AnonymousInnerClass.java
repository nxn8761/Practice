package com.naga.demos;

public class AnonymousInnerClass
{

	public static void main(String[] args)
	{
		
        Phone p = new Phone()
        {
        	public void show()
        	{
        		System.out.println("call, sms, camera");
        	}
        };
        
        // Phone er = ()->System.out.println("hi"); Lambda Expression 1.8
        
        p.show();
        
       
	}

}

interface Phone
{
	public void show();
	/*{
		System.out.println("call");
	}*/
}
