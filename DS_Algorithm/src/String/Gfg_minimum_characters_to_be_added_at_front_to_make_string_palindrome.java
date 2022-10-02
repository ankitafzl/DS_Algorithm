package String;

public class Gfg_minimum_characters_to_be_added_at_front_to_make_string_palindrome {
	public static int minChar(String str) {
	       //Write your code here
	       int n=str.length();
	       int i=0;
	       int j=n-1;
	       int j1=j;
	       int count=0;
	       while(i<j){
	           if(str.charAt(i)==str.charAt(j)){
	               i++;
	               j--;
	           }
	           else{
	               count++;
	               i=0;
	               j1--;
	               j=j1;
	           }
	       }
	       return count;
	    }
}
