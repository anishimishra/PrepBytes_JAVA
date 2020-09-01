//https://www.prepbytes.com/panel/mycourses/program-one/java/week/1/input-output/codingAssignment/PRINTDOUBLEN
import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      double d;
      d=sc.nextDouble();
      System.out.printf("%.2f", d);
    }
  }