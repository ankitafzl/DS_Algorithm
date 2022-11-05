package String;

public class Leetcode_Reverse_String_II {
	public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        for(int st=0;st<ch.length;st+=2*k){
            int i = st;
            int j = Math.min(st+k-1, ch.length-1);
            while(i<j){
                char temp = ch[i];
                ch[i++] = ch[j];
                ch[j--] = temp;
            }
        }
        return new String(ch);
    }
}
