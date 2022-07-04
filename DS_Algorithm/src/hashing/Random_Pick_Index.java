package hashing;
import java.util.*;
public class Random_Pick_Index {//time limit exceeded.
	private Random random;
    private int[] nums;
    
    public Random_Pick_Index(int[] nums) {
        this.nums=nums;
        this.random=new Random();
    }
    
    public int pick(int target) {
        int count=1;
        int ans=-1;
        
        for(int i=0;i<nums.length;++i){
            if(target!=nums[i]){
                continue;
            }
            int randomNum=random.nextInt(count);
            if(randomNum==0){
                    ans=i;
            }
            ++count;
        }
        return ans;
    }
    
    //using hashMap.
    
//    private int[] nums;
    HashMap<Integer, Integer> map = new HashMap<>();
//    public Solution(int[] nums) {
//        this.nums=nums;
//       
//    }
    
    public int pick1(int target) {
        int st_index = map.getOrDefault(target, 0);
        int find_index = -1;
        for (int i = st_index + 1; i < nums.length; i++) {
            if (nums[i] == target) {
                find_index = i;
                break;
            }
        }
        if (find_index < 0) {
            for (int i = 0; i <= st_index; i++) {
                if (nums[i] == target) {
                    find_index = i;
                    break;
                }
            }
        }
        map.put(target,find_index);
        return find_index;
    }
}
