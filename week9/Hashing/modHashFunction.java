//https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/9/hashing/video/f687a494f5c64317abc09edb7e99774d

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashing;

/**
 *
 * @author anishi
 */
public class ModHashFunction {
    public static void main(String args[]){
        int a[]={11,156,145,172,293,758};
        int hash[]=new int[10];
        int i;
        for(i=0;i<10;i++){
            hash[i]=-1;
        }
        for(i=0;i<6;i++){
            hash[a[i]%10]=a[i];
        }
        for(i=0;i<10;i++){
            if(hash[i]!=-1)
                System.out.println("Element present at slot index "+i+" is "+hash[i]);
        }
        if(hash[172%10]==-1)
            System.out.println("false");
        else 
            System.out.println(hash[172%10]);
        if(hash[300%10]==-1)
            System.out.println("false");
        else 
            System.out.println(hash[300%10]);
    }
}
