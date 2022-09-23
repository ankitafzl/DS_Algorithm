package Arrays;
import java.util.*;
public class IPL_2021_Match_Day_2 {
	static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        ArrayList<Integer> ans=new ArrayList<>();
        Deque<Integer> dq=new LinkedList<>();
        for(int i=0;i<n;i++){
            while(dq.size()>0 && i-dq.peek()>=k){
                dq.removeFirst();
            }
            while(dq.size()>0 && arr[dq.getLast()]<=arr[i]){
                dq.removeLast();
            }
            dq.addLast(i);
            if(i>=k-1){
                ans.add(arr[dq.peek()]);
            }
        }
        return ans;
    }
}
