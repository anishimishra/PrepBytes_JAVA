/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarySearchTree;

/**
 *
 * @author anishi
 */
public class BSToperations {
    Node root;
    BSToperations(){
        root=null;
    }
    void add(int key){
        root=addNodeRec(root,key);
    }
    Node addNodeRec(Node node, int key){
        if(node==null){
            node=new Node(key);
            return node;
        }
        if(key<node.data){
            node.left=addNodeRec(node.left, key);
        } else if (key>node.data){
            node.right=addNodeRec(node.right, key);
        }
        return node;
    }
    int minNode(Node node){
        if(node.left==null){
            return node.data;
        } else {
            return minNode(node.left);
        }
    }
    int maxNode(Node node){
        if(node.right==null){
            return node.data;
        } else {
            return maxNode(node.right);
        }
    }
    void search(int key){
        Node node=searchKeyRec(root, key);
        if(node!=null){
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }
    Node searchKeyRec(Node node, int key){
        if(node==null || node.data==key)
            return node;
        if(key<node.data)
            return (searchKeyRec(node.left, key));
        else
            return (searchKeyRec(node.right, key));
    }
    void delete(int key){
        root =deleteNodeRec(root, key);
    }
    Node deleteNodeRec(Node node, int key){
        if(node==null){
            return node;
        }
        if(key<node.data){
            node.left=deleteNodeRec(node.left, key);
        } else if(key>node.data){
            node.right=deleteNodeRec(node.right, key);
        } else {
            if(node.left == null)
                return node.right;
            else if(node.right == null)
                return node.left;
            node.data=minimumVal(node.right);
            node.right=deleteNodeRec(node.right, node.data);
        }
        return node;
    }
    int minimumVal(Node node){
        int minValue=node.data;
        while(node.left!=null){
            minValue=node.left.data;
            node=node.left;
        }
        return minValue;
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
}