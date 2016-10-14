package com.naga.demos;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        int noOfRocks = scanner.nextInt();
        scanner.nextLine();
        
        int totalGemEle = 0;
        
        String[] rocks = new String[noOfRocks];
        for(int i=0;i<noOfRocks;i++)
        {
            rocks[i]=scanner.nextLine();
        }
        
        char[] firstChar = rocks[0].toCharArray();
        //c='a'; c<='z'
        for(char c='a';c<='z';c++)
        { 
           int count = 0;
           for(int j=0;j<rocks.length;j++)
            {
              if(rocks[j].indexOf(c)>=0)
              {
                  count++;
              }
           }
            if(count == rocks.length)
            {
                totalGemEle++;
            }
            
        }
        
        System.out.println(totalGemEle);
        
    }
}