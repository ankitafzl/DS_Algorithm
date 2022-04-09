package Graph;

public class AdjacencyMatrix {
	private int V;  //number of vertices in graph
	private int E;  //number of Edge in graph
	private int[][] adjMatrix;
	
	public AdjacencyMatrix(int nodes){
		this.V=nodes;
		this.E=0;
		this.adjMatrix=new int[nodes][nodes];
	}
	
	public void addEdge(int u,int v){
		adjMatrix[u][v]=1;
		adjMatrix[v][u]=1;
		E++;
	}
	
	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb.append(V+" Vertices \n"+E+" Edges "+"\n");
		for(int v=0;v<V;v++){
			sb.append(v+": ");
			for(int w:adjMatrix[v]){
				sb.append(w+" ");
			}
			sb.append("\n");
		}	
		return sb.toString();
	}
	
     public static void main(String []args){
    	 AdjacencyMatrix am=new AdjacencyMatrix(4);
    	 am.addEdge(0,1);
    	 am.addEdge(1,2);
    	 am.addEdge(2,3);
    	 am.addEdge(3,0);
    	System.out.print(am);
     }
}
