package Arrays;

public class Leetcode_Matchsticks_to_Square {
	public boolean makesquare(int[] matchsticks) {
        int sum=0;
        int max=0;
        for(int i=0;i<matchsticks.length;i++){
            max=Math.max(max,matchsticks[i]);
            sum+=matchsticks[i];
        }
        if(sum<4 || sum%4 !=0 || max> sum/4) {
            return false;
        }
        if(matchsticks.length==4) {
            return true;
        }
        
        return solve(matchsticks, sum/4, 0, 0, 0);
    }
    
     public boolean solve(int[] matchsticks, int target, int count, int st, int temp_sum){
        if(count==matchsticks.length) {
            return true;
        }
        for(int i=st; i<matchsticks.length; i++){
            if(matchsticks[i]==-1 || temp_sum+matchsticks[i]>target){
                continue;
            } 
            int temp = matchsticks[i];
            matchsticks[i]=-1;
            if(temp_sum+temp==target){
                if(solve(matchsticks, target, count+1, 0, 0)) {
                    return true;
                }
            }else{
                if(solve(matchsticks, target, count+1, i+1, temp_sum+temp)) {
                    return true;
                }
            }
            matchsticks[i]=temp;
        }
        return false;
    }
}
