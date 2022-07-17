package Trie;
import java.util.*;
public class Word_Search_II {
	public List<String> findWords(char[][] board, String[] words) {
        List<String> ans = new ArrayList<>();
        TrieNode root = buildTrie(words);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs(board, i, j, root, ans);
            }
        }
        return ans;  
    }
    
    public void dfs(char[][] board, int i, int j, TrieNode p, List<String> ans) {
        char ch = board[i][j];
        if (ch == '#' || p.next[ch - 'a'] == null) { 
            return; 
        }
        p = p.next[ch - 'a'];
        if (p.word != null) {   
            ans.add(p.word);
            p.word = null;     
        }

        board[i][j] = '#';
        if (i > 0){
            dfs(board, i - 1, j ,p, ans); 
        } 
        if (j > 0){
            dfs(board, i, j - 1, p, ans);
        } 
        if (i < board.length - 1){
            dfs(board, i + 1, j, p, ans);
        }  
        if (j < board[0].length - 1) {
            dfs(board, i, j + 1, p, ans); 
        }
        board[i][j] = ch;
    }
    public TrieNode buildTrie(String[] words) {
        TrieNode root = new TrieNode();
        for (String w: words) {
            TrieNode p = root;
            for (char c: w.toCharArray()) {
                int i = c - 'a';
                if (p.next[i] == null) {
                    p.next[i] = new TrieNode(); 
                }
                p = p.next[i];
           }
           p.word = w;
        }
        return root;
    }

    class TrieNode {
        TrieNode[] next = new TrieNode[26];
        String word;
    }
}
