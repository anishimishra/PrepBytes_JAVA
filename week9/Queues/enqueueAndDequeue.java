//https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/9/queues/codingAssignment/ENDEQ

import java.util.*;
  import java.io.*;
  
  class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
      next=null;
    }
  }
  
  class LinkedList{
    public Node front=null, rear=null;
    void enqueue(int data){
      Node newNode = new Node(data);
      if(rear==null){
        front=rear=newNode;
        //System.out.print(front.data+" ");
        return;
      }
      rear.next=newNode;
      rear=rear.next;
      //System.out.print(rear.data+" ");
    }
    void dequeue(){
      if(front==null){
        return;
      }
      front=front.next;
      if(front==null){
        rear=null;
      }
    }
    void display(){
      Node traverse= front;
      while(traverse!=null){
        System.out.print(traverse.data+" ");
        traverse=traverse.next;
      }
      System.out.println();
    }
  }

  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int n=Integer.parseInt(br.readLine());
      String st[]=br.readLine().trim().split(" ");
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=Integer.parseInt(st[i]);
      }
      /*for(int i=0;i<n;i++){
        System.out.println(arr[i]);
      }*/
      LinkedList queue=new LinkedList();
      int i;
      for(i=0;i<n;i++){
        //System.out.print(i+" ");
        queue.enqueue(arr[i]);
        queue.display();
      }
      for(i=0;i<n;i++){
        queue.dequeue();
        queue.display();
      }
    }
  }
