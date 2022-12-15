package Matrix;
import java.util.*;
public class Leetcode_Minimum_Falling_Path_Sum {
	public int minFallingPathSum(int[][] matrix) {
        //int m=matrix.length;
        int n=matrix[0].length;
        int ans=Integer.MAX_VALUE;
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            ans=Math.min(ans,solve(0,i,matrix,map));
        }
        return ans;
    }

    private int solve(int i,int j ,int [][]matrix,HashMap<String,Integer> map){
        int m=matrix.length;
       // int n=matrix[0].length;
        if(i==m){
            return 0;
        }
        if(j<0 || j>=m){
            return Integer.MAX_VALUE;
        }
        String key=i+"CodeBix"+j;
        if(map.containsKey(key)){
            return map.get(key);
        }
        int x=solve(i+1,j-1,matrix,map);
        int y=solve(i+1,j,matrix,map);
        int z=solve(i+1,j+1,matrix,map);

        int min=Math.min(x,Math.min(y,z));
        map.put(key,matrix[i][j]+min);
        return matrix[i][j]+min;
    }
}
