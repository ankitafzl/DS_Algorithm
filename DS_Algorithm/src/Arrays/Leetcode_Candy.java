package Arrays;
import java.util.*;
public class Leetcode_Candy {
	 public int candy(int[] ratings) {
	        int total_candies=0;
	        int n=ratings.length;
	        int dis[]=new int[n];
	        Arrays.fill(dis,1);
	        for(int i=0;i<n-1;i++){
	            if(ratings[i+1]>ratings[i]){
	                dis[i+1]=dis[i]+1;
	            }
	        }
	        for(int i=n-1;i>0;i--){
	            if(ratings[i-1]>ratings[i]){
	                if(dis[i-1]<=dis[i]){
	                    dis[i-1]=dis[i]+1;
	                }
	            }
	        }
	        for(int i=0;i<n;i++){
	            total_candies+=dis[i];
	        }
	        return total_candies;
	    }
}
