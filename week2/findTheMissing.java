//https://www.prepbytes.com/panel/mycourses/program-one/java/week/2/arrays/codingAssignment/MISNGNU
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
        int a[]=new int[n-1];
        long total=((long)n*(n+1))/2;
        long sum=0;
        for(int i=0;i<n-1;i++)
        {
          a[i]=sc.nextInt();
          sum+=a[i];
        }
        System.out.println(total-sum);
      }
    }
  }