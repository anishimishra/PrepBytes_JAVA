/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashing;
import java.util.Scanner;
import java.util.HashMap;
/**
 *
 * @author anishi
 */
/*
FIND THE LENGTH OF THE LARGEST SUB ARRAY WITH SUM =0
*/
public class largestZeroSumSubArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            System.out.println(maxSubArray(a,n));
        }
    }
    //in key sum is getting stored, in value index getting stored
    private static int maxSubArray(int a[],int n){
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int maxLength=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(a[i]==0&&maxLength==0)
                maxLength=1;
            if(sum==0)
                maxLength=i+1;
            if(map.get(sum)!=null)
                maxLength=Math.max(maxLength,i-map.get(sum));
            else 
                map.put(sum, i);
        }
        return maxLength;
    }
}
/*
2
7
3 -3 4 5 -6 20 30
4
3
5 0 3
1
*/