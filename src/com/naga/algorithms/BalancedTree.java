package com.naga.algorithms;

import java.util.Stack;

public class BalancedTree {
    
    static boolean is_balanced(String expression) {
    	// Must be even
    	if ((expression.length() & 1) == 1) 
    	{
    		return false;
    	}
    	else 
    	{
    	  char[] brackets = expression.toCharArray();
    	  Stack<Character> s = new Stack<>();
    	  for (char bracket : brackets)
    	    switch (bracket) 
    	    {
    	      case '{': s.push('}'); break;
    	      case '(': s.push(')'); break;
    	      case '[': s.push(']'); break;
    	      default :
    	        if (s.empty() || bracket != s.peek())
    	          return false;
    	        s.pop();
    	    }
    	  return s.empty();
    	 }
    	}
  
    public static void main(String[] args) 
    {
            boolean answer = is_balanced("[](){()}");
            if(answer)
                System.out.println("YES");
            else System.out.println("NO");
    }

   
}
