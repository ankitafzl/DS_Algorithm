package String;
import java.util.*;
public class Leetcode_Generate_Parentheses {
	public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generateParenthesis(ans,"", 0, 0, n);
        return ans;
    }

    private void generateParenthesis(List<String> ans, String str, int op, int cl, int n) {
        if (op == n && cl == n) {
            ans.add(str);
            return;
        }
        // If the number of open parentheses is less than the given n
        if (op < n) {
            generateParenthesis(ans, str + "(", op + 1, cl, n);
        }
        // If we need more close parentheses to balance
        if (cl < op) {
            generateParenthesis(ans, str + ")", op, cl + 1, n);
        }
    }
}
