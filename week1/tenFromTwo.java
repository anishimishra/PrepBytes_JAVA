//https://www.prepbytes.com/panel/mycourses/program-one/java/week/1/decision-making/codingAssignment/TWOTEN
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
        if(n%10==0)
        System.out.println("0");
        else if(n%10==5)
        System.out.println("1");
        else System.out.println("-1");
      }
    }
  }