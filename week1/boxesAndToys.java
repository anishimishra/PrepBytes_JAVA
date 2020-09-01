//https://www.prepbytes.com/panel/mycourses/program-one/java/week/1/decision-making/codingAssignment/BOXTOY
import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
       Scanner sc = new Scanner (System.in);
    int n=sc.nextInt();
    int counter=0;
    while (n-->0) //for n
    {
      int t=sc.nextInt();
      int c=sc.nextInt();
      if (c-t>=2)
      {
        counter++;
      }
    }
    System.out.println(counter);
    }
  }