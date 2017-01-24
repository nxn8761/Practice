package com.naga.demos;

import java.util.ArrayList;
import java.util.List;


public class IBMDemo2_Saravana 
{
       public static void main(String[] args)
       {
              String input= "\"watson Represents\"|watson represents|Watson represents a first step into cognitive systems -- a new era of computing.|first step into Cognitive|Cognitive Systems - a new era of computing,|what does watson represent";
              String[] inpString = input.split("\\|");
              List<String> processedStringList = new ArrayList<String>();
              List<String> tempList = new ArrayList<String>();
              
              StringBuilder outputString = new StringBuilder();
              int n = 0;
              for(String eachString : inpString)
              {
                     processedStringList.add(eachString.trim().replaceAll(" +", " ").replace("\"", "").replace(",", ".").replaceAll("-+", "-"));
                     n++;
              }
              
              for(int i = 0; i<processedStringList.size(); i++)
              {
                     for(int j=i+1; j<processedStringList.size(); j++)
                     {
                           if((processedStringList.get(j)).equalsIgnoreCase(processedStringList.get(i)))
                           {
                                  tempList.add(processedStringList.get(j));
                           }
                           else if((processedStringList.get(j).toLowerCase()).contains(processedStringList.get(i).toLowerCase()))
                           {
                                  tempList.add(processedStringList.get(i));
                           }
                           else if((processedStringList.get(i).toLowerCase()).contains(processedStringList.get(j).toLowerCase()))
                           {
                                  tempList.add(processedStringList.get(j));
                           }
                     }
              }
              processedStringList.removeAll(tempList);
              
              for(String eachString : processedStringList)
              {
                     outputString.append(eachString);
                     if(processedStringList.indexOf(eachString)+1 != processedStringList.size())
                     {
                           outputString.append("|");
                     }
              }
              System.out.print(outputString);
       }
}
