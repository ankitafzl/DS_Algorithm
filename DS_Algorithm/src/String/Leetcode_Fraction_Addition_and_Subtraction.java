package String;
import java.util.*;
public class Leetcode_Fraction_Addition_and_Subtraction {

	public String fractionAddition(String expression) {
        Scanner sc = new Scanner(expression).useDelimiter("/|(?=[-+])");
        int x = 0, y = 1;
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            x = x * b + a * y;
            y *= b;
            int g = gcd(x, y);
            x /= g;
            y /= g;
        }
        return x + "/" + y;
    }

    private int gcd(int a, int b) {
        return a != 0 ? gcd(b % a, a) : Math.abs(b);
    }
}
