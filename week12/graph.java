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
public class graph {
    private graphNode[] nodeList;
    private int[][] adjMatrix;
    private int numberNode;
    private Queue queue;
    
    graph(int size){
        int maxNodes=size;
        nodeList=new graphNode[maxNodes];
        adjMatrix=new int[maxNodes][maxNodes];
        numberNode=0;
        queue=new Queue(maxNodes);
    }
    
    void addNode(int element){
        nodeList[numberNode++]=new graphNode(element);
    }
    
    void addEdge(int start, int end){
        adjMatrix[start][end]=1;
        adjMatrix[end][start]=1;
    }
    
    private void printNode(int index){
        System.out.print(nodeList[index].data+" ");
    }
    
    private int getAdjUnvisitedNode(int node){
        for(int j=0;j<numberNode;j++){
            if(adjMatrix[node][j]==1 && nodeList[j].visited==false){
                return j;
            }
        }
        return -1;
    }
    
    void bfs(){
        nodeList[0].visited=true;
        printNode(0);
        queue.enqueue(0);
        int node1;
        while(!queue.isEmpty()){
            int node2=queue.dequeue();
            while((node1=getAdjUnvisitedNode(node2))!=-1){
                nodeList[node1].visited=true;
                printNode(node1);
                queue.enqueue(node1);
            }
        }
    }
    
    void dfs(int n){
        nodeList[n].visited=true;
        printNode(n);
        int node1;
        while((node1=getAdjUnvisitedNode(n))!=-1){
            dfs(node1);
        }
    }
    
    /*
    depth first traversal if graphs are disconnected;
    call dfs on every unvisited node
    */
    void dft(){
        for(int i=0;i<numberNode;i++){
            if(nodeList[i].visited==false){
                dfs(i);
            }
        }
    }
    
    /*
    breadth first traversal if graphs are disconnected;
    call bfs on every unvisited node
    */
    
    void bft(){
        
    }
}
