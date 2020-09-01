//https://www.prepbytes.com/panel/mycourses/program-one/java/week/1/decision-making/codingAssignment/OPTPREP
import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner (System.in);
      int x= sc.nextInt();
      int y = sc.nextInt();
      if (x==y) System.out.println(x+" is equal to "+y);
      else if (x>y) System.out.println(x+ " is greater than " +y);
      else if(x<y) System.out.println(x+ " is smaller than "+y);
    }
  }