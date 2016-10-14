package com.naga.algorithms;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial
{

	public static void main(String[] args)
	{
		 Scanner scanner = new Scanner(System.in);
	        BigInteger x = scanner.nextBigInteger();
	        BigInteger y = scanner.nextBigInteger();
	        
	        BigInteger sum = x.add(y);
	        
	        BigInteger result = sum.multiply(sum.subtract(new BigInteger("1"))).divide(new BigInteger("2"));
	        
	       
	        
	        System.out.println(result);
	        
	        

	}
	
	static BigInteger factorial(BigInteger n)
	{
		if(n.compareTo(new BigInteger("1"))==0)
			return new BigInteger("1");
		else
			return n.multiply(factorial(n.subtract(new BigInteger("1"))))  ;
	}
	
	

}
