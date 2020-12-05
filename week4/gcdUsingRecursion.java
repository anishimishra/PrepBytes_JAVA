//https://www.prepbytes.com/panel/mycourses/program-one/java/week/4/recursion/codingAssignment/GCDRC

import java.util.*;
  import java.io.*;
  
  public class Main {
    
    static int gcd(int a, int b) {
      if (a == 0 || b == 0)
        return 0;
      else if (a == b)
        return a;
      else if (a > b)
        return gcd(a-b, b);
      else
        return gcd(a, b-a);
    }
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-- >0)
      {
        int n=sc.nextInt();
        int p=sc.nextInt();
        System.out.println(gcd(n,p));
      }
    }
  }