/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap;
import java.util.*;
/**
 *
 * @author anishi
 */
public class minHeapMain {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        int n=sc.nextInt(); //size of heap
        minHeap mheap=new minHeap(n);
        for(int i=1;i<=n;i++){
            System.out.println("Enter an element: ");
            mheap.insert(sc.nextInt());
        }
        /*System.out.println("Before build heap: ");
        mheap.printHeap();
        mheap.buildHeap();
        System.out.println("\n");
        System.out.println("After build heap: ");
        mheap.printHeap();
        System.out.println("\nMin key: "+mheap.extractMin());
        System.out.println("After deleting: ");
        mheap.printHeap();
        System.out.println("\nEnter position and key: ");
        int pos=sc.nextInt();
        int key=sc.nextInt();
        mheap.decreaseKey(pos,key);
        mheap.printHeap();*/
        mheap.heapSort();
        System.out.println("After sorting: ");
        mheap.printHeap();
    }
}
