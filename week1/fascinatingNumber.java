//https://www.prepbytes.com/panel/mycourses/program-one/java/week/1/iteration-statements/codingAssignment/FASNUM
import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner (System.in);
      int t=sc.nextInt();
      while(t-->0)
      {
        int n=sc.nextInt();
        n=n+1;
        while(true)
        {
          int a = n % 10;
          int b = (n / 10) % 10;
          int c = (n / 100) % 10;
          int d = (n / 1000) % 10;
          if (a != b && a != c && a != d && b != c && b != d && c != d)
          {
            break;
          }
          else
          {
            n = n + 1;
          }
        }
        System.out.println(n);
      }
    }
  }