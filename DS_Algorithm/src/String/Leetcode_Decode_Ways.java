package String;

public class Leetcode_Decode_Ways {
	public int numDecodings(String s) {
        if(s.length()==0 || s.charAt(0)=='0'){
            return 0;
        }
        
        if(s.length()==1){
            return 1;
        }
        
        int count1=1;
        int count2=1;
        for(int i=1;i<s.length();i++){
            int x=s.charAt(i)-'0';
            int xx=(s.charAt(i-1)-'0')*10+x;
            int count=0;
            if(x>0){
                count+=count2;
            }
            
            if(xx>=10  && xx<=26){
                count+=count1;
            }
            count1=count2;
            count2=count;
        }
        return count2;
    }
}
