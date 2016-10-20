package com.naga.algorithms;

import java.util.Scanner;

public class SherlockAndArraySum {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
    while (true) 
    {
        if (in.hasNextLine()) 
        {
            String s = in.nextLine();
            if (s.contentEquals("")) 
            {
                break;
            } 
            else 
            {
                String[] strings = s.split(" ");

                if (strings.length > 1) 
                {
                    int[] numbers = new int[strings.length];
                    for (int i = 0; i < strings.length; i++)                             {
                        numbers[i] = Integer.parseInt(strings[i]);
                    }
                    checkIfLeftEqualToRight(numbers);
                }
                else if(strings.length == 1)
                {
                    // if(Integer.parseInt(strings[0]) == 1)
                    //{ 
                        // System.out.println("YES");
                    //}
                 } 
             } 

        } 
        else 
        { 
            break; 
        } 
    }
    }
        

private static void checkIfLeftEqualToRight(int[] integers) 
{
    int totalIntArrayToLoop = integers.length - 1;
    int sum = getTotalSum(integers, 0, totalIntArrayToLoop);
    for (int i = 0; i <= totalIntArrayToLoop; i++) 
    {
        if (i == 0 || i == totalIntArrayToLoop) 
        {
            int remained = sum - integers[i];
            if (remained == 0) 
            {
                System.out.println("YES");
                return;
            }
         } 
         else 
         {
            int toSubtract = getTotalSum(integers, 0, i - 1);
            int resultToCheck = sum - (toSubtract * 2) - integers[i];
            if (resultToCheck == 0) 
            {
                System.out.println("YES");
                return;
            }
         }
    }

    System.out.println("NO");
    return;
}

private static int getTotalSum(int[] num, int start, int stop) 
{

    int returnSum = 0;
    for (int i = start; i <= stop; i++) 
    {
        returnSum = returnSum + num[i];
    }

    return returnSum;
}
}
