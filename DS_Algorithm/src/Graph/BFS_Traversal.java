package Graph;

import java.util.LinkedList;
import java.util.Queue;
public class BFS_Traversal {
	 private LinkedList<Integer>[] adj;
     private int V;
     private int E;
     
     public BFS_Traversal(int nodes){
    	 this.V=nodes;
    	 this.E=0;
    	 this.adj=new LinkedList[nodes];
    	 for(int v=0;v<V;v++){
    		 adj[v]=new LinkedList<>();
    	 }
     }
     public void addEdge(int u,int v){
    	 adj[u].add(v);
    	 adj[v].add(u);
    	 E++;
     }
     
     public String toString(){
 		StringBuilder sb=new StringBuilder();
 		sb.append(V+" Vertices, "+E+" Edges "+"\n");
 		for(int v=0;v<V;v++){
 			sb.append(v+": ");
 			for(int w:adj[v]){
 				sb.append(w+" ");
 			}
 			sb.append("\n");
 		}	
 		return sb.toString();
 	}
     
     public void bfs(int s){
    	 boolean[] visited=new boolean[V];
    	 Queue<Integer> q=new LinkedList<>();
    	 visited[s]=true;
    	 q.offer(s);
    	 
    	 while(!q.isEmpty()){
    		 int u=q.poll();
    		 System.out.print(u+" ");
    		 
    		 for(int v: adj[u]){
    			 if(!visited[v]){
    				 visited[v]=true;
    				 q.offer(v);
    			 }
    		 }
    	 }
     }
     
     public static void main(String []args){
    	 BFS_Traversal gll=new BFS_Traversal(5);
    	 gll.addEdge(0,1);
    	 gll.addEdge(1,2);
    	 gll.addEdge(2,3);
    	 gll.addEdge(3,0);
    	 gll.addEdge(2,4);
    	 gll.bfs(0);
     }
}
