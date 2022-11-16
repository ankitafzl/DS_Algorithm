package Binary_Search;

public class Leetcode_Guess_Number_Higher_or_Lower {
	
	/** 
	 * Forward declaration of guess API.
	 * @param  num   your guess
	 * @return 	     -1 if num is higher than the picked number
	 *			      1 if num is lower than the picked number
	 *               otherwise return 0
	 * 
	 */
	int guess(int num) {
		return 0;
	}

	 public int guessNumber(int n) {
	       int i=1;
	       int j=n;
	       while(i<=j){
	           int mid=i+(j-i)/2;
	           if(guess(mid)==0){
	               return mid;
	           }
	           else if(guess(mid)==1){
	               i=mid+1;
	           }
	           else{
	               j=mid-1;
	           }
	       }
	       return -1;
	    }
}
