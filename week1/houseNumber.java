//https://www.prepbytes.com/panel/mycourses/program-one/java/week/1/iteration-statements/codingAssignment/HSNUM
import java.util.*;
  import java.io.*;
  public class Main {
    public static void main(String args[]) throws IOException 
    {
     Scanner sc=new Scanner(System.in);
      int t;
      t=sc.nextInt();
      while(t-->0)
      {
        long n=sc.nextLong();
        long number_of_digits=0;
        for (int i = 1; i <= n; i *= 10)
          number_of_digits += (n - i + 1);
        System.out.println(number_of_digits);
      }
    }
  }
//can be also done by using the following code
import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while (t-->0)
      {
        long count=0;
        long n=sc.nextLong();
        long a[]=new long[13];
        
        for(int i=1;i<13;i++)
        {
          a[i]=(long)Math.pow(10,i)-1;
        }
        for(int i=2;i<13;i++)
        {
          for(int j=1;j<=i-1;j++)
          {
            a[i] = a[i]-a[j];
          }
        }
        //for(int i=1;i<13;i++)
        // {
        //System.out.print(a[i]+" ");
        //}
        for (int i=1;i<13;i++)
        {
          if(n-a[i]>=0)
          {
            count=count+a[i];
            n=n-a[i];
          }
          else
          {
            count=count+n*i;
            break;
          }
        }
        System.out.println(count);
      }
    }
  }