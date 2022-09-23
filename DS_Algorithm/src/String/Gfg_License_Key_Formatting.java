package String;

public class Gfg_License_Key_Formatting {
	static String ReFormatString(String S, int K){
        // code here
        StringBuilder sb=new StringBuilder();
        int count=0;
        int n=S.length();
        for(int i=n-1;i>=0;i--){
            if(S.charAt(i)=='-'){
                continue;
            }
            if(count==K){
                sb.append('-');
                count=0;
                
            }
            sb.append(S.charAt(i));
            count++;
        }
        return sb.reverse().toString().toUpperCase();
    }
}
