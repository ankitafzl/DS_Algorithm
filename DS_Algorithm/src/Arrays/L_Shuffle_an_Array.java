package Arrays;
import java.util.*;
public class L_Shuffle_an_Array {
	int[] arr;
    public L_Shuffle_an_Array(int[] nums) {
        arr=nums;
    }
    
    public int[] reset() {
        return arr;
    }
    
    public int[] shuffle() {
        int[] shuffle=arr.clone();
        for(int i=shuffle.length-1;i>=0;i--){
            int ind=new Random().nextInt(i+1);
            int temp=shuffle[i];
            shuffle[i]=shuffle[ind];
            shuffle[ind]=temp;
        }
        return shuffle;
    }
}
