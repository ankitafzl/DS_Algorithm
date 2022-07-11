package String;

public class Check_if_Number_Has_Equal_Digit_Count_and_Digit_Value {
	public boolean digitCount(String num) {
	       int[] freq_Arr = new int[10]; 
	       for(char ch : num.toCharArray()){
	            freq_Arr[ch-'0']++;
	        }
	        
	        for(int i=0;i<num.length();i++){
	            int freq = num.charAt(i)-'0';
	            freq_Arr[i] = freq_Arr[i] - freq; 
	        }
	        for(int i=0;i<10;i++){
	            if(freq_Arr[i]!=0){
	                return false;
	            }
	        }
	        return true;
	    }
}
