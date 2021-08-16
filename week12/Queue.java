/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

/**
 *
 * @author anishi
 */
public class Queue {
    private int[] arr; //array to store queue elements
    private int front; //front points to front element in the queue
    private int rear; //rear points to last element in the queue
    private int capacity; //maximum capacity of the queue
    private int count; //current size of the queue
    
    public Queue(int size){
        arr=new int[size];
        capacity=size;
        front=0;
        rear=-1;
        count=0;
    }
    
    public int dequeue(){
        if(isEmpty()){
            System.exit(1);
        }
        int value=arr[front];
        front=(front+1)%capacity;
        count --;
        return value;
    }
    
    public void enqueue(int item){
        if(isFull()){
            System.exit(1);
        }
        rear=(rear+1)%capacity;
        arr[rear]=item;
        count++;
    }
    
    public int peek(){
        if(isEmpty()){
            System.out.println("Underflow\nProgram Terminated");
            System.exit(1);
        }
        return arr[front];
    }
    
    public int size(){
        return count;
    }
    
    public boolean isEmpty(){
        return (size()==0);
    }
    
    public boolean isFull(){
        return (size()==capacity);
    }
}
