//https://www.prepbytes.com/panel/mycourses/program-one/java/week/1/operators-and-expressions/codingAssignment/CLCKANGLE
import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0)
      {
        int h=sc.nextInt();
        int m=sc.nextInt();
        int h_angle, m_angle,angle;
        if (h<0 || m<0 || h>12 || m>60)
        {
          System.out.println("Wrong input");
        }
        else
        {
          if (h==12) 
            h=0;
          if (m==60) 
            m=0;
          m_angle=m*6;
          h_angle = (h * 360) / 12 + (m * 360) / (12 * 60);
          angle=Math.abs(h_angle-m_angle);
          if(angle > 180)
          {
            angle=360-angle;
          }
          System.out.println(angle);
        }
      }
    }
  }