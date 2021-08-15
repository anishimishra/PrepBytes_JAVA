/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap;

/**
 *
 * @author anishi
 */
public class minHeap {
    private int heap[];
    private int size;
    private int minSize;
    
    minHeap(int minSize){
        this.minSize=minSize;
        size=0;
        heap= new int[this.minSize+1];
        heap[0]=Integer.MIN_VALUE;
    }
    
    void insert(int element){
        heap[++size]=element;
        int i=size;
        while(i>1 && heap[i]<heap[i/2]){
            swap(i,i/2);
            i=i/2;
        }
    }
    
    void buildHeap(){ //time complexity- O(n)
        int j=(int)Math.floor(size/2.0); //calculate first non-leaf
        for(int i=j;i>=1;i--){
            MinHeapify(heap,i);
        }
    }
    
    private boolean isLeaf(int position){
        if(position>(size/2) && position<=size){
            return true;
        } else {
            return false;
        }
    }
    
    private void MinHeapify(int heap[], int i){ //time complexity same as height- worst case O(log n)
        if( isLeaf(i)){
            return;
        }
        int leftChild=2*i;
        int rightChild=(2*i)+1;
        if(rightChild<=size){
            if(heap[i]<=heap[leftChild] && heap[i]<=heap[rightChild]){
                return;
            } 
        } else { //when right child is not present
            if(heap[i]<=heap[leftChild]){
                return;
            }
        }
        int smallest;
        if(leftChild<=size && heap[leftChild]<heap[i]){
            smallest=leftChild;
        } else {
            smallest =i;
        }
        if(rightChild<=size && heap[rightChild]<heap[smallest]){
            smallest=rightChild;
        }
        if(smallest!=i){
            swap(smallest,i);
        }
        MinHeapify(heap,smallest);
    }

    private void swap(int smallest, int i) {
        int temp;
        temp=heap[smallest];
        heap[smallest]=heap[i];
        heap[i]=temp;
    }
    
    void printHeap(){
        for(int i=1;i<=size;i++){
            System.out.print(heap[i]+" ");
        }
    }
    
    int extractMin(){
        if(size<1){
            System.out.println("Error");
        }
        int min=heap[1];
        heap[1]=heap[size];
        size=size-1;
        MinHeapify(heap,1);
        return min;
    }
    
    void decreaseKey(int i,int key){
        if(key<heap[i]){
            return;
        }
        heap[i]=key;
        while(i>1 && heap[i/2]>heap[i]){
            swap(i,i/2);
            i=i/2;
        }
    }
    
    void increaseKey(int i,int key){
        if(key<heap[i]){
            return;
        }
        heap[i]=key;
        while(i>1 && heap[i/2]>heap[i]){
            swap(i,i/2);
            i=i/2;
        }
    }
    
    void heapSort(){
        buildHeap();
        int length=size;
        for(int i=size;i>=2;i--){
            swap(1,i);
            size--;
            MinHeapify(heap,1);
        }
        size=length;
    }
}
