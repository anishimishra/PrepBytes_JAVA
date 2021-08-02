//https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/10/trees/codingAssignment/SRCHBST

/* Complete the function searchInBST given below
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

Node searchInBST(Node node, int key) {
    //write your code here
  if(node==null || node.value==key)
    return node;
  if(key<node.value)
    return (searchInBST(node.left, key));
  else
    return (searchInBST(node.right, key));
}
