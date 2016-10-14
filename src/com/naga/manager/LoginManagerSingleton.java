package com.naga.manager;

public class LoginManagerSingleton
{

	private static LoginManagerSingleton singleton;
	
	private LoginManagerSingleton()
	{
		
	}
	
	
	public static LoginManagerSingleton getInstance()
	{
		if(singleton ==null)
		{
			singleton = new LoginManagerSingleton();
		}
		return singleton;
	}
	
	
	
	private  int logincount;
	   
	public int incrementLoginCount()
	{
	   logincount++;
	   return logincount;
	}
	
	
	public int getLoginCount()
	{
		return logincount;
	}
}
