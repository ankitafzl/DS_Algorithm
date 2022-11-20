package String;
import java.util.*;
public class Leetcode_Basic_Calculator {
	public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        int num = 0;
        int sign = 1;
        for (char ch: s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num *= 10;
                num += ch - '0';
            } else if (ch == '+' || ch == '-') {
                ans += sign * num;
                num = 0;
                sign = ch == '+' ? 1 : -1;
            } else if (ch == '(') {
                stack.push(ans);
                stack.push(sign);
                ans = 0;
                sign = 1;
            } else if (ch == ')') {
                ans += sign * num;
                num = 0;
                ans *= stack.pop();
                ans += stack.pop();
            }
        }
        if (num != 0) {
            ans += sign * num;
        }
        return ans;
    }
}
