//https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/10/trees/video/8ee43a5e3836438b9772a13edeb879e6

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaryTree;

/**
 *
 * @author anishi
 */
public class queue {
    private Node[] arr; //array to store queue elements
    private int front; //front points to front element in the queue
    private int rear; //rear points to last element in the queue
    private int capacity; //maximum capacity of the queue
    private int count; //current size of the queue
    
    queue(int size){
        arr=new Node[size];
        capacity=size;
        front=0;
        rear=-1;
        count=0;
    }
    
    public Node dequeue(){
        if(isEmpty()){
            System.exit(1);
        }
        Node node=arr[front];
        front=(front+1)%capacity;
        count --;
        return node;
    }
    
    public void enqueue(Node item){
        if(isFull()){
            System.exit(1);
        }
        rear=(rear+1)%capacity;
        arr[rear]=item;
        count++;
    }
    
    public Node peek(){
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
