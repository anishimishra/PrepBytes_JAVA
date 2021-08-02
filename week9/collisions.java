//https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/9/hashing/video/b8de252761844e1183ba9439677ef37f

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

// TO LESSEN THE COLLISIONS INSTEAD OF MOD 10 WE ARE DOING PRIME NUMBER THINGY THAT IS MOD 11
public class collisions {
    public static void main(String args[]){
        int a[]={11,141,156,66,296,752};
        int hash[]=new int[11];
        int i;
        for(i=0;i<11;i++){
            hash[i]=-1;
        }
        for(i=0;i<6;i++){
            hash[a[i]%11]=a[i];
        }
        for(i=0;i<11;i++){
            if(hash[i]!=-1)
                System.out.println("Element present at slot index "+i+" is "+hash[i]);
        }
    }
}
