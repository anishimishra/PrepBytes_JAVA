//https://www.prepbytes.com/panel/mycourses/program-one/java/week/2/arrays/codingAssignment/MINMAX1
import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0)
      {
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,min,max;
        for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
        min=a[0];max=a[0];
        for(i=0;i<n;i++)
        {
          if(a[i]<min)
          {
            min=a[i];
          }
          if(a[i]>max)
          {
            max=a[i];
          }
        }
        System.out.println(min+" "+max);
      }
    }
  }