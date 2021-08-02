//https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/10/trees/codingAssignment/HGHTREE

/* Complete the function calculateHeight given below
For your reference:
*/
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

  int calculateHeight(Node node) {
    //write your code here
    if(node==null)
      return 0;
    else {
      int leftHeight=calculateHeight(node.left);
      int rightHeight=calculateHeight(node.right);
      if(leftHeight>rightHeight)
        return leftHeight+1;
      else
        return rightHeight+1;
    }
  }
