//https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/10/trees/codingAssignment/PREDT

/* Complete the function preOrderTraversal given below
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

void preOrderTraversal(Node node) {
    
  //write your code here
  if(node==null){
    return;
  }
  System.out.print(node.value+" ");
  preOrderTraversal(node.left);
  preOrderTraversal(node.right);
}
