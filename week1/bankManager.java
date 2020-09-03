//https://www.prepbytes.com/panel/mycourses/program-one/java/week/1/iteration-statements/codingAssignment/MCPOP
import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0)
      {
        long n=sc.nextLong();
        long count=0;
        long i;
        for(i=2;i<=n;)
        {
          if(n%i==0)
          {
            count=count+i;
            n=n/i;
          }
          else i++;
          if(n==1)
          break;
        }
        System.out.println(count);
      }
    }
  }