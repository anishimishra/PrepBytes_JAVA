//https://www.prepbytes.com/panel/mycourses/program-one/java/week/3/strings/codingAssignment/LOVELETTER

import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-- >0)
      {
        String st =sc.next();
        int len=st.length();
        int op=0;
        for(int i=0 ; i< len/2 ; i++)
        {
          char ch=st.charAt(i);
          char ch1=st.charAt(len-i-1);
          op = op + Math.abs(ch-ch1);
        }
        System.out.println(op);
      }
    }
  }

/* String st="abcd" 
charAt(i)=97 charAt(len-i-1)=100 and charAt(i)=98 charAt(len-i-1)=99
97-100=3 and 98-99=1 =>3+1=4*/