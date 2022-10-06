package hashing;
import java.util.*;
public class Leetcode_Time_Based_Key_Value_Store {
	
	//method 1
	
	Map<String, TreeMap<Integer, String>> map;
    /** Initialize your data structure here. */
    public Leetcode_Time_Based_Key_Value_Store() {
        map = new HashMap<>();
    }
   
    public void set(String key, String value, int timestamp) {
        TreeMap<Integer, String> treeMap = map.getOrDefault(key, new TreeMap<>());
        treeMap.put(timestamp, value);
        map.put(key, treeMap);
    }
   
    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";
        TreeMap<Integer, String> treeMap = map.get(key);
        Integer t = treeMap.floorKey(timestamp);
        return t != null ? treeMap.get(t) : "";
    }
    
    //method 2
    
//	    HashMap<String,List<Pair<String,Integer>>> map;
//	    public Leetcode_Time_Based_Key_Value_Store() {
//	        map=new HashMap<>();
//	    }
//	    
//	    public void set(String key, String value, int timestamp) {
//	        map.putIfAbsent(key,new ArrayList<>());
//	        map.get(key).add(new Pair(value,timestamp));
//	    }
//	    
//	    public String get(String key, int timestamp) {
//	        String ans="";
//	        if(map.containsKey(key)){
//	            List<Pair<String,Integer>> temp=map.get(key);
//	            int left=0;
//	            int right=temp.size()-1;
//	            while(left<=right){
//	                int mid=left+(right-left)/2;
//	                if(temp.get(mid).getValue()<=timestamp){
//	                    ans=temp.get(mid).getKey();
//	                    left=mid+1;
//	                }
//	                else{
//	                    right=mid-1;
//	                }
//	            }
//	        }
//	        return ans;
//	    }

}
