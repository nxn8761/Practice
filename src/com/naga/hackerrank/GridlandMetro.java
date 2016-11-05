package com.naga.hackerrank;
import java.util.Scanner;

public class GridlandMetro {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int noOfTracks = scanner.nextInt();
        
        int a[][] = new int[n][m];
        int r= 0;
        int c1=0;
        int c2=0;
        
        for(int i= 0;i<noOfTracks;i++)
         {
            r  = scanner.nextInt();
            c1 = scanner.nextInt();
            c2 = scanner.nextInt();
            
            for(int j=c1;j<=c2;j++)
             {
               a[r-1][j-1] = 1;  
            }
        }
        long noOfLamps = 0;
        for(int i=0;i<n;i++)
        {
             for(int j=0;j<m;j++)
             {
               if(a[i][j]==0)
               {
                   noOfLamps++;
               }
            }
        }
        System.out.println(noOfLamps);
        scanner.close();
        
        
    }
}
