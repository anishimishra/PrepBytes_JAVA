//https://www.prepbytes.com/panel/mycourses/program-one/java/week/2/arrays/codingAssignment/MAXDIFF

import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while (t-- >0)
      {
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,max,j,var;
        for(i=0;i<=n-1;i++)
        {
          a[i]=sc.nextInt();
        }
        max=0;
        for(i=0;i<=n-1;i++)
        {
          for(j=i+1;j<=n-1;j++)
          {
            var=Math.abs(a[i]-a[j])+Math.abs(i-j);
            if(max<var)
              max=var;
          }
        }
        System.out.println(max);
      }
    }
  }

//APPROACH 2 with less time
//following four equations
//1. arr[i] – arr[j] + i – j = (arr[i] + i) – (arr[j] + j)
//2. arr[i] – arr[j] – i + j = (arr[i] – i) – (arr[j] – j)
//3. -arr[i] + arr[j] + i – j = -(arr[i] – i) + (arr[j] – j)
//4. -arr[i] + arr[j] – i + j = -(arr[i] + i) + (arr[j] + j)
//1 and 4 are same, 2 and 3 are same
/* Now the task is to find the maximum value of these equation. So the approach is to form two arrays, first_array[], it will store arr[i] + i, 0 <= i < n, second_array[], it will store arr[i] – i, 0 <= i < n.
Now our task is easy we just need to find the maximum difference between two values these two arrays.
For that, we find maximum value and minimum value in first_array and store their difference:
ans1 = (maximum value in first_array – minimum value in first_array)
Similarly, we need to find maximum value and minimum value in second_array and store their difference:
ans2 = (maximum value in second_array – minimum value in second_array)
Our answer will be maximum of ans1 and ans2.*/
 
import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while (t-- >0)
      {
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,max,j,var,min;
        for(i=0;i<=n-1;i++)
        {
          a[i]=sc.nextInt();
        }
        int b[]=new int[n];
        int c[]=new int [n];
        for(i=0;i<=n-1;i++)
        {
          b[i]=a[i]+i;
          c[i]=a[i]-i;
        }
        max=b[0];
        min=b[0];
        for (i = 0; i < n; i++)  
        { 
          if (b[i] > max) 
            max = b[i]; 
          if (b[i] < min) 
            min = b[i]; 
        }
        int ans1 = (max - min); 
        max = c[0]; 
        min = c[0];
        for (i = 0; i < n; i++)  
        { 
          if (c[i] > max) 
            max = c[i]; 
          if (c[i] < min) 
            min = c[i]; 
        }
        int ans2 = (max - min);
        System.out.println(Math.max(ans1,ans2));
      }
    }
  }