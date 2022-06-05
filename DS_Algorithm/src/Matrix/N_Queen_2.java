package Matrix;

public class N_Queen_2 {

	 public int totalNQueens(int n) {
	        return solve(new boolean[n][n],0);
	    }
	    public int solve(boolean board[][],int r){
	        if(r==board.length){
	            return 1;
	        }
	        int count=0;
	        for(int c=0;c<board.length;c++){
	            if(!board[r][c] && is_safe_queen(board,r,c)){
	                board[r][c]=true;
	                count+=solve(board,r+1);
	                board[r][c]=false;
	            }
	        }
	        return count;
	    }
	    
	    public boolean is_safe_queen(boolean board[][], int r,int c){
	        for(int i=0;i<board.length;i++){
	            if(board[r][i] || board[i][c]){
	                return false;
	            }
	        }
	        int x=r-1;
	        int y=c-1;
	        
	        while(x>=0 && y>=0){
	            if(board[x][y]){
	                return false;
	            }
	            x--;
	            y--;
	        }
	        x=r-1;
	        y=c+1;
	        
	        while(x>=0 && y<board.length){
	            if(board[x][y]){
	                return false;
	            }
	            x--;
	            y++;
	        }
	         return true;
	    }
}
