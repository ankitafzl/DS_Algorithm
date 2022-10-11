package String;

public class Gfg_Decode_the_string {
	static int i;
    static String decodedString(String s){
        // code here
        i=0;
        return solve(s);
    }
    
    static String solve(String str){
        StringBuilder sb=new StringBuilder();
        while(i<str.length()){
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                int n=0;
                while(str.charAt(i)>='0' && str.charAt(i)<='9'){
                    n=n*10+(str.charAt(i)-'0');
                    i++;
                }
                i++;
                String newStr=solve(str);
                while(n>0){
                    sb.append(newStr);
                    n--;
                }
            }
            else{
                if(str.charAt(i)==']'){
                    i++;
                    return sb.toString();
                }
                else{
                    sb.append(""+str.charAt(i));
                    i++;
                }
            }
        }
        return sb.toString();
    }
}
