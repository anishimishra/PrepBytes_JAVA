//https://www.prepbytes.com/panel/mycourses/program-one/java/week/2/arrays/codingAssignment/QUALITY

import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int i;
      for(i=0;i<=n-1;i++)
      {
        a[i]=sc.nextInt();
      }
      long sum=Math.abs(a[0]);
      long diff=0;
      for(i=1;i<n;i++)
      {
        diff=Math.abs(a[i]-a[i-1]);
        sum=sum+diff;
      }
      System.out.println(sum);
    }
  }

/*Calculate how many operations are required to make a 1 = b 1 . It can be observed
that |b 1 | operations are required to make a 1 = b 1 . Now a 2 , a 3 , a 4 , a 5 , .., a n = b 1 .
Operations required to make a 2 = b 2 , will be |b 2 − b 1 |, now a 3 , a 4 , a 5 , .., a n = b 2 .
Operations required to make a 3 = b 3 , will be |b 3 − b 2 |, now a 4 , a 5 , .., a n = b 3 and
so on. For example,
B array = 1, 2, 3, 1
A array = 0, 0, 0, 0
OperationCount=0
To make a 1 = b 1 ,we need to add 1 in a1, i.e just one operation is performed.
B array = 1, 2, 3, 1
A array = 1, 1, 1, 1
OperationCount=1
Now we know that a 2 , a 3 , a 4 , a 5 , .., a n = b 1 , that means we do not need array A
to calculate the next operation, because all element of array A are equal to b 1 ,
so |b 2 − b 1 | will give me the number of operations. |b 2 − b 1 | = 2 − 1 = 1.
B array = 1, 2, 3, 1
A array = 1, 2, 2, 2
1OperationCount= 2
To make a 3 = b 3 , |b 3 − b 2 | = 3 − 2 = 1 therefore,
B array = 1, 2, 3, 1
A array = 1, 2, 3, 3
OperationCount= 3
To make a 4 = b 4 , |b 4 − b 3 | = |1 − 3| = 2, i.e this time we need to subtract one
two times therefore,
B array = 1, 2, 3, 1
A array = 1, 2, 3, 1
OperationCount= 5
So all we need is,
|b 1 | + |b 2 − b 1 | + |b 3 − b 2 | + ....... + |b n − b n−1 | */