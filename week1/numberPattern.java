//https://www.prepbytes.com/panel/mycourses/program-one/java/week/1/iteration-statements/codingAssignment/PATTERN2
import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i,j;
      for(i=5;i>=1;i--)
      {
        for(j=1; j<=i;j++)
        {
          System.out.print(j+" ");
        }
        System.out.println();
      }
    }
  }