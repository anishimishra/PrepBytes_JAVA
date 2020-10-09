//https://www.prepbytes.com/panel/mycourses/program-one/java/week/4/recursion/codingAssignment/PATRN
import java.util.*;
  import java.io.*;
  
  public class Main 
  {
    static void fun(int n) //this function is made static so that we can call this function without
    {                                //the object
      System.out.print(n+" ");
      if(n<=0)
      {
        return ;
      }
      fun(n-5);
      System.out.print(n+" ");
    }

    public static void main(String args[]) throws IOException 
    {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0)
      {
        int n=sc.nextInt();
        fun(n);
        System.out.println();
      }
    }
  }
// at the starting of the function print statement is there to print the decreasing number 
// base condition is n<=0; if n exceeds by 0 then statement is returned
// next print is there to print the increasing number till n
// stack formed will be:
// fun(16)->fun(11)->fun(6)->fun(1)->fun(-4) here the condition becomes false and returns
// so the left over elements in the stack gets printed one by one