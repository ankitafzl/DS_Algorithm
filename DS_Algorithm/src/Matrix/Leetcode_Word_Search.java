package Matrix;

public class Leetcode_Word_Search {
	 public boolean exist(char[][] board, String word) {
	        char[] chars = word.toCharArray();
	        for(int i = 0; i < board.length; i++){
	        	for(int j = 0; j < board[0].length; j++){
	        		if(solve(board, i, j, chars, 0)){
	        			return true;
	        		}
	        	}
	        }
	        return false;
	    }

	    private boolean solve(char[][] board, int i, int j, char[] chars, int len){

	    	if(i < 0 || i == board.length || j < 0 || j == board[0].length) {
	            return false;
	        }
	    	if(board[i][j] != chars[len]) {
	            return false;
	        }
	    	if(len == chars.length - 1) {
	            return true;
	        }
	    	char temp = board[i][j];
	    	board[i][j] = '#';
	    	boolean exist = solve(board, i, j + 1, chars, len + 1) || 
	    					solve(board, i, j - 1, chars, len + 1) ||
	    					solve(board, i + 1, j, chars, len + 1) ||
	    					solve(board, i - 1, j, chars, len + 1);
	    	board[i][j] = temp;
	    	return exist;
	    }
}
