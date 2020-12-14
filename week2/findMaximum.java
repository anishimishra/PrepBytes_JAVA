//https://www.prepbytes.com/panel/mycourses/program-one/java/week/2/arrays/codingAssignment/MAXIMUM


//bruteforce approach:
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
      int maxDiff = -1;
        int j;
 
        for (i = 0; i < n; ++i) {
            for (j = n - 1; j > i; --j) {
                if (a[j] > a[i] && maxDiff < (j - i))
                    maxDiff = j - i;
            }
        }
 
        System.out.println(maxDiff);
    }
  }

//optimised approach:
import java.util.*;
import java.io.*;

class FindMaximum {
    /* Utility Functions to get max and minimum of two integers */
    int max(int x, int y)
    {
        return x > y ? x : y;
    }
 
    int min(int x, int y)
    {
        return x < y ? x : y;
    }
 
    /* For a given array arr[], returns the maximum j-i such that
       arr[j] > arr[i] */
    int maxIndexDiff(int arr[], int n)
    {
        int maxDiff;
        int i, j;
 
        int RMax[] = new int[n];
        int LMin[] = new int[n];
 
        /* Construct LMin[] such that LMin[i] stores the minimum value
           from (arr[0], arr[1], ... arr[i]) 
           leftmin at index 0 stores the smallest value till index 0 
           i.e the value at index 0 at index 1 stores smallest value at index 1 and so on*/
        LMin[0] = arr[0];
        for (i = 1; i < n; ++i)
            LMin[i] = min(arr[i], LMin[i - 1]);
 
        /* Construct RMax[] such that RMax[j] stores the maximum value
           from (arr[j], arr[j+1], ..arr[n-1]) 
            rightmax will store maximum value from the right side upto an index*/
        RMax[n - 1] = arr[n - 1];
        for (j = n - 2; j >= 0; --j)
            RMax[j] = max(arr[j], RMax[j + 1]);
 
        /* Traverse both arrays from left to right to find optimum j - i
           This process is similar to merge() of MergeSort */
        i = 0;
        j = 0;
        maxDiff = -1;
        while (j < n && i < n) {
            if (LMin[i] < RMax[j]) {
                maxDiff = max(maxDiff, j - i);
                j = j + 1;
            }
            else
                i = i + 1;
        }
 
        return maxDiff;
    }
    public static void main(String[] args)
    {
        FindMaximum max = new FindMaximum();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<=n-1;i++)
        {
          a[i]=sc.nextInt();
        }
        int maxDiff = max.maxIndexDiff(a, n);
        System.out.println(maxDiff);
    }
}

/*To solve this problem, we need to get two optimum indexes of arr[]: left index i and right index j. 
For an element arr[i], we do not need to consider arr[i] for left index if there is an element smaller than 
arr[i] on left side of arr[i]. Similarly, if there is a greater element on right side of arr[j] then we do not 
need to consider this j for right index. So we construct two auxiliary arrays LMin[] and RMax[] such that LMin[i] 
holds the smallest element on left side of arr[i] including arr[i], and RMax[j] holds the greatest element on 
right side of arr[j] including arr[j]. After constructing these two auxiliary arrays, we traverse both of these 
arrays from left to right. While traversing LMin[] and RMa[] if we see that LMin[i] is greater than RMax[j], then
we must move ahead in LMin[] (or do i++) because all elements on left of LMin[i] are greater than or equal to 
LMin[i]. Otherwise we must move ahead in RMax[j] to look for a greater j – i value.*/

/*The problem can be solved by simply finding out two Optimum Indexes of the array, left index i and right 
     index j.
For an element A[i], we need not consider it for the left index if there exists a smaller element than A[i] 
      on its left side.
Similarly for an element A[i], we need not consider it for the right index if there exits a greater element 
     on its right side.
Now construct two arrays : leftMin[] and rightMax[],
  such that leftMin[i] contains the smallest element on its left side including itself and 
  rightMax[i] contains the largest element on its right side including itself.
Start traversing both the arrays from left to right.
While traversing :-
        if leftMin[i] > rightMax[i], then we simply move ahead in leftMin[] by 1, as all elements to the left of leftMin[i] are either greater than or equal to leftMin[i]
        if leftMin[i] < rightMax[i], then we move ahead in rightMax[i] to look for a better value of j-i. */
