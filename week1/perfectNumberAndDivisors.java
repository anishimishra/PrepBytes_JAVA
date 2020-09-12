//https://www.prepbytes.com/panel/mycourses/program-one/java/week/1/iteration-statements/codingAssignment/PRFCTNO
import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc=new Scanner (System.in);
    int t= sc.nextInt();
    while(t-->0)
    {
      int s=0;
      int n=sc.nextInt();
      for (int i=1; i<n;i++)
      {
        if(n%i==0)
        {
          s=s+i;
        }
      }
      if(s==n)
      {
        System.out.println("true");
      }else {
        System.out.println("false");
      }
    }
  }
}