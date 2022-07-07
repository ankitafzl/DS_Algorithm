package String;

public class Maximum_Score_After_Splitting_a_String {

	public int maxScore(String s) {
        int one = 0;
        int zero = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '0'){
                 zero++;
            }
            else{
                 one++;
            }        
        }
            
        int cur_Zero = (s.charAt(0) == '0' ? 1 : 0);
        int cur_One = (s.charAt(0) == '1' ? 1 : 0);
        int ans = cur_Zero + one - cur_One;
        for(int i=1;i<s.length()-1;i++){
            if(s.charAt(i) == '0'){
                cur_Zero++;
            }
            else{
                cur_One++;
            } 
            ans = Math.max(ans, cur_Zero + one-cur_One);
        }
        return ans;
    }
}
