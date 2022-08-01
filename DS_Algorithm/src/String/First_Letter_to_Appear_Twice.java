package String;

public class First_Letter_to_Appear_Twice {
	 public char repeatedCharacter(String s) {
	        int freq[]=new int[26];
	        for(char ch:s.toCharArray()){
	            if(freq[ch-'a']>0){
	                return ch;
	            }
	            freq[ch-'a']++;
	        }
	        return 'a';
	    }
}
