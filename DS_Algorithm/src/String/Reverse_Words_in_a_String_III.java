package String;

public class Reverse_Words_in_a_String_III {
	 public String reverseWords(String s) {
	       StringBuilder ans=new StringBuilder();
	       if(s==null || s.length()==0){
	           return s;
	       }
	        String[] split_word=s.split(" ");
	        for(String w:split_word){
	            StringBuilder sb=new StringBuilder();
	            sb.append(w);
	            sb.reverse();
	            ans.append(sb.toString()+" ");
	        }
	        ans.setLength(ans.length()-1);
	        return ans.toString();
	    }
}
