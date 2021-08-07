//https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/9/hashing/video/f687a494f5c64317abc09edb7e99774d

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashing;
import java.io.IOException;
import java.util.*;
/**
 *
 * @author anishi
 */
public class modHashUserInput {
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" elements");
        int arr[]=new int[n];
        int hash[]=new int[10];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            hash[i]=-1;
        }
        for(int i=0;i<n;i++)
        {
            hash[arr[i]%10]=arr[i];
        }
        for(int i=0;i<10;i++){
            if(hash[i]!=-1)
                System.out.println("Element present at slot index "+i+" is "+hash[i]);
        }
        /*if(hash[]!=-1)
            System.out.println(hash[i]);
        else
            System.out.println("false");*/
    }
}
