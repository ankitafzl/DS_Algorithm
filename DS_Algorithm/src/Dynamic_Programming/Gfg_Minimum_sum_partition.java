package Dynamic_Programming;
import java.util.*;
public class Gfg_Minimum_sum_partition {
	public int minDifference(int arr[], int n) 
	{ 
	    // Your code goes here
	    Map<String,Integer> map=new HashMap<>();
	    return dfs(arr,n-1,0,0,map);
	} 
	
	public int dfs(int arr[],int n,int s1,int s2,Map<String,Integer> map){
	    if(n<0){
	        return Math.abs(s1-s2);
	    }
	    String k=n+","+s1;
	    if(!map.containsKey(k)){
	        int f=dfs(arr,n-1,s1+arr[n],s2,map);
	        int s=dfs(arr,n-1,s1,s2+arr[n],map);
	        map.put(k,Math.min(f,s));
	    }
	    return map.get(k);
	}
}
