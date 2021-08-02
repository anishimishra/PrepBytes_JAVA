//https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/10/trees/codingAssignment/PSTDT

/*
Complete the function postOrderTraversal given below.
For your reference:

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

void postOrderTraversal(Node node) {
  //write your code here
  if(node==null){
    return;
  }
  postOrderTraversal(node.left);
  postOrderTraversal(node.right);
  System.out.print(node.value+" ");
}
