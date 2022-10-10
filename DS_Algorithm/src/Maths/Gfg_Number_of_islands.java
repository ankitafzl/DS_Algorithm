package Maths;
import java.util.*;
public class Gfg_Number_of_islands {
	public List<Integer> numOfIslands(int rows, int cols, int[][] operators) {
        //Your code here
        int mat[][]=new int[rows][cols];
        List<Integer> ans=new ArrayList<>();
        UnionFind u=new UnionFind(rows,cols);
        int dx[]=new int[]{1,0,-1,0};
        int dy[]=new int[]{0,1,0,-1};
        
        for(int []operator:operators){
            int x=operator[0];
            int y=operator[1];
            mat[x][y]=1;
            for(int i=0;i<4;i++){
                int nx=x+dx[i];
                int ny=y+dy[i];
                
                if(nx>=0 && ny>=0 && nx<rows && ny<cols && mat[nx][ny]==1){
                    u.union(x*cols+y,nx*cols+ny);
                }
            }
            ans.add(u.solve(mat));
        }
        return ans;
    }
}

class UnionFind{
    int parent[];
    int len;
    UnionFind(int row,int col){
        len=row*col;
        parent=new int[len];
        for(int i=0;i<len;i++){
            parent[i]=i;
        }
    }
    
    void union(int x,int y){
        int px=findParent(x);
        int py=findParent(y);
        parent[py]=px;
    }
    
    int findParent(int x){
        if(parent[x]==x){
            return x;
        }
        return parent[x]=findParent(parent[x]);
    }
    
    int solve(int[][] mat){
        int m=mat.length;
        int n=mat[0].length;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    if(parent[i*n+j]==i*n+j){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
