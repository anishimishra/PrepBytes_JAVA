//https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/10/trees/codingAssignment/LVLOD

/* Complete the function levelOrderTraversal given below.
For your reference
class Node
{
    long value;
    Node left, right;
    public Node(long item)
    {
        value = item;
        left = right = null;
    }
}
*/

void levelOrderTraversal(Node key) {

    //write your code here
  if(key==null)
    return;
  queue queue=new queue(20);
  queue.enqueue(key);
  while(!queue.isEmpty()){
    Node node=queue.dequeue();
    System.out.print(node.value+" ");
    if(node.left!=null){
      queue.enqueue(node.left);
    }
    if(node.right!=null){
      queue.enqueue(node.right);
    }
  }
}

public class queue {
    private Node[] arr; 
    private int front; 
    private int rear; 
    private int capacity; 
    private int count; 
    
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

