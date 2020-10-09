//https://www.prepbytes.com/panel/mycourses/program-one/java/week/2/arrays/codingAssignment/PRNTEO
import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int i;
      for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      for(i=0;i<n;i++)
      {
        if(a[i]%2==0)
        {
          System.out.print(a[i]+" ");
        }
      }
      System.out.println();
      for(i=0;i<n;i++)
      {
        if(a[i]%2!=0)
        {
          System.out.print(a[i]+" ");
        }
      }
    }
  }