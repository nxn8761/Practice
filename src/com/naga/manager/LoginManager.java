package com.naga.manager;


public class LoginManager
{
   private static int logincount;

   
   
   public int incrementLoginCount()
   {
	   logincount++;
	   return logincount;
   }
}
