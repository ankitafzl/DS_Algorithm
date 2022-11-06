package Queue;
import java.util.*;
public class Leetcode_Orderly_Queue {
	public String orderlyQueue(String s, int k) {
        if (k > 1) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            return String.valueOf(ch);
        }
        String ans = s;
        for (int i = 1; i < s.length(); ++i) {
            String str = s.substring(i) + s.substring(0, i);
            if (ans.compareTo(str) > 0){
                ans = str;
            }
        }
        return ans;
    }
}
