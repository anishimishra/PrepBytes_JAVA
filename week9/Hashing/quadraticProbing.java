/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashing;
import java.util.Scanner;
/**
 *
 * @author anishi
 */
public class quadraticProbing {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashTableSlotQuadratic hashTable=new HashTableSlotQuadratic(n);
        for(int i=0;i<8;i++){
            int key=sc.nextInt();
            int value=sc.nextInt();
            hashTable.insert(key, value);
        }
        hashTable.display();
        if(hashTable.searchElement(25)){
            System.out.println("25 present");
        } else {
            System.out.println("25 not present");
        }
        System.out.println(hashTable.getSize());
        hashTable.clear();
        System.out.println(hashTable.getSize());
    }
}
class HashSlotsQuadratic{
    int key;
    int value;
    HashSlotsQuadratic(int k, int v){
        key=k;
        value=v;
    }
}
//ONE SLOT WILL HAVE A KEY AND A VALUE
class HashTableSlotQuadratic {
    private int size, TABLE_SIZE;
    private HashSlotsQuadratic table[];
    public HashTableSlotQuadratic(int capacity){
        size=0;
        TABLE_SIZE=capacity;
        table=new HashSlotsQuadratic[TABLE_SIZE];
        for(int i=0; i< TABLE_SIZE;i++)
            table[i]=null;
    }
    // Function to get number of key-value pairs
    public int getSize(){
        return size;
    }
    //Function to clear hash table
    public void clear(){
        for(int i=0; i<TABLE_SIZE; i++){
            table[i]=null;
        }
        size=0;
    }
    //Function to insert key-value pair
    public void insert(int key, int value){
        int index=key%TABLE_SIZE;
        int i=index;
        int p=1;
        do {
            if(table[i]==null){
                table[i]=new HashSlotsQuadratic(key,value);
                size++;
                return;
            }
            if(table[i].key==key){
                System.out.println("Duplicate keys not allowed!\n");
                return;
            }
            i=(index+(p*p))%TABLE_SIZE; //quadratic probe it
            p++;
        } while(i!=index);
        System.out.println("HashTable is full!");
    }
    //Function to search
    boolean searchElement(int key){
        int index=key%TABLE_SIZE;
        int i=index;
        int p=1;
        do {
            if(table[i]==null)
                return false;
            if(table[i].key==key)
                return true;
            i=(index+(p*p))%TABLE_SIZE;
            p++;
        } while(i!=index);
        return false;
    }
    //Function to display
    void display(){
        for(int i=0;i<TABLE_SIZE;i++){
            if(table[i]==null)
                System.out.println("Hashtable["+i+"] has no element: ");
            else {
                System.out.println("Hashtable["+i+"] has element: ");
                System.out.println("key= "+table[i].key +" and value= "+table[i].value);
            }
        }
    }
}
/*
11
31 450
19 449
2 451
13 452
25 453
24 454
21 455
9 456
Hashtable[0] has no element: 
Hashtable[1] has no element: 
Hashtable[2] has element: 
key= 2 and value= 451
Hashtable[3] has element: 
key= 13 and value= 452
Hashtable[4] has element: 
key= 25 and value= 453
Hashtable[5] has no element: 
Hashtable[6] has element: 
key= 24 and value= 454
Hashtable[7] has element: 
key= 9 and value= 456
Hashtable[8] has element: 
key= 19 and value= 449
Hashtable[9] has element: 
key= 31 and value= 450
Hashtable[10] has element: 
key= 21 and value= 455
25 present
8
0
*/