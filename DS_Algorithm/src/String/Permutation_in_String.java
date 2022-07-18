package String;

public class Permutation_in_String {
	 public boolean checkInclusion(String s1, String s2) {
	        if (s1 == null || s2 == null || s1.length() > s2.length()){
	            return false;
	        } 

	        Integer[] freq = countFreq(s1);
	        int n = s2.length(), left = 0, right = 0;
	        int count = s1.length();
	        while (right < n) {
	            char c = s2.charAt(right);
	            if (freq[c] == null) {
	                freq = countFreq(s1);
	                left = ++right;
	                count = s1.length();
	                continue;
	            }
	            right++;
	            count--;
	            freq[c]--;
	            
	            while(freq[c] < 0) {
	                freq[s2.charAt(left++)]++;
	                count++;
	            }
	            
	            if (count == 0) return true;
	        }
	        return count == 0;
	    }
	    
	    private Integer[] countFreq(String s) {
	        Integer[] freq = new Integer[256];
	        for (char c : s.toCharArray()) freq[c] = freq[c] == null ? 1 : freq[c] + 1;
	        return freq;
	    }
}
