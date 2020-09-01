//https://www.prepbytes.com/panel/mycourses/program-one/java/week/1/operators-and-expressions/codingAssignment/MAXDRAWS
import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc= new Scanner(System.in);
      int t= sc.nextInt();
      while (t-->0)
      {
        int n=sc.nextInt();
        int draws=n+1;
        System.out.println(draws);
      }
    }
  }