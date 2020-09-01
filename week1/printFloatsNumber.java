//https://www.prepbytes.com/panel/mycourses/program-one/java/week/1/input-output/codingAssignment/PRIFLOATNUM
import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      float n, m;
      n=sc.nextFloat();
      m=sc.nextFloat();
      System.out.printf("%.2f %.2f", n, m);
    }
  }