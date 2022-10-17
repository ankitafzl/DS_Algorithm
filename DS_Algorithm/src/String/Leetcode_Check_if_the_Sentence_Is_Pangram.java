package String;

public class Leetcode_Check_if_the_Sentence_Is_Pangram {
	 public boolean checkIfPangram(String sentence) {
	        boolean flag=false;
	        for(char ch='a';ch<='z';ch++){
	            boolean pan=solve(ch,sentence);
	            if(pan==false){
	                flag=false;
	                break;
	            }
	            else{
	                flag=true;
	            }
	        }
	        return flag;
	    }
	    
	    public boolean solve(char ch,String str){
	        for(char ch1:str.toCharArray()){
	            if(ch1==ch){
	                return true;
	            }
	        }
	        return false;
	    }
}
