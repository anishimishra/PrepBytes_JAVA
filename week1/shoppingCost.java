//https://www.prepbytes.com/panel/mycourses/program-one/java/week/1/decision-making/codingAssignment/SHOPCST
import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner (System.in);
      int n=sc.nextInt();
      while (n-->0)
      {
        int q=sc.nextInt();
        int p=sc.nextInt();
        double after_d,s;
        if (q>100)
        {
          s=q*p*0.2;
          after_d=(q*p)-s;
          System.out.printf("%.1f",after_d);
          System.out.println();
        }
        else {
          s=q*p;
          System.out.printf("%.1f",s);
          System.out.println();
        }
      }
    }
  }