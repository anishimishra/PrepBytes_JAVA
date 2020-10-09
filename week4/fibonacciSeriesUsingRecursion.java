//https://www.prepbytes.com/panel/mycourses/program-one/java/week/4/recursion/codingAssignment/FIBRC
import java.util.*;
  import java.io.*;
  
  public class Main {
    static void fib(int n, int a, int b, int i)
    {
      int c=a+b;
      if(i>n-2)
      {
        System.out.println(c);
        return;
      }
      i++;
      fib(n,b,c,i);
    }
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0)
      {
        int n=sc.nextInt();
        if (n==1)
        {
          System.out.println(1);
          continue;
        }
        if (n==2)
        {
          System.out.println(1);
          continue;
        }
        int i=2;
        int a,b;
        a=1;b=1;
        fib(n,a,b,i);
      }
    }
  }
// or we can call function using fib(n-1), fib(n-2);