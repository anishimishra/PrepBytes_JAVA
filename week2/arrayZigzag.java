//https://www.prepbytes.com/panel/mycourses/program-one/java/week/2/arrays/codingAssignment/ARRZIGZAG
//https://www.youtube.com/watch?v=_vbIV4cNh8A

import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i;
      int a[]=new int[n];
      for(i=0;i<=n-1;i++)
      {
        a[i]=sc.nextInt();
      }
      int even=0, odd=0;  //to keep record of the moves
      int b[]=new int[n];
      for(i=0;i<=n-1;i++)
      {
        b[i]=a[i];  //copy all elements because after even-element index is calculated it
                     // it will be manipulated.
      }
      for(i=0;i<=n-1;i++)
      {
        if(i+1<n)
        {
          if(i%2==0)
          {
            if(a[i]<=a[i+1])
            {
              int diff=a[i+1]-a[i];
              even=even+(diff+1);
              a[i+1]=a[i+1]-(diff+1);
            }
          }
          else
          {
            if(a[i]>=a[i+1])
            {
              int diff=a[i]-a[i+1];
              even=even+(diff+1);
              a[i]=a[i]-(diff+1);
            }
          }
        }
      }
      for(i=0;i<=n-1;i++)
      {
        if(i+1<n)
        {
          if(i%2==0)
          {
            if(b[i]>=b[i+1])
            {
              int diff=b[i]-b[i+1];
              odd=odd+(diff+1);
              b[i]=b[i]-(diff+1);
            }
          }
          else
          {
            if(b[i]<=b[i+1])
            {
              int diff=b[i+1]-b[i];
              odd=odd+(diff+1);
              b[i+1]=b[i+1]-(diff+1);
            }
          }
        }
      }
      System.out.println(Math.min(even,odd));
    }
  }

/*here you can make the array into zigzag array by decreasing the values of adjacent elements and you can do 
this as odd indexed or even indexed but we want the minimum here so in the
ex: 2 3 4 when you consider even index we can decrease 3 to 1 and every even index element is greater than 
its adjacent elements when we make that change so ans is 2

We will solve this problem two times.
For the even-indexed array.
For the odd-indexed array.
Minimum of both the solutions will be our desired solution.
Start traversing the array, for each element find the minimum value among the element , previous element - 1 and next element - 1.
The difference between current element and calculated minimum value is the moves required to correctly position these three elements.
Similarly, keep doing it for the entire array and keep track of a sum variable.
sum += ( A[i] - min(A[i],A[i-1]-1,A[i+1]-1) )*/
