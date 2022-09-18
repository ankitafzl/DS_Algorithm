package Arrays;
import java.util.*;
public class Leetcode_Palindrome_Pairs {
    
	// 1st Method
	
	
	 public static class Trie {
	        int pos;
	        Trie[] nodes;  
	        List<Integer> palins;
	        public Trie() {
	            pos = -1;
	            nodes = new Trie[26];
	            palins = new ArrayList<>();
	        }
	    }
	    
	    public List<List<Integer>> palindromePairs(String[] words) {
	         List<List<Integer>> ans = new ArrayList<>();
	        Trie trie = new Trie();
	        for (int i = 0; i < words.length; i++) {
	            add(trie, words[i], i);
	        }
	        for (int i = 0; i < words.length; i++) {
	            search(trie, words, i, ans);
	        }
	        return ans;
	    }
	    
	    public static void add(Trie root, String word, int pos) {
	        for (int i = word.length() - 1; i >= 0; i--) {
	            char ch = word.charAt(i);
	            if (isPalindrome(word, 0, i)) { 
	                root.palins.add(pos);
	            }
	            if (root.nodes[ch - 'a'] == null) {
	                root.nodes[ch - 'a'] = new Trie();
	            }
	            root = root.nodes[ch - 'a'];
	        }
	        root.pos = pos;
	        root.palins.add(pos);
	    }
	    
	    public static boolean isPalindrome(String str, int left, int right){
	        while (left < right) {
	            if (str.charAt(left++) != str.charAt(right--)) {
	                return false;
	            }
	        }
	        return true;
	    }
	    public static void search(Trie root, String[] words, int i, List<List<Integer>> ans) {
	        int len = words[i].length();
	        for (int j = 0; j < len && root != null; j++) {
	            if (root.pos >= 0 && i != root.pos && isPalindrome(words[i], j, len - 1)) {
	                ans.add(Arrays.asList(new Integer[] {i, root.pos}));
	            }
	            char ch = words[i].charAt(j);
	            root = root.nodes[ch - 'a'];
	        }
	        if (root != null && root.palins.size() > 0) { // assume 'xyxabc' is in trie, now try 'cba'
	            for (int j : root.palins) {
	                if (j != i) {
	                    ans.add(Arrays.asList(new Integer[] {i, j}));
	                }
	            }
	        }
	    }
	
	
	
	// 2nd Method;
	
	public List<List<Integer>> palindromePairs1(String[] words) {
        List<List<Integer>>  ans=new ArrayList<>();
        Map<String,Integer> map=new HashMap<>();
        
        for(int i=0;i<words.length;++i){
            map.put(words[i],i);
        }
        
        if(map.containsKey("")){
            int blank_idx=map.get("");
            for(int i=0;i<words.length;++i){
                if(i!=blank_idx && isPalindrome(words[i])){
                    ans.add(Arrays.asList(blank_idx,i));
                    ans.add(Arrays.asList(i,blank_idx));
                }
            }
        }
        
        for(int i=0;i<words.length;++i){
            String rev=new StringBuilder(words[i]).reverse().toString();
            Integer rev_idx=map.get(rev);
            if(rev_idx!=null && rev_idx!=i){
                ans.add(Arrays.asList(i,rev_idx));
            }
        }
        
        for(int i=0;i<words.length;++i){
            String curr=words[i];
            for(int j=1;j<curr.length();++j){
                String left=curr.substring(0,j);
                String right=curr.substring(j);
                if(isPalindrome(left)){
                    String rev_right=new StringBuilder(right).reverse().toString();
                    if(map.containsKey(rev_right)){
                        ans.add(Arrays.asList(map.get(rev_right),i));
                    }
                }
                if(isPalindrome(right)){
                    String rev_left=new StringBuilder(left).reverse().toString();
                    if(map.containsKey(rev_left)){
                        ans.add(Arrays.asList(i,map.get(rev_left)));
                    }
                }
            }
        }
        return ans;
    }
    
    private boolean isPalindrome(String words){
        int i=0;
        int j=words.length()-1;
        while(i<j){
            if(words.charAt(i++)!=words.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}
