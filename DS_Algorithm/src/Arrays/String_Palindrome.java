package Arrays;

public class String_Palindrome {
	public static boolean isPalindrome(String str){
		char[] charArray=str.toCharArray();
		int start=0;
		int end=str.length()-1;
		while(start<end){
			if(charArray[start]!=charArray[end])
				return false;
			start++;
			end--;
		}
		return true;
	}
	
     public static void main(String [] args){
    	 System.out.println(isPalindrome("madam"));
    	 System.out.println(isPalindrome("that"));
     }
}
