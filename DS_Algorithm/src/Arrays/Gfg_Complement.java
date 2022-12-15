package Arrays;
import java.util.*;
public class Gfg_Complement {
	Vector<Integer> findRange(String str, int n) {
        // code here
        int count=0;
        int left=-1;
        //int right=-1;
        int max=0;
        int ans_left=-1;
        int ans_right=-1;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='0'){
                count++;
            }
            else{
                count--;
                if(count<0){
                    count=0;
                    left=-1;
                }
            }
            if(count==1 && left==-1){
                left=i;
            }
            if(count>max){
                max=count;
                ans_left=left;
                ans_right=i;
            }
        }
        Vector<Integer> ans=new Vector<>();
        if(ans_left==-1){
            ans.add(-1);
        }
        else{
            ans.add(ans_left+1);
            ans.add(ans_right+1);
        }
        return ans;
    }
}
