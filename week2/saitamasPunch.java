//https://www.prepbytes.com/panel/mycourses/program-one/java/week/2/arrays/codingAssignment/SAITAMA

import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-- >0)
      {
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        int i;
        for(i=0;i<=n-1;i++)
        {
          a[i]=sc.nextInt();
        }
        long paralyze_till = a[0] + k;
        long total_time = 0;
        for (i = 1; i < n; i++)
        {
          if (paralyze_till <= a[i])
          {
            total_time = total_time + k;
            paralyze_till = a[i] + k;
          }
          else
          {
            total_time =total_time + (Math.abs(a[i] - a[i - 1]));
            paralyze_till = a[i] + k;
          }
        }
        System.out.println((total_time+k));
      }
    }
  }

/*Start by adding K to the first time point in the array and store it in palalyze_till variable, 
        this will give us the time point till when the Garou is paralyzed by the first punch of Saitama.
Now traverse the array starting from the second element and check whether the calculated paralyze_till is 
        less than or equal to current element, A[i] of the array. This implies Garou was paralyzed for K units
        of time and now is awake. If Yes, increment the value of total_time by K 
        and update paralyze_till = A[i] + K.
If paralyze_till is greater than current element, A[i]. This implies that Garou is still paralyzed and
        again we need to paralyze it for K units of time. So we add the time for which it was paralyzed till now
        and move ahead, updating total_time = A[i] - A[i-1] and paralyze_till = A[i] + K.
Finally add the time for which Garou was paralyzed by the last punch i.e. K units of time.*/