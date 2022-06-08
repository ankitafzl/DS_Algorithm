package String;

public class Sorting_the_Sentence {
	public String sortSentence(String s) {
        String str[]=s.split(" ");
        String temp[]=new String[str.length];
        String ans="";
        for(int i=0;i<str.length;i++){
            int ind=str[i].charAt(str[i].length()-1)-'0';
            temp[ind-1]=str[i].substring(0,str[i].length()-1);
        }
        for(int i=0;i<temp.length;i++){
            ans+=temp[i];
            ans+=" ";
        }
        return ans.trim();
    }
}
