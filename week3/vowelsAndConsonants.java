//https://www.prepbytes.com/panel/mycourses/program-one/java/week/3/strings/codingAssignment/VOWCON

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
        int i,v=0,c=0;
        char ch;
        int l=st.length();
        for(i=0;i<=l-1;i++)
        {
          ch=st.charAt(i);
          if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
          {
            v++;
          }
          else
          {
            c++;
          }
        }
        System.out.println(v + " "+ c);
      }
    }
  }