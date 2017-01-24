package com.naga.demos;

import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.CopyOnWriteArrayList;

public class IBM_DEMO2
{

	public static void main(String[] args)
	{
		  String s = "natural language processing|Natural Language Processing| "
		  		+ "three additional|program|programmatic computing plus the combination of three additional "
		  		+ "capabilities|\"Combination\"";
		    
		    StringBuilder result = new StringBuilder();
		   
		    String sArr[] = new String[6];
		    
		    StringTokenizer st = new StringTokenizer(s,"|");
		    
		    List<String> sList = new CopyOnWriteArrayList<String>();
		    
		    
		    
		    int k = 0;
		    while(st.hasMoreElements())
		    {
		    	sList.add((String)st.nextElement());
		    	//sArr[k]= (String)st.nextElement();
		    	//k++;
		    	//System.out.println(st.nextElement());
		    }
		    
		    for(String str : sList)
		    {
		    	if(sList.contains(str))
		    	{
		    		result.append(str);
		    		sList.remove(str);
		    	}
		    }
		   // for(int i=0;i<sArr.length;i++)
		    for(int i=0;i<sList.size();i++)
		    {
		      //for(int j=0;j<sArr.length;j++)
		     for(int j=0;j<sList.size();j++)
		      {
		        if(sList.get(j).trim().toUpperCase().contains(sList.get(i).trim().toUpperCase()))
		        {
		          if(sList.get(j).trim().length() ==(sList.get(i).trim().length()))
		          {
		            if(i>j)
		            {
		            	result.append(sList.get(i));
		            	result.append("|");
		            	sList.remove(i);
		            }
		            else
		            {
		              result.append(sList.get(j));
		              result.append("|");
		              sList.remove(j);
		            }
		          }
		          else if(sList.get(j).length()>sList.get(i).length())
		          {
		            result.append(sList.get(j));
		            result.append("|");
		            sList.remove(j);
		          }
		        }
		      }
		    }
		    
		    System.out.println(result.toString());

	}

}
