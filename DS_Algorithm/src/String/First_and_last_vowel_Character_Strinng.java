package String;

public class First_and_last_vowel_Character_Strinng {
    
	public static void main(String args[]) {
		String []str= {"oreo","sirish","apple"};
		System.out.println(solve(str.length,str));
	}
	
	public static String solve(int input1,String[] input2) {
		
		String ans="";
		if(input1==0) {
			return "no match fount";
		}
		
		for(int i=0;i<input1;i++) {
			if(isVowel(input2[i].charAt(0))) {
				if(isVowel(input2[i].charAt(input2[i].length()-1))) {
					ans+=input2[i];
				}
			}
		}
		return ans.toLowerCase();
	}
	
	public static boolean isVowel(char c) {
		char ch[]= {'a','e','i','o','u','A','E','I','O','U'};
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==c) {
				return true;
			}
		}
		return false;
	}
}
