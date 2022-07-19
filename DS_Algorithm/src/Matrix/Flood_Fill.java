package Matrix;

public class Flood_Fill {
	public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int new_color = image[sr][sc];
        if (new_color != color) {
            dfs(image, sr, sc, new_color, color);
        }
        return image;
    }
    
    public void dfs(int [][]image, int r,int c,int new_color,int color){
        if(r<0 || c<0 || r>=image.length || c>=image[0].length || image[r][c]!=new_color){
            return;
        }
        image[r][c] = color;
        dfs(image, r-1, c, new_color ,color);
        dfs(image, r, c-1, new_color, color);
        dfs(image, r+1, c, new_color , color);
        dfs(image, r, c+1, new_color, color);
    }
}
