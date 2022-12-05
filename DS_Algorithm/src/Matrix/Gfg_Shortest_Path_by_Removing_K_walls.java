package Matrix;
import java.util.*;
public class Gfg_Shortest_Path_by_Removing_K_walls {
	static int shotestPath(int[][] mat, int n, int m, int k) {
        // code here
        int[][] dirs={{1,0},{0,1},{0,-1},{-1,0}}; 
        Queue<int[]> queue=new LinkedList<>();
        queue.add(new int[]{0,0,k});
        boolean[][][] visit=new boolean[n][m][k+1];
        visit[0][0][k]=true;
        int dis=0;
        while(!queue.isEmpty()){
            int len=queue.size();
            while(len-->0){
                int []curr=queue.remove();
                if(curr[0]==n-1 && curr[1]==m-1){
                    return dis;
                }
                for(int []dir:dirs){
                    int i=curr[0]+dir[0];
                    int j=curr[1]+dir[1];
                    int obs=curr[2];
                    if(i<n && j<m && i>=0 && j>=0){
                        if(mat[i][j]==0 && !visit[i][j][obs]){
                            queue.add(new int[]{i,j,obs});
                            visit[i][j][obs]=true;
                        }else if(mat[i][j]==1 && obs>0 && !visit[i][j][obs-1]){
                            queue.add(new int[]{i,j,obs-1});
                            visit[i][j][obs-1]=true;
                        }
                    }
                }
            }
            dis++;
        }
        return -1;
    }
}
