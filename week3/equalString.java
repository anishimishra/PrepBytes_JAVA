//https://www.prepbytes.com/panel/mycourses/program-one/java/week/3/strings/codingAssignment/EQUALSTR

import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-- >0)
      {
        int n=sc.nextInt();
        String st[]=new String[n];
        int i,j,mx,ans=Integer.MAX_VALUE;
        String strvar="";
        for(i=0;i<=n-1;i++)
        {
          st[i]=sc.next();
        }
        for (i = 0; i < n; i++)
        {
          mx = 0;
          for (j = 0; j < n; j++)
          {
            strvar = st[j] + st[j];
            mx+=strvar.indexOf(st[i]);
          }
          ans=Math.min(ans,mx);
        }
        if(ans<0)
          System.out.println("-1");
        else
          System.out.println(ans);
      }
    }
  }


/*v[i]=str1
  v[j] = str2
  varstr = v[j]+v[j]
  find v[i] starting index in varstr
  abcde
  cdeab
  v[i]=abcde
  varstr = cdeabcdeab
  v[i] is present from index=3
  now v[i]= cdeab
  and v[j]=abcde*/