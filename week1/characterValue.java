//https://www.prepbytes.com/panel/mycourses/program-one/java/week/1/decision-making/codingAssignment/CHVAL
import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc= new Scanner(System.in);
      String s= sc.next();
      char ch= s.charAt(0);
      switch (ch)
      {
        case 'P':
        case 'p': 
          System.out.println("PrepBytes");
          break;
        case 'Z':
        case 'z':
          System.out.println("Zenith");
          break;
        case 'E':
        case 'e':
          System.out.println("Expert Coder");
          break;
        case 'D':
        case 'd':
          System.out.println("Data Structure");
          break;
      }
    }
  }