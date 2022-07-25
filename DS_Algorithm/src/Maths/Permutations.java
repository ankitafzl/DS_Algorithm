package Maths;
import java.util.*;
public class Permutations {
	public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        solve(ans ,nums, new ArrayList<>(),visited);
        return ans;
    }
    
    void solve(List<List<Integer>> ans ,int[] nums,List<Integer> curr,boolean []visited){
        if(curr.size()==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(visited[i]==true){
                continue;
            }
            curr.add(nums[i]);
            visited[i]=true;
            solve(ans ,nums, curr,visited);
            curr.remove(curr.size()-1);
            visited[i]=false;
        }
    }
}
