package Matrix;
import java.util.*;
public class Gfg_Print_Diagonally_Matrix {
	static ArrayList<Integer> downwardDigonal(int N, int A[][])
    {
        // code here 
        ArrayList<Integer> list=new ArrayList<>();
        int row=0;
        int col=0;
        while(col<N){
            int i=row;
            int j=col;
            while(i<N && j>=0){
                list.add(A[i][j]);
                i++;
                j--;
            }
            col++;
        }
        col=N-1;
        row=1;
        while(row<N){
            int i=row;
            int j=col;
            while(i<N && j>=0){
                list.add(A[i][j]);
                i++;
                j--;
            }
            row++;
        }
        return list;
    }
}
