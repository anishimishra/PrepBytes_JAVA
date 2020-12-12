//https://www.prepbytes.com/panel/mycourses/program-one/java/week/4/recursion/codingAssignment/BINARY1

import java.util.*;
  import java.io.*;
  
  public class Main {
    static void binary(int a[], int k, int n)
    {
      if(k==n)
      {
        for(int i=0;i<n;i++)
        {
          System.out.print(a[i]);
        }
        System.out.println();
        return;
      }
      if(a[k-1]==0)
      {
        a[k]=0;
        binary(a,k+1,n);
        a[k]=1;
        binary(a,k+1,n);
      }
      else 
      {
        a[k]=0;
        binary(a,k+1,n);
      }
    }
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-- >0)
      {
        int n=sc.nextInt();
        int a[]=new int[n];
        a[0]=0;
        binary(a,1,n);
        a[0]=1;
        binary(a,1,n);
      }
    }
  }