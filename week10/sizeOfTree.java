https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/10/trees/codingAssignment/SIZET

/*
Complete the function calculateSize given below.
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

int calculateSize(Node node) {
    //write your code here
  if(node==null)
    return 0;
  else {
    int leftNumber=calculateSize(node.left);
    int rightNumber=calculateSize(node.right);
    return leftNumber+rightNumber+1;
    //return (calculateSize(node.left)+calculateSize(node.right)+1);
  }
}
