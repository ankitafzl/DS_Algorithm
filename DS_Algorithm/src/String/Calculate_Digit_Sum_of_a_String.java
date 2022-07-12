package String;

public class Calculate_Digit_Sum_of_a_String {
	public String digitSum(String s, int k) {
        while(s.length()>k){
            String str="";
            for(int i=0;i<s.length();i++){
                int curr=0;
                for(int j=i;j<i+k &&j<s.length();j++){
                    curr+=(s.charAt(j)-'0');
                }
                i=i+k-1;
                str+=(Integer.toString(curr));
            }
            s=str;
        }
        return s;
    }
}
