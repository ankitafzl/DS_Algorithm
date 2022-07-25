package Maths;
import java.util.*;
public class Letter_Case_Permutation {

	 public List<String> letterCasePermutation(String s) {
	        List<String> list=new ArrayList<>();
	         dfs(s.toLowerCase().toCharArray(), list, 0, s.length());
	         return list;
	    }
	    
	    public void dfs(char[] char_arr, List<String> list, int i, int n) {
	        if (i < n) {
	            dfs(char_arr, list, i+1, n);
	            if (Character.isLetter(char_arr[i])) {
	                char_arr[i] = Character.toUpperCase(char_arr[i]);
	                dfs(char_arr, list, i+1, n);
	                char_arr[i] = Character.toLowerCase(char_arr[i]);
	            }
	        } 
	        else{
	            list.add(new String(char_arr));
	        } 
	    }
	
}
