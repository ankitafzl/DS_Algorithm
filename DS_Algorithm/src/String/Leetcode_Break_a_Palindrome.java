package String;

public class Leetcode_Break_a_Palindrome {
	public String breakPalindrome(String palindrome) {
        char []ch=palindrome.toCharArray();
        int n=ch.length;
        if(n<2){
            return "";
        }
        
        for(int i=0;i<n/2;i++){
            if(ch[i]!='a'){
                ch[i]='a';
                return String.valueOf(ch);
            }
        }
        ch[n-1]='b';
        return String.valueOf(ch);
    }
}
