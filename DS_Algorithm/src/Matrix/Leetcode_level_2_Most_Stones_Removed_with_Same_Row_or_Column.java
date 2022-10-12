package Matrix;
import java.util.*;
public class Leetcode_level_2_Most_Stones_Removed_with_Same_Row_or_Column {

	
	public int removeStones(int[][] stones) {
        Solution1 s = new Solution1(20000);
        for(int[] stone: stones){
            s.union(stone[0], stone[1]+10000);
        }
 
        HashSet<Integer> set = new HashSet<>();
        for(int[] stone: stones){
            set.add(s.unioFind(stone[0]));
        }
 
        return stones.length - set.size();
    }
}
class Solution1{
    int[] parent;
    public Solution1(int size){
        parent = new int[size];
        for(int i=0; i<size; i++){
            parent[i] = i;
        }
    }
 
    public void union(int i, int j){
        parent[unioFind(i)] = unioFind(j);
    }
 
    public int unioFind(int i){
        while(parent[i] != i){
            i = parent[i];
        }
 
        return i;
    }
}
