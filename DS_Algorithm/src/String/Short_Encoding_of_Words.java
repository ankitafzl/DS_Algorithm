package String;
import java.util.*;
public class Short_Encoding_of_Words {

	 public int minimumLengthEncoding(String[] words) {
	        Arrays.sort(words,(a,b)->b.length()-a.length());
	        StringBuilder sb=new StringBuilder();
	        for(String str:words){
	            if(sb.indexOf(str+"#")==-1){
	                sb.append(str+"#");
	            }
	        }
	        return sb.length();
	    }
}
