//https://www.prepbytes.com/panel/mycourses/program-one/java/week/3/strings/codingAssignment/CARDGAME

import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-- >0)
      {
        String target=sc.next();
        char ch=target.charAt(0);
        char ch1=target.charAt(1);
        String cards[]=new String[5];
	int i=0,flag=0;
        for(i=0;i<5;i++)
        {
          cards[i]=sc.next();
          if(cards[i].charAt(0)==ch ||cards[i].charAt(1)==ch1)
          {
            flag=1;
            //break;
          }
        }
	if(flag==0)
	{
		System.out.println("NO");
	}
	else
	{
		System.out.println("YES");
	}
      }
    }
  }