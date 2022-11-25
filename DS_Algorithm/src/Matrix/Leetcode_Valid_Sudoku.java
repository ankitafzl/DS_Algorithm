package Matrix;
import java.util.*;
public class Leetcode_Valid_Sudoku {
	 public boolean isValidSudoku(char[][] board) {
	        for(int i = 0; i < 9; i++){
	            Set<Character> rows = new HashSet<Character>();
	            Set<Character> cols = new HashSet<Character>();
	            Set<Character> cube = new HashSet<Character>();
	            for(int j = 0; j < 9; j++){
	                // Check row
	                if(board[i][j] != '.' && !rows.add(board[i][j])){
	                    return false;
	                }
	                
	                // Check column
	                if(board[j][i] != '.' && !cols.add(board[j][i])){
	                    return false;
	                }
	                
	                // Check cube
	                int row_index = 3 * (i / 3);     // row index of current cube
	                int col_index = 3 * (i % 3);     // col index of current cube
	                if(board[row_index + j / 3][col_index + j % 3] != '.' &&
	                   !cube.add(board[row_index + j / 3][col_index + j % 3])){
	                       return false;
	                }
	            }
	        }
	        return true;
	    }
}
