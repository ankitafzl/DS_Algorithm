package Matrix;
import java.util.*;
public class Leetcode_Max_Sum_of_Rectangle_No_Larger_Than_K {
	 public int maxSumSubmatrix(int[][] matrix, int k) {
         int m = matrix.length;
         int n = matrix[0].length;
         int ans = Integer.MIN_VALUE;
         for (int i = 0;  i < m; i++) {
            int[] temp = new int[n];
            for (int j = i; j < m; j++) {
                TreeSet<Integer> set = new TreeSet<Integer>();
                set.add(0);
                int val = 0;
                for (int c = 0; c < n; c++) {
                    temp[c] += matrix[j][c];
                    val += temp[c];
                    Integer prev = set.ceiling(val - k);
                    if (prev != null) {
                        ans = Math.max(ans, val - prev);
                    }
                    set.add(val);
                }
            }
        }
        return ans;
    }
}
