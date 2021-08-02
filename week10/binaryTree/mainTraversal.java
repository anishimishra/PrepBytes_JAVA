//https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/10/trees/video/b9389967fee7451ca40f994aa93e184a

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
public class treeTraversal {
    Node root;
    treeTraversal(){
        root=null;
    }
    void preorderTraversal(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data+" ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }
    void inorderTraversal(Node node){
        if(node==null){
            return ;
        }
        inorderTraversal(node.left);
        System.out.print(node.data+" ");
        inorderTraversal(node.right);
    }
    void postorderTraversal(Node node){
        if(node==null){
            return;
        }
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.data+" ");
    }
    int heightTree(Node node){
        if(node==null)
            return -1;
        else {
            int leftHeight=heightTree(node.left);
            int rightHeight=heightTree(node.right);
            if(leftHeight>rightHeight)
                return leftHeight+1;
            else
                return rightHeight+1;
        }
    }
    int sizeTree(Node node){
        int count;
        if(node==null)
            return 0;
        else {
            int leftNumber=sizeTree(node.left);
            int rightNumber=sizeTree(node.right);
            return leftNumber+rightNumber+1;
            //return (sizeTree(node.left)+sizeTree(node.right)+1);
        }
    }
    public void levelorderTraversal(Node key){
        if(key==null)
            return;
        queue queue=new queue(sizeTree(root));
        queue.enqueue(key);
        while(!queue.isEmpty()){
            Node node=queue.dequeue();
            System.out.print(node.data+" ");
            if(node.left!=null){
                queue.enqueue(node.left);
            }
            if(node.right!=null){
                queue.enqueue(node.right);
            }
        }
    }
}
