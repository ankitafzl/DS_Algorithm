package Dynamic_Programming;
import java.util.*;
public class Leetcode_Word_Break {
	public static void main(String[] args) {
        System.out.println(new Leetcode_Word_Break().wordBreak("leetcode", Arrays.asList("leet", "code")));
        System.out.println(new Leetcode_Word_Break().wordBreak("applepenapple", Arrays.asList("apple", "pen")));
        System.out.println(new Leetcode_Word_Break().wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")));
    }

	 public boolean wordBreak(String s, List<String> wordDict) {
	        int n=s.length();
	        boolean dp[]=new boolean[n+1];
	        Set<String> set=new HashSet<>(wordDict);
	        dp[0] = true;
	        for (int i = 1; i < dp.length; i++) {
	            for (int j = i - 1; j >= 0; j--) {
	                if (dp[j]==true && set.contains(s.substring(j, i))) {
	                    dp[i] = true;
	                    break;
	                }
	            }
	        }

	        return dp[n];
	    }

}
