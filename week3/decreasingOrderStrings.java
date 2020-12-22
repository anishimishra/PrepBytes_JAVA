//https://www.prepbytes.com/panel/mycourses/program-one/java/week/3/strings/codingAssignment/DESCSTR

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
        int i,j;
        char a[]=st.toCharArray();  //CONVERT TO CHARACTER ARRAY
        char temp;
        for(i=0;i<a.length;i++)
        {
          for(j=i+1;j<a.length;j++)
          {
            if(a[i]<a[j])
            {
              temp=a[i];
              a[i]=a[j];
              a[j]=temp;
            }
          }
        }
        System.out.println(a);
      }
    }
  }
  