//https://www.prepbytes.com/panel/mycourses/program-one/java/week/1/iteration-statements/codingAssignment/PATTERN3
import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      String st=sc.next();
      char ch=st.charAt(0);
      for(int i=1; i<=5;i++)
      {
        //left part
        for(int l=1; l<=i;l++)
        {
          System.out.print(l);
        }
        //space
         int space=8;
         for(int k=2*i;k<=space;k++)
      {
        System.out.print(" ");
        space=space-2;
      }
        //right part
        for (int r=i;r>=1;r--)
        {
          System.out.print(r);
        }
        System.out.println();
      }
    }
  }