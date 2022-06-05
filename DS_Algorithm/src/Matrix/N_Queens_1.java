package Matrix;

import java.util.ArrayList;
import java.util.List;

public class N_Queens_1 {
  // using dfs and BackTracking
	List<List<String>> ans;
    public List<List<String>> solveNQueens(int n) {
        ans=new ArrayList<>();
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        List<int[]> queens=new ArrayList<>();
        dfs(board,0,queens);
        return ans;   
    }
    
    private void dfs(char board[][],int x,List<int[]> queens){
        if(board.length==queens.size()){
            List<String> rows=new ArrayList<>();
            for(char []r:board){
                rows.add(new String(r));
            }
            ans.add(rows);
        }
        
        for(int c=0;c<board.length;c++){
            if(can_Add_Queen(x,c,queens)){
                board[x][c]='Q';
                queens.add(new int[]{x,c});
                dfs(board,x+1,queens);
                queens.remove(queens.size()-1);
            }
        }
    }
    private boolean can_Add_Queen(int x,int c,List<int[]> queens){
        for(int[] q:queens){
            int dx=Math.abs(x-q[0]);
            int dy=Math.abs(c-q[1]);
            if(dx==0 || dy==0 || dx==dy){
                return false;
            }
        }
        return true;
    }
}
