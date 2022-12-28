package Arrays;
import java.util.*;
public class Leetcode_Maximum_Bags_With_Full_Capacity_of_Rocks {
	public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n=capacity.length;
        int []temp=new int[n];  // it holdes the Diff between max and actual capacity..
    
        for(int i=0;i<n;i++){
            temp[i]=capacity[i]-rocks[i];   // inserting Diff our Diff array according to index.
        }
        Arrays.sort(temp);     // sorting the Diff array..
        int count=0;
        for(int i=0;i<n;i++){        
           if(temp[i]==0){                 // if our bag is alrady full  no need to insert addtionalROck
               count++;
            }else {
                if(additionalRocks>=temp[i]){ // if space if less then Additional rock then we can put rocks in bag.
                   additionalRocks=additionalRocks-temp[i]; // reaming Additionals Rock.
                   count++;
                }
            }
        }
        return count;
    }
}
