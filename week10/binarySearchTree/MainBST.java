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
public class MainBST {
    public static void main(String args[]){
        BSToperations tree=new BSToperations();
        tree.add(50);
        tree.add(25);
        tree.add(15);
        tree.add(75);
        tree.add(30);
        tree.add(70);
        tree.add(85);
        tree.add(10);
        tree.add(23);
        tree.add(46);
        tree.add(84);
        tree.add(90);
        
        tree.inorderTraversal(tree.root);
        //tree.preorderTraversal(tree.root);
        System.out.println();
        System.out.println("Minimum node is: "+tree.minNode(tree.root));
        System.out.println("Maximum node is: "+tree.maxNode(tree.root));
        tree.search(75);
        tree.delete(25);
        tree.inorderTraversal(tree.root);
        //tree.preorderTraversal(tree.root);
    }
}
