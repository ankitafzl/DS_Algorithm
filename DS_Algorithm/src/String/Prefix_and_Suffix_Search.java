package String;
import java.util.*;
public class Prefix_and_Suffix_Search {

	 HashMap<String,Integer> map = null;
	    public void WordFilter(String[] words) {
	          map = new HashMap<>();

	        int ind=0;
	        for(String w: words){
	            for(int i=0;i<=w.length();i++){
	                for(int j=0;j<=w.length();j++){
	                    String prefixAndSuffix = w.substring(0, i) + "#" + w.substring(j);
	                    map.put(prefixAndSuffix, ind);
	                }
	            }
	            ind++;
	        }
	    }
	    
	    public int f(String prefix, String suffix) {
	        String queryStr = prefix + "#" + suffix;
	        return map.getOrDefault(queryStr, -1);
	    }
}
