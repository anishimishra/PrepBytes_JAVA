/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

/**
 *
 * @author anishi
 */
public class graphNode {
    int data;
    boolean visited;
    graphNode(int data){
        this.data=data;
        visited=false; //default value is false
    }
}
