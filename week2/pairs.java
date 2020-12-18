//https://www.prepbytes.com/panel/mycourses/program-one/java/week/2/arrays/codingAssignment/PAIRS

import java.util.*;
import java.io.*;
public class Main 
{
  static int n,m;
  static int l[]=new int[300001];
  static int r[]=new int[300001];
  public static int check(int x)
  {
    int c[]=new int[300001];
    int i,cnt=0;
    for(i=0;i<m;i++)
      if(x==l[i]||x==r[i])
        cnt++;
      else
      {
        c[l[i]]++;
        c[r[i]]++;
      }
      for(i=1;i<=n;i++)
        if(cnt+c[i]==m)
          return 1;
        return 0;
    }
  public static void main(String args[]) throws IOException 
  {
    int i;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    m=sc.nextInt();
    for(i=0;i<m;i++)
    {
      l[i]=sc.nextInt();
      r[i]=sc.nextInt();
    }
    int x_= l[0];
    int y_ = r[0];
    if((check(x_)==1) || (check(y_)==1))
      System.out.println("YES");
    else
      System.out.println("NO");
  }
}