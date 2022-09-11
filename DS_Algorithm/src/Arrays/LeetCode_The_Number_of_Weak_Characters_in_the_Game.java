package Arrays;
import java.util.*;
public class LeetCode_The_Number_of_Weak_Characters_in_the_Game {
	public int numberOfWeakCharacters(int[][] properties) {
        int ans=0;
        Arrays.sort(properties,(a,b)-> a[0]==b[0] ? b[1] - a[1] : a[0]-b[0]);
        int min=Integer.MIN_VALUE;
        int n=properties.length;
        for(int i=n-1;i>=0;i--){
            int[] temp=properties[i];
            //int attack=temp[0];
            int defence=temp[1];
            
            if(defence<min){
                ans++;
            }
            min=Math.max(min,defence);
        }
        return ans;
    }
}
