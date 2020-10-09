//https://www.prepbytes.com/panel/mycourses/program-one/java/week/2/arrays/codingAssignment/LEADARR

import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0)
      {
        int n=sc.nextInt();
        int a[]=new int[n];
        int i;
        for(i=0;i<=n-1;i++)
        {
          a[i]=sc.nextInt();
        }
        int max=a[n-1];
        for(i=n-1;i>=0;i--)
        {
          if(i==(n-1))
          {
            System.out.print(a[i]+" ");
            continue;
          }
          if(a[i]>a[i+1] && max<=a[i])
          {
            max=a[i];
            System.out.print(a[i]+" ");
          }
        }
        System.out.println();
      }
    }
  }

/*Input
3
5
1 2 4 3 10
5
1 2 3 4 5
4
1 4 3 2
output
10 
5 
2 3 4 */
