package Arrays;
import java.util.*;
public class leetcode_Maximum_Units_on_a_Truck {

	 public int maximumUnits(int[][] boxTypes, int truckSize) {
	        Arrays.sort(boxTypes,(a,b)-> -Integer.compare(a[1],b[1]));
	        int max_units=0;
	        for(int []box:boxTypes){
	            if(truckSize<box[0]){
	                return max_units+truckSize*box[1];
	            }
	            max_units+=box[0]*box[1];
	            truckSize-=box[0];
	        }
	        return max_units;
	    }
}
