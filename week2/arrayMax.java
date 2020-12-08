//https://www.prepbytes.com/panel/mycourses/program-one/java/week/2/arrays/codingAssignment/ARRMAX

import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-- >0)
      {
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        int i,j;
        for(i=0;i<=n-1;i++)
        {
          a[i]=sc.nextInt();
        }
        long sum=0, temp_max=0, max=0;
        k=k%n;
        for(i=0;i<=n-1;i++)
        {
          sum=0;
          for(j=i; j < n; j = j + k)
          {
            sum = sum + a[j];
            if (sum < 0)
              sum = 0;
            if (sum > max)
            {
              max = sum;
              temp_max = max;
            }
          }
          if (max > temp_max)
            temp_max = max;
          if (sum > max)
            max = sum;
        }
        if (max > 0)
          System.out.println(max);
        else
          System.out.println("0");
      }
    }
  }