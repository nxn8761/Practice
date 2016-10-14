package com.naga.demos;

import com.naga.beans.MarketIntefraceDemoBean;

public class MarketIntefaceDemo
{

	public static void main(String[] args)
	{
		
		MarketIntefraceDemoBean b1 = new MarketIntefraceDemoBean();
		
		b1.setA(2);
		b1.setS("hi man");
		
		/*try
		{	
			//MarketIntefraceDemoBean b2 = (MarketIntefraceDemoBean) b1.clonableMethod();
		}
		catch(CloneNotSupportedException c)
		{
			c.printStackTrace();
			
		}*/
		

	}

}
