//https://www.prepbytes.com/panel/mycourses/program-one/java/week/1/decision-making/codingAssignment/LEAP
import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc= new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      if (n %4==0  && n%100!=0 || n%400==0)
      {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
    }
  }