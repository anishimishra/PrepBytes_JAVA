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
public class maxHeapMain {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        int n=sc.nextInt(); //size of heap
        maxHeap mheap=new maxHeap(n);
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
        System.out.println("\nMax key: "+mheap.extractMax());
        System.out.println("After deleting: ");
        mheap.printHeap();
        System.out.println("\nEnter position and key: ");
        int pos=sc.nextInt();
        int key=sc.nextInt();
        mheap.increaseKey(pos,key);
        mheap.printHeap();*/
        mheap.heapSort();
        System.out.println("After sorting: ");
        mheap.printHeap();
    }
}
/*
Enter size: 
10
Enter an element: 
1
Enter an element: 
17
Enter an element: 
10
Enter an element: 
3
Enter an element: 
8
Enter an element: 
15
Enter an element: 
9
Enter an element: 
2
Enter an element: 
13
Enter an element: 
6
Before build heap: 
1 17 10 3 8 15 9 2 13 6 

After build heap: 
17 13 15 3 8 10 9 2 1 6
*/

/*
Enter size: 
7
Enter an element: 
90
Enter an element: 
80
Enter an element: 
70
Enter an element: 
10
Enter an element: 
30
Enter an element: 
50
Enter an element: 
20
Before build heap: 
90 80 70 10 30 50 20 

After build heap: 
90 80 70 10 30 50 20 
Max key: 90
After deleting: 
80 30 70 10 20 50
*/

/*
Enter size: 
7
Enter an element: 
200
Enter an element: 
50
Enter an element: 
20
Enter an element: 
5
Enter an element: 
30
Enter an element: 
15
Enter an element: 
10
Before build heap: 
200 50 20 5 30 15 10 

After build heap: 
200 50 20 5 30 15 10 
Enter position and key: 
5
400
400 200 20 5 50 15 10 
*/

/*
Enter size: 
7
Enter an element: 
200
Enter an element: 
30
Enter an element: 
15
Enter an element: 
5
Enter an element: 
50
Enter an element: 
20
Enter an element: 
10
After sorting: 
5 10 15 20 30 50 200
*/