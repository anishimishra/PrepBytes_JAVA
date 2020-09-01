//https://www.prepbytes.com/panel/mycourses/program-one/java/week/1/decision-making/codingAssignment/SCNDSML
import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      if (a>b &&a<c)
      System.out.println(a);
      if (b>a && b<c)
      System.out.println(b);
      if(c>a && c<b)
      System.out.println(c);
    }
  }