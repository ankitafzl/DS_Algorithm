package Arrays;

public class Find_First_Palindromic_String_in_the_Array {
	public String firstPalindrome(String[] words) {
        for(String str:words){
            if(isPalindrome(str)){
                return str;
            }
        }
        return "";
    }
    
    private boolean isPalindrome(String str){
        int st=0;
        int end=str.length()-1;
        while(st<=end){
            if(str.charAt(st)==str.charAt(end)){
                st++;
                end--;
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
