//https://www.prepbytes.com/panel/mycourses/program-one/java/week/3/strings/codingAssignment/NOBVOW

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
        int i,flag=0;
        int len=st.length();
        for(i=0;i<=len-1;i++)
        {
          if(i==0)
          {
            if(st.charAt(i)=='n')
            {
              continue;
            }
          }
          if(i==st.length()-1)
          {
            if(st.charAt(i)!='a'&&st.charAt(i)!='e'&&st.charAt(i)!='i'&&st.charAt(i)!='o'&&st.charAt(i)!='u'&&st.charAt(i)!='n')
            {
              flag=1;
              System.out.println("NO");
              break;
            }
          }
          if(st.charAt(i)!='a'&&st.charAt(i)!='e'&&st.charAt(i)!='i'&&st.charAt(i)!='o'&&st.charAt(i)!='u'&&st.charAt(i)!='n')
          {
            if(st.charAt(i+1)=='a'||st.charAt(i+1)=='e'||st.charAt(i+1)=='i'||st.charAt(i+1)=='o'||st.charAt(i+1)=='u')
            {
              continue;
            }
            else 
            {
              System.out.println("NO");
              flag=1;
              break;
            }
          }
          else if(st.charAt(i)=='n')
          {
            if(st.charAt(i-1)!='a'&&st.charAt(i-1)!='e'&&st.charAt(i-1)!='i'&&st.charAt(i-1)!='o'&&st.charAt(i-1)!='u'&&st.charAt(i-1)!='n')
            {
              flag=1;
              System.out.println("NO");
              break;
            }
            else
            {
              continue;
            }
          }
        }
        if(flag==0)
        {
          System.out.println("YES");
        }
      }
    }
  }