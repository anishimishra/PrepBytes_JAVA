//https://www.prepbytes.com/panel/mycourses/program-one/java/week/1/input-output/codingAssignment/MIXEDINPUT
import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc= new Scanner(System.in);
      int n; float f; String s; char ch;
      n=sc.nextInt();
      f=sc.nextFloat();
      s=sc.next();
      ch=s.charAt(0);
      System.out.printf("%d$%.2f$%c", n, f, ch);
    }
  }