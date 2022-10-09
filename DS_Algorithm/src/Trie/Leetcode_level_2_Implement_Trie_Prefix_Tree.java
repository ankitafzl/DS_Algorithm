package Trie;
import java.util.*;
public class Leetcode_level_2_Implement_Trie_Prefix_Tree {
	 class TrieNode {
	        boolean isEnd = false;
	        Map<Character, TrieNode> map = new HashMap<>();
	    }
	    
	    TrieNode root;
	    public Leetcode_level_2_Implement_Trie_Prefix_Tree() {
	        root=new TrieNode();
	    }
	    
	    public void insert(String word) {
	        TrieNode node = root;
	        for (char ch : word.toCharArray()) {
	            node.map.putIfAbsent(ch, new TrieNode());
	            node = node.map.get(ch);
	        }
	        node.isEnd = true;
	    }
	    
	    public boolean search(String word) {
	        TrieNode node = findNode(word);
	        if (node == null || !node.isEnd) {
	            return false;
	        }
	        return true;
	    }
	    
	    public boolean startsWith(String prefix) {
	        TrieNode node = findNode(prefix);
	        return node != null;
	    }
	    
	    private TrieNode findNode(String word) {
	        TrieNode node = root;
	        for (char ch : word.toCharArray()) {
	            if (!node.map.containsKey(ch)) {
	                return null;
	            }
	            node = node.map.get(ch);
	        }
	        return node;
	    }
}
