//https://www.prepbytes.com/panel/mycourses/program-one/java/week/3/strings/codingAssignment/DUPTCHAR

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
        int freq[]=new int[26];
        int i,flag=0;
        for(i=0;i<st.length();i++)
        {
          freq[st.charAt(i)-97]++;
        }
        for(i=0;i<26;i++)
        {
          if(freq[i]>=2)
          {
            //int k=freq[st.charAt(i)-97];
            //char ch=st.charAt(i);
            flag=1;
            System.out.print((char)(i+97)+"="+freq[i]+" ");
          }
        }
        if(flag==0)
          System.out.println("-1");
        System.out.println();
      }
    }
  }


//IF TO PRINT IN ALPHABETICAL ORDER IS NOT ASKED THEN THE FOLLOWING APPROACH CAN ALSO BE USED
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
        int freq[]=new int[26];
        int i,flag=0;
        for(i=0;i<=25;i++)
        {
          freq[i]=0;
        }
        for(i=0;i<st.length();i++)
        {
          freq[st.charAt(i)-97]++;
        }
        for(i=0;i<st.length();i++)
        {
          if(freq[st.charAt(i)-97]>=2)
          {
            //int k=freq[st.charAt(i)-97];
            //char ch=st.charAt(i);
            flag=1;
            System.out.print((st.charAt(i))+"="+(freq[st.charAt(i)-97])+" ");
            freq[st.charAt(i)-97]=0;
          }
        }
        if(flag==0)
          System.out.println("-1");
        System.out.println();
      }
    }
  }