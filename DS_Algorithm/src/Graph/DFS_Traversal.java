package Graph;
import java.util.LinkedList;
import java.util.Stack;

//iterative approach
public class DFS_Traversal {
	private LinkedList<Integer>[] adj;
	private int V;   //number of vertices
	private int E;   //number of edge
	
	public DFS_Traversal(int nodes){
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
		sb.append(V+" Vertives, "+E+" Edges \n");
		for(int v=0;v<V;v++){
			sb.append(v+": ");
			for(int w:adj[v]){
				sb.append(w+" ");
			}
			sb.append("\n");
		}
		return toString();
	}
	
	public void dfs(int s){
		boolean[] visited=new boolean[V];
		Stack<Integer> stack=new Stack<>();
		stack.push(s);
		
		while(!stack.isEmpty()){
			int u=stack.pop();
			if(!visited[u]){
				visited[u]=true;
				System.out.print(u+" ");
				
				for(int v:adj[u]){
					if(!visited[v])
						stack.push(v);
				}
			}
		}
	}
	
	public static void main(String []args){
		DFS_Traversal d=new DFS_Traversal(5);
   	 d.addEdge(0,1);
   	 d.addEdge(1,2);
   	 d.addEdge(2,3);
   	 d.addEdge(3,0);
   	 d.addEdge(2,4);
   	 d.dfs(0);;
	} 

}
