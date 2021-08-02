//https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/9/hashing/video/da62a3c790ad4fc1a2da83fa6b035d5d

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
public class directAddressing {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the maximum capacity");
        int n=sc.nextInt(); //maximum capacity
        HashTable hashTable =new HashTable(n);
        for(int i=0;i<n;i++){
            System.out.println("Enter key");
            int key=sc.nextInt();
            System.out.println("Enter value");
            int value=sc.nextInt();
            hashTable.insert(key, value);
        }
        hashTable.printHashTable();
        System.out.println(hashTable.getValue(1000));
        System.out.println(hashTable.getSize());
        hashTable.clear();
        System.out.println(hashTable.getSize());
    }
}

class LinkedHash {
    int key;
    int value;
    LinkedHash next;
    LinkedHash(int key, int value){
        this.key=key;
        this.value=value;
        this.next=null;
    }
}

class HashTable {
    private int TABLE_SIZE; //maximum capacity
    private int size; //keeps increasing as we insert elements
    private LinkedHash table[];
    
    public HashTable(int capacity){
        size=0;
        TABLE_SIZE= capacity;
        table = new LinkedHash[TABLE_SIZE];
        for(int i=0;i<TABLE_SIZE; i++){
            table[i]=null;
        }
    } 
    public int getSize(){
        return size;
    }
    public void clear(){
        for(int i=0;i<TABLE_SIZE;i++){
            table[i]=null;
        }
        size=0;
    }
    public int getValue(int key){
        int hash=(key%TABLE_SIZE);
        if(table[hash]==null)
            return -1;
        else {
            LinkedHash entry=table[hash];
            while(entry!=null && !(entry.key==key))
                entry=entry.next;
            if(entry==null)
                return -1;
            else
                return entry.value;
        }
    }
    public void insert(int key, int value){
        int hash=(key%TABLE_SIZE);
        if(table[hash]==null){
            table[hash]=new LinkedHash(key, value);
        } else {
            LinkedHash entry =table[hash];
            while(entry.next!=null){ //not taking duplicate keys then second condition of the while statement is not required
            //while(entry.next!=null && !(entry.key==key))
                entry=entry.next;
            }
            if(entry.key==key){
                System.out.println("Duplicate keys not allowed");
                return;
                //entry.value=value;
            } else {
                entry.next= new LinkedHash(key, value);
            }
        }
        size++;
    }
    public void printHashTable(){
        for(int i=0;i< TABLE_SIZE;i++){
            System.out.print("\nBucket"+(i+1)+" : ");  // bucket is the index 
            LinkedHash entry = table[i];
            while(entry!=null){
                System.out.print("key= "+entry.key+" value= "+entry.value);
                entry=entry.next;
            }
        }
    }
}

/*
Enter the maximum capacity
10
Enter key
121
Enter value
132
Enter key
1321
Enter value
412
Enter key
454 45
Enter value
Enter key
555
Enter value
345
Enter key
54
Enter value
213
Enter key
615
Enter value
142
Enter key
431
Enter value
123
Enter key
5418
Enter value
99
Enter key
999
Enter value
87
Enter key
23
Enter value
489

Bucket1 : 
Bucket2 : key= 121 value= 132key= 1321 value= 412key= 431 value= 123
Bucket3 : 
Bucket4 : key= 23 value= 489
Bucket5 : key= 454 value= 45key= 54 value= 213
Bucket6 : key= 555 value= 345key= 615 value= 142
Bucket7 : 
Bucket8 : 
Bucket9 : key= 5418 value= 99
Bucket10 : key= 999 value= 87-1
10
0
*/