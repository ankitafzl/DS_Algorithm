package String;

public class Is_Subsequence {
	public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) {
            return true;
        }
			
		int index_s = 0, index_t = 0;
		while(index_t < t.length()) {
			if(s.charAt(index_s) == t.charAt(index_t)) {
				index_s++;
			}
			index_t++;
			if(index_s == s.length())
				return true;
		}
		return false;
    }
}
