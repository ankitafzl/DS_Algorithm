package Map;
import java.util.*;
class alphanumeric {
    public String name;
    public int count;
    alphanumeric(String name, int count) {
        this.name = name;
        this.count = count;
    }
};
public class Gfg_Earthquake_and_the_Paint_Shop {
	alphanumeric[] sortedStrings(int N, String A[]) {
        TreeMap<String,Integer> map=new TreeMap<>();
        for(String str:A){
            map.put(str,map.getOrDefault(str,0)+1);
        }
         alphanumeric[] ans=new alphanumeric[map.size()];
         int i=0;
         for(String str:map.keySet()){
             ans[i]=new alphanumeric(str,map.get(str));
             i++;
         }
         return ans;
    }
}
