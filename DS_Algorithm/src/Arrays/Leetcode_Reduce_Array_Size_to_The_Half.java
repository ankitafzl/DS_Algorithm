package Arrays;
import java.util.*;
public class Leetcode_Reduce_Array_Size_to_The_Half {
	public int minSetSize(int[] arr) {
        int n=arr.length;
        Map<Integer,Integer> map=new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        int[] temp = new int[n + 1];
        for (int i : map.values()){
            ++temp[i];
        } 
        
        int ans = 0;
        int removed = 0;
        int half = n / 2;
        int freq = n;
        
        while (removed < half) {
            ans += 1;
            while (temp[freq] == 0) {
                --freq;
            }
            removed += freq;
            --temp[freq];
        }
        return ans;
    }
}
