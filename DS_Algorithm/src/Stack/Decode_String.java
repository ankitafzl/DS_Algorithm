package Stack;
import java.util.*;
public class Decode_String {
	public String decodeString(String s) {
        String ans = "";
        Stack<Integer> count_stack = new Stack<>();
        Stack<String> ans_stack = new Stack<>();
        int idx = 0;
        while (idx < s.length()) {
            if (Character.isDigit(s.charAt(idx))) {
                int count = 0;
                while (Character.isDigit(s.charAt(idx))) {
                    count = 10 * count + (s.charAt(idx) - '0');
                    idx++;
                }
                count_stack.push(count);
            }
            else if (s.charAt(idx) == '[') {
                ans_stack.push(ans);
                ans = "";
                idx++;
            }
            else if (s.charAt(idx) == ']') {
                StringBuilder temp = new StringBuilder (ans_stack.pop());
                int repeatTimes = count_stack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(ans);
                }
                ans = temp.toString();
                idx++;
            }
            else {
                // Character
                ans += s.charAt(idx);
                idx++;
            }
        }
        return ans;
    }
}
