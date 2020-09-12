//https://www.prepbytes.com/panel/mycourses/program-one/java/week/1/iteration-statements/codingAssignment/RVSREUM
import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int copy=n,rem,reverse=0;
      while(copy!=0)
      {
        rem=copy%10;
        reverse=(reverse*10)+rem;
        copy=copy/10;
      }
      System.out.println(reverse);
    }
  }
//or can be done as
import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int rem;
    while (n !=0)
    {
      rem= n%10;
      n=n/10;
      System.out.print(rem);
    }
  }
}