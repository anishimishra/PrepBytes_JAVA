//https://www.prepbytes.com/panel/mycourses/program-one/java/week/2/arrays/codingAssignment/MONK
import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void reverse(int a[], int start, int end)
    {
      while(start<end)
      {
        int temp = a[start]; 
        a[start] = a[end]; 
        a[end] = temp;
        s++;
        e--;
      }
    }
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0)
      {
        int n=sc.nextInt();
        int k=sc.nextInt();
        
        if(n<k)
        {
          k=k%n;
        }
        
        int a[]=new int[n];
        int i;
        for(i=0;i<=n-1;i++)
        {
          a[i]=sc.nextInt();
        }
        reverse(a,0,n-k-1);
        reverse(a,n-k,n-1);
        reverse(a,0,n-1);
        for(i=0;i<=n-1;i++)
        {
          System.out.print(a[i]+" ");
        }
        System.out.println();
        
        
      }
    }
  }