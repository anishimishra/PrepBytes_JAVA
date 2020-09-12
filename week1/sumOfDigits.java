//https://www.prepbytes.com/panel/mycourses/program-one/java/week/1/iteration-statements/codingAssignment/SUMDGT
import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int rem, sum=0;
      while (n!=0)
      {
        rem = n%10;
        sum=sum+rem;
        n=n/10;
      }
      System.out.println(sum);
    }
  }