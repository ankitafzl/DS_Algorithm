package String;

public class Greatest_English_Letter_in_Upper_and_Lower_Case {

	 public String greatestLetter(String s) {
	        int lower_case[]=new int[26];
	        int upper_case[]=new int[26];
	        for(char ch:s.toCharArray()){
	            if(Character.isLowerCase(ch)){
	                lower_case[ch-'a']++;
	            }
	            else{
	                upper_case[ch-'A']++;
	            }
	        }
	        
	        for(int i=25;i>=0;i--){
	            if(lower_case[i]>0 && upper_case[i]>0){
	                return new String(""+(char)(i+'A'));
	            }
	        }
	        return "";
	    }
}
