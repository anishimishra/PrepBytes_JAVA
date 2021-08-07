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
public class linearProbing {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashTableSlot hashTable=new HashTableSlot(n);
        for(int i=0;i<6;i++){
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

class HashSlots{
    int key;
    int value;
    HashSlots(int k, int v){
        key=k;
        value=v;
    }
}
//ONE SLOT WILL HAVE A KEY AND A VALUE
class HashTableSlot {
    private int size, TABLE_SIZE;
    private HashSlots table[];
    public HashTableSlot(int capacity){
        size=0;
        TABLE_SIZE=capacity;
        table=new HashSlots[TABLE_SIZE];
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
        do {
            if(table[i]==null){
                table[i]=new HashSlots(key,value);
                size++;
                return;
            }
            if(table[i].key==key){
                System.out.println("Duplicate keys not allowed!\n");
                return;
            }
            i=(i+1)%TABLE_SIZE; //linear probe it
        } while(i!=index);
        System.out.println("HashTable is full!");
    }
    //Function to search
    boolean searchElement(int key){
        int index=key%TABLE_SIZE;
        int i=index;
        do {
            if(table[i]==null)
                return false;
            if(table[i].key==key)
                return true;
            i=(i+1)%TABLE_SIZE;
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
10
25 1225
36 1234
125 12355
457 12345
11 123455
69 142
Hashtable[0] has no element: 
Hashtable[1] has element: 
key= 11 and value= 123455
Hashtable[2] has no element: 
Hashtable[3] has no element: 
Hashtable[4] has no element: 
Hashtable[5] has element: 
key= 25 and value= 1225
Hashtable[6] has element: 
key= 36 and value= 1234
Hashtable[7] has element: 
key= 125 and value= 12355
Hashtable[8] has element: 
key= 457 and value= 12345
Hashtable[9] has element: 
key= 69 and value= 142
25 present
6
0
*/