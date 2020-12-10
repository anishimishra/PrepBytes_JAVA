//https://www.prepbytes.com/panel/mycourses/program-one/java/week/3/strings/codingAssignment/AMANSTR

import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while (t-- >0)
      {
        String st=sc.next();
        char s[]=st.toCharArray();
        int i,count=0,len=s.length,prev=0;
        for(i=0;i<len-3;i++)
        {
          if(s[i]=='a' && s[i+1]=='m' && s[i+2]=='a' && s[i+3]=='n')
          {
            count=count+(i+1-prev)*(len-(i+3));
            prev=i+1;
          }
        }
        System.out.println(count);
      }
    }
  }