package String;

public class To_Lower_Case {
	 public String toLowerCase(String s) {
	        String ans="";
	        for(int i=0;i<s.length();i++){
	            if(Character.isLowerCase(s.charAt(i))){
	                ans+=s.charAt(i); 
	            }
	            else{
	                ans+=Character.toLowerCase(s.charAt(i));
	            }
	        }
	        return ans;
	    }
}
