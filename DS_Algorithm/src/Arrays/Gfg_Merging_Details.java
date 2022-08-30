package Arrays;
import java.util.*;
public class Gfg_Merging_Details {
	 public List<List<String>> mergeDetails(List<List<String>> details) {
	        // Your code here
	        int n=details.size();
	        List<List<String>> ans=new ArrayList<>();
	        for(int i=0;i<n;i++){
	            List<String> d=details.get(i);
	            if(d.size()==0){
	                continue;
	            }
	            Set<String> set=new TreeSet<>();
	            String str=d.get(0);
	            for(int j=1;j<d.size();j++){
	                set.add(d.get(j));
	            }
	            
	            for(int j=i+1;j<n;j++){
	                List<String> curr=details.get(j);
	                for(int k=1;k<curr.size();k++){
	                    if(curr.size()==0){
	                        continue;
	                    }
	                    if(set.contains(curr.get(k))){// && curr.get(0).equals(str)){
	                        for(int l=1;l<curr.size();l++){
	                            set.add(curr.get(l));
	                        }
	                        curr.clear();
	                        break;
	                    }
	                }
	            }
	            List<String> list=new ArrayList<>();
	            list.add(str);
	            for(String st:set){
	                list.add(st);
	            }
	            ans.add(list);
	        }
	        return ans;
	    }
}
