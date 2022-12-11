package hashing;

public class Gfg_Array_Pair_Sum_Divisibility_Problem {
	public boolean canPair(int[] nums, int k) {
        // Code here
        if(nums.length % 2 != 0){
            return false;
        }
        int[] freq=new int[k];

        for(int i:nums){
            int x=i%k;
            if(freq[(k-x)%k]!=0){
                freq[(k-x)%k]--;
            }else{
                freq[x]++;
            }
        }
        for(int i:freq){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
