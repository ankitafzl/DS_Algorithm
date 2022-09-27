package String;

public class Leetcode_Push_Dominoes {
	public String pushDominoes(String dominoes) {
        dominoes = 'L' + dominoes + 'R';
        int n=dominoes.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0, j = 1; j < n; ++j) {
            if (dominoes.charAt(j) == '.')
                continue;
            int middle = j - i - 1;
            if (i > 0)
                sb.append(dominoes.charAt(i));
            if (dominoes.charAt(i) == dominoes.charAt(j))
                for (int k = 0; k < middle; k++)
                    sb.append(dominoes.charAt(i));
            else if (dominoes.charAt(i) == 'L' && dominoes.charAt(j) == 'R')
                for (int k = 0; k < middle; k++)
                    sb.append('.');
            else {
                for (int k = 0; k < middle / 2; k++)
                    sb.append('R');
                if (middle % 2 == 1)
                    sb.append('.');
                for (int k = 0; k < middle / 2; k++)
                    sb.append('L');
            }
            i = j;
        }
        return sb.toString();
    }
}
