package Arrays;
import java.util.*;
public class Leetcode_Insert_Delete_GetRandom {
	private List<Integer> list;
    private Map<Integer,Integer> map;
    java.util.Random rand = new java.util.Random();
    public Leetcode_Insert_Delete_GetRandom() {
        list=new ArrayList<>();
        map=new HashMap<>();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)) {
            return false;
        }
        map.put(val,list.size());
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) {
            return false;
        }
        int index=map.get(val);
        if(index!=list.size()-1){
            int last=list.get(list.size()-1);
            list.set(index,last);
            map.put(last,index);
        }
        map.remove(val);
        list.remove(list.size()-1);
        return true;
    }
    
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}
