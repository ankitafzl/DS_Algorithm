package Dynamic_Programming;
import java.util.*;
public class Gfg_Unique_partitions {
	public ArrayList<ArrayList<Integer>> UniquePartitions(int n)
    {
        // Code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        int idx=n-1;

        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=i+1;
        }
        dfs(ans,list,idx,n,temp);
        return ans;
    }
    void dfs(ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> list,int idx,int n,int[] temp){
        if(idx<0 || n<0){
            return;
        }
        list.add(temp[idx]);
        if(n-temp[idx]==0){
            ans.add(new ArrayList<>(list));
        }
        dfs(ans,list,idx,n-temp[idx],temp);
        list.remove(list.size()-1);
        dfs(ans,list,idx-1,n,temp);

    }
}
