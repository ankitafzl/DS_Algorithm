package Matrix;

public class Matrix_01 {

	public int[][] updateMatrix(int[][] mat) {
        if(mat.length == 0) {
            return mat;
        }
        
        // Assigned a large value to all the positions with value 1 and don't have 0 neighbors
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] == 1 && !hasAdjacentZero(mat, i, j)) {
                    mat[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        
        // Start dfs search from positions whose value is 1
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] == 1) {
                    DFS(mat, i, j, -1);// -1 means not to modify the current square
                }
            }
        }
        return mat;
    }
    
    // val means the depth of current path
    private void DFS(int[][] matrix, int r, int c, int val) {
        if(r < 0 || c < 0 || r >= matrix.length || c >= matrix[0].length || matrix[r][c] <= val) {
            return;
        }
        
        if(val >= 0) {
            matrix[r][c] = val;
        }
        DFS(matrix, r - 1, c, matrix[r][c] + 1);
        DFS(matrix, r, c - 1, matrix[r][c] + 1);
        DFS(matrix, r + 1, c, matrix[r][c] + 1);
        DFS(matrix, r, c + 1, matrix[r][c] + 1);
    }
    
    private boolean hasAdjacentZero(int[][] matrix, int r, int c) {
        if(r > 0 && matrix[r - 1][c] == 0){
            return true;
        }
        if(c > 0 && matrix[r][c - 1] == 0) {
            return true;
        }
        if(r < matrix.length - 1 && matrix[r + 1][c] == 0) {
            return true;
        }
        if(c < matrix[0].length - 1 && matrix[r][c + 1] == 0) {
            return true;
        }
        return false;
    }
}
