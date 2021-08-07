/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashing;
import java.util.*;
/**
 *
 * @author anishi
 */
/*
GIVEN TWO ARRAYS OF UNORDERED NUMBERS, CHECK WHETHER BOTH 
ARRAYS HAVE SAME SET OF NUMBERS
*/
public class sameSetOfElements {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            for(int i=0;i<n;i++)
                b[i]=sc.nextInt();
            
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                if(map.get(a[i])==null)
                    map.put(a[i], 1);
                else {
                    map.put(a[i], map.get(a[i])+1);
                }
            }
            
            boolean flag=true;
            for(int i=0;i<n;i++){
                if(!map.containsKey(b[i])){
                    flag=false;
                    break;
                }
                if(map.get(b[i])==0){
                    flag=false;
                    break;
                }
                map.put(b[i], map.get(b[i]-1));
            }
            if(flag)
                System.out.println("Same set");
            else
                System.out.println("Different set");
        }
    }
}
