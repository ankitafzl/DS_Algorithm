package Maths;
import java.util.*;
public class Combinations_of_number_in_given_range {
	public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        generate_subset(1,n,new ArrayList<>(),ans,k);
        return ans;
    }
    
    void generate_subset(int st,int n,List<Integer> curr,List<List<Integer>> ans,int k){
        if(curr.size()==k){
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        for(int i=st;i<=n;i++){
            curr.add(i);
            generate_subset(i+1,n,curr,ans,k);
            curr.remove(curr.size()-1);
        }
    }
}
