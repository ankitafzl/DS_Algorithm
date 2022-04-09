package Graph;
import java.util.LinkedList;
public class GraphUsingLinkedList {
     private LinkedList<Integer>[] adj;
     private int V;
     private int E;
     
     public GraphUsingLinkedList(int nodes){
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
     
     public static void main(String []args){
    	 GraphUsingLinkedList gll=new GraphUsingLinkedList(4);
    	 gll.addEdge(0,1);
    	 gll.addEdge(1,2);
    	 gll.addEdge(2,3);
    	 gll.addEdge(3,0);
    	 System.out.print(gll);
     }
}
