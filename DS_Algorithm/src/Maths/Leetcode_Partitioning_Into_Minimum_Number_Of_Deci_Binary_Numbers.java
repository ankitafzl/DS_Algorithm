package Maths;

public class Leetcode_Partitioning_Into_Minimum_Number_Of_Deci_Binary_Numbers {

	public int minPartitions(String n) {
        int ans=0;
        for(char ch:n.toCharArray()){
            ans=Math.max(ans,ch-'0');
        }
        return ans;
    }
}
