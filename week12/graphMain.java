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
public class graphMain {
    public static void main(String args[]){
        graph g=new graph(8);
        g.addNode(50);
        g.addNode(10);
        g.addNode(200);
        g.addNode(20);
        g.addNode(15);
        g.addNode(30);
        g.addNode(5);
        g.addNode(300);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        //g.addEdge(1, 4);
        //g.addEdge(1, 5);
        g.addEdge(2, 3);
        g.addEdge(4, 5);
        g.addEdge(4, 6);
        g.addEdge(5, 7);
        /*System.out.println("Breadth First Search\nVisited nodes are: ");
        g.bfs();*/
        /*System.out.println("\nDepth First Search\nVisited nodes are: ");
        g.dfs(0);*/ //pass the index you want to start from
        System.out.println("\nDepth First Traversal\nVisited nodes are: ");
        g.dft();
        //System.out.println("\nBreadth First Traversal\nVisited nodes are: ");
        //g.bft();
    }
}
