//https://www.prepbytes.com/panel/mycourses/program-one/java/week/1/iteration-statements/codingAssignment/PATTERN1
import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=0; i<=4;i++)
      {
        for(int j=0; j<=i;j++)
        {
          System.out.print(n+ " ");
        }
        System.out.println();
      }
    }
  }