package com.naga.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Visa2 {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scanner = new Scanner(System.in);
        String s[] = {"S2" ,"D5", "C7", "ST", "HA"};
        String result = "";
        int temp = 0;
        //"S2" "D5" "C7" "ST" "HA"
        Map<Character,Integer> someMap = new HashMap<Character,Integer>();
        for(int i=0;i<5;i++)
         {
            //s[i] = scanner.next();
            temp = someMap.get(s[i].charAt(0)) == null ? 0 : someMap.get(s[i].charAt(0));
            someMap.put(s[i].charAt(0), ++temp);
            temp = someMap.get(s[i].charAt(1)) == null ? 0 : someMap.get(s[i].charAt(1));
        	someMap.put(s[i].charAt(1), ++temp);
        }
        for(Entry<Character,Integer> entry :someMap.entrySet())
        {
        	char c = entry.getKey();
        	if(Character.isDigit(c) || c == 'A' || c == 'T')
           {
        		if(entry.getValue() == 4) {
        			result = "four-of-a-kind";
        			break;
        		}
        		else if(entry.getValue() == 3) {
        			result = "full-house";
        		}
        		else if(entry.getValue() == 2) {
        			result = "pair";
        		}
        	}
        }
        
        
    }
}