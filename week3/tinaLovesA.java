//https://www.prepbytes.com/panel/mycourses/program-one/java/week/3/strings/codingAssignment/LOVEA

import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-- >0)
      {
        String st=sc.next();
        int i,count=0;
        int len=st.length();
        for(i=0;i<=len-1;i++)
        {
          char ch=st.charAt(i);
          if(ch=='a')
          {
            count++;
          }
        }
        int good=(len/2)+1;
        if(count>=good)
          System.out.println(len);
        else
        {
          while(count<=good)
          {
            len--;
            good=(len/2);
          }
          System.out.println(len);
        }
      }
    }
  }