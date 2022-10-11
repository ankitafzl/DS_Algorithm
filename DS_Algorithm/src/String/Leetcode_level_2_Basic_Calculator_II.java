package String;

public class Leetcode_level_2_Basic_Calculator_II {
	 public int calculate(String s) {
	        
	        if(s==null) {// && s.length()==0){
	            return 0;
	        }
	        
	        char ch[]=s.toCharArray();
	        int curr=0;
	        char op='+';
	        int sum=0;
	        int x=0;
	        
	        for(int i=0;i<ch.length;i++){
	            if(Character.isDigit(ch[i])){
	                curr=curr*10+ch[i]-'0';
	            }
	            
	            if(!Character.isDigit(ch[i]) && ch[i]!=' ' || i==ch.length-1){
	                if(op=='+'){
	                    sum+=x;
	                    x=curr;
	                }
	                else if(op=='-'){
	                    sum+=x;
	                    x=-curr;
	                }
	                else if(op=='*'){
	                    x=x*curr;
	                }
	                else if(op=='/'){
	                    x=x/curr;
	                }
	                op=ch[i];
	                curr=0;
	            }
	        }
	        sum+=x;
	        return sum;
	    }
}
