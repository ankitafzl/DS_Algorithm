package Arrays;
import java.util.*;
public class Combination_Sum_II {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        if (solve(candidates, target)) {
            return ans;
        }

        Arrays.sort(candidates); // critical to skip duplicates
        dfs(ans, new ArrayList<>(), candidates, 0, target);
        return ans;
    }

    private void dfs(List<List<Integer>> ans, List<Integer> list, int[] candidates, int index, int target) {
        // for loop, where dfs is performed
        for (int i = index; i < candidates.length; i++) {
            // ensures at same for loop round, the same item (sorted && neighbor) won't be picked 2 times
            if (i > index && candidates[i] == candidates[i - 1]){
                continue;
            } 
            int value = candidates[i];
            list.add(value);
            if (target == value) {
                ans.add(new ArrayList<>(list));
            }
            else if (target - value > 0) {
                dfs(ans, list, candidates, i + 1, target - value);
            }
            list.remove(list.size() - 1); // backtrack
        }
    }

    private boolean solve(int[] candidates, int target) {
        return candidates == null || candidates.length == 0 || target <= 0;
    }
}
