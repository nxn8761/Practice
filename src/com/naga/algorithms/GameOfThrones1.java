package com.naga.algorithms;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class GameOfThrones1
{

	public static void main(String[] args) {
		// aaabbbb, cdefghmnopqrstuvw - SAMPLE INPUT
        Scanner myScan = new Scanner(System.in);
        String s = myScan.nextLine();
        String ans;
        if(isAnagramPalindrome(s)){
            ans = "YES";
        }else{
            ans = "NO";
        }
        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
        System.out.println(ans);
        myScan.close();
    }
    public static boolean isAnagramPalindrome(String s)
    {
        boolean result = false;

		int count = 1;
		HashMap<Character, Integer> myHashMap = new HashMap<Character, Integer>();
		int index = 0;
		while(index < s.length())
		{
			if(myHashMap.containsKey(s.charAt(index)))
			{
				int dup = myHashMap.get(s.charAt(index));
				dup++;
				myHashMap.remove(s.charAt(index));
				myHashMap.put(s.charAt(index), dup);
			}else
			{
				myHashMap.put(s.charAt(index), count);
			}
			index++;
		}

		//System.out.println("My Hashmap: "+ myHashMap);

		// only one occuance of a character should be odd
		// the rest should be even
		// check if there is more than one odd occurance
		// if there is return false
		Set<Character> mySet = myHashMap.keySet();
        int oddOccurance = 0;
		for(char c : mySet){
            if(myHashMap.get(c) % 2 != 0){
                oddOccurance++;
            }
        }
        //System.out.println("oddOccurance: "+oddOccurance);
        if(oddOccurance > 1){
			result = false;
		}else{
			result = true;
		}
	   return result;
    }

}
