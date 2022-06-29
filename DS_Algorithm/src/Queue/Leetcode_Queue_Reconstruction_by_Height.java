package Queue;
import java.util.*;
public class Leetcode_Queue_Reconstruction_by_Height {
	public int[][] reconstructQueue(int[][] people) {
        List<int[]> ans=new ArrayList<>();
        Arrays.sort(people,(a,b)->{
            return (a[0]==b[0] ? a[1]-b[1]:b[0]-a[0]);
        });
        for(int []i:people){
            ans.add(i[1],i);
        }
        return ans.toArray(new int[people.length][2]);
    }
}
