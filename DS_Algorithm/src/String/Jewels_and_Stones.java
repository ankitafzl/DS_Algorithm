package String;

public class Jewels_and_Stones {

	 public int numJewelsInStones(String jewels, String stones) {
	        int num_of_jewels=0;
	       
	        for(int i=0;i<stones.length();i++){
	            if(jewels.indexOf(stones.charAt(i))>-1){
	                num_of_jewels++;
	            }
	        }
	        return num_of_jewels;
	    }
}
