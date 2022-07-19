package Arrays;
import java.util.*;
public class Leetcode_Pascal_s_Triangle {

	public List<List<Integer>> generate(int numRows) {
        if(numRows==0){
            return new ArrayList<>();
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> r=new ArrayList<>();
            
            for(int j=0;j<i;j++){
                if(j==0 || j==i-1){
                    r.add(1);
                }
                else{
                    r.add(ans.get(i-2).get(j)+ans.get(i-2).get(j-1));
                }
            }
            
            ans.add(r);
        }
        return ans;
    }
}
