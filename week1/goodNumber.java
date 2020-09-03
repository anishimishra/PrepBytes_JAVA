//https://www.prepbytes.com/panel/mycourses/program-one/java/week/1/iteration-statements/codingAssignment/DISNUM
/*We have to print the number greater than or equal to N which is good number or not, a good number is number which can be represented by sum of distinct powers of 3,
Taking example above
89 is not a good number, so we find sum of powers of 3 untill it become larger than N,
So
121 is greater than 89, and can be represented as 3⁰+3¹+3²+3³+3⁴, here you can see all powers are distinct,
But we have to print the lowest number that is greater than equal to 89,
So we start removing powers which decrease the final value but doesn't affect the property of good numbers,.
Removing 3³ i.e. 81 from 121 gives a number less than 89 which can be a good number but not greater than or equal to 89.
If we try to remove 3³, we get a good number greater than 89, but we check further if it can be reduced or not, so our final current sum is 94,
We again remove 3² from 94, but it makes number less than 89, so we skip it,
We remove 3¹ from it, making number 91, which is possible answer, but we try to optimize it more, so our new number is 91,
Now we can only remove 3⁰, which forms 90, which is greater than 89, and is sum of power of 3s, i.e. 90 can be represented as 3⁵+3². Hence this the lowest good number which is greater than or equal to 89.*/
import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0) 
      {
        long n=sc.nextLong();
        long pow=3;
        long sum=1;
        while(sum<n)  //run a loop and keep on adding power of three till variable>=N
        {
          sum+=pow;
          pow=pow*3;
        }
        while(pow>0) //then run a loop and subtract the extra power with condition that number should remain >=N
        {
          if(sum-pow>=n)
            sum-=pow;
          pow/=3;  
        }
        System.out.println(sum);
      }
    }
  }
