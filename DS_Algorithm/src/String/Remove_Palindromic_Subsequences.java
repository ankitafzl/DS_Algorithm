package String;

public class Remove_Palindromic_Subsequences {

	public int removePalindromeSub(String s) {
        if(s.length()==0){
            return 0;
        }
        if(isPalindrome(s)){
            return 1;
        }
        return 2;
    }
    
    boolean isPalindrome(String s){
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
   
    public int removePalindromeSub1(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        return sb.toString().equals(s) ? 1 : 2;
    }
}
