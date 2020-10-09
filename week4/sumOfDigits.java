//https://www.prepbytes.com/panel/mycourses/program-one/java/week/4/recursion/codingAssignment/SMOFDGT
import java.util.*;
  import java.io.*;
  
  public class Main {
    static int sumDig(int n)
    {
      if(n==0)
      {
        return 0;
      }
      return (n%10+sumDig(n/10));
    }
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0)
      {
        int n=sc.nextInt();
        System.out.println(sumDig(n));
      }
    }
  }
