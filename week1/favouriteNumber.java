//https://www.prepbytes.com/panel/mycourses/program-one/java/week/1/iteration-statements/codingAssignment/FIVEFAV
import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner (System.in);
      int t=sc.nextInt();
      while (t-->0)
      {
        int n=sc.nextInt();
        int rem,counter=0;
        while(n!=0)
        {
          rem=n%10;
          if(rem==5)
          {
            counter++;
          }
          n=n/10;
        }
        System.out.println(counter);
      }
    }
  }