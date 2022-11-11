package String;

public class Leetcode_make_the_string_great {
	public String makeGood(String s) {
	      
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)+32==s.charAt(i+1) || s.charAt(i)==s.charAt(i+1)+32){
                return makeGood(s.substring(0,i)+s.substring(i+2));
            }
        }
        return s;
    }
}
