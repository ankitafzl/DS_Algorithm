package Maths;

public class Leetcode_level_2_Multiply_Strings {
	public String multiply(String num1, String num2) {
        int n1 = num1.length();
        int n2 = num2.length();
        int[] pos = new int[n1 + n2];
        for (int i = n1 - 1; i >= 0; --i) {
            for (int j = n2 - 1; j >= 0; --j) {
                int p1 = i + j, p2 = i + j + 1;
                int prod = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = prod + pos[p2];
                pos[p2] = sum % 10;
                pos[p1] += sum / 10;
           }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pos.length; ++i) {
             if (pos[i] > 0 || sb.length() > 0) {
                 sb.append(pos[i]);
             }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
