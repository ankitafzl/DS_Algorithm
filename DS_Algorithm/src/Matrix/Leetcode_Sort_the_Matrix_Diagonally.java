package Matrix;
import java.util.*;
public class Leetcode_Sort_the_Matrix_Diagonally {
	public int[][] diagonalSort(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        
        // row=0
        for(int c=0;c<n;c++){
            sort(mat,0,c,m,n);
        }
        
        //col=0;
        for(int r=0;r<m;r++){
            sort(mat,r,0,m,n);
        }
        
        return mat;
    }
    
    void sort(int [][]mat,int r,int c,int m,int n){
        List<Integer> list=new ArrayList<>();
        int i=r;
        int j=c;
        while(i<m && j<n){
            list.add(mat[i][j]);
            i++;
            j++;
        }
        Collections.sort(list);
        i=r;
        j=c;
        int ind=0;
        while(i<m && j<n){
            mat[i][j]=list.get(ind++);
            i++;
            j++;
        }
    }
}
