//https://www.prepbytes.com/panel/mycourses/program-one/java/week/2/arrays/codingAssignment/FRINDSAGE

/*Instead of processing all 20000 people, we can process pairs of (age, count) representing how many people are 
that age. Since there are only 120 possible ages, this is a much faster loop.

For each pair (ageA, countA), (ageB, countB), if the conditions are satisfied with respect to age, 
then countA * countB pairs of people made friend requests.

If ageA == ageB, then we overcounted: we should have countA * (countA - 1) pairs of people making friend 
requests instead, as you cannot friend request yourself.*/

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
        int[] count = new int[121];
        for (i=0; i<n;i++) 
		count[a[i]]++;

        int ans = 0;
        for (int ageA = 0; ageA <= 120; ageA++) 
	{
            int countA = count[ageA];
            for (int ageB = 0; ageB <= 120; ageB++) 
	    {
                int countB = count[ageB];
                if (ageA * 0.5 + 7 >= ageB) 
			continue;
                if (ageA < ageB) 
			continue;
                if (ageA < 100 && 100 < ageB) 
			continue;
                ans += countA * countB;
                if (ageA == ageB) 
			ans -= countA;
            }
        }

        System.out.println(ans);
    }
  }