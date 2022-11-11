package Maths;

public class Leetcode_Maximum_69_Number {
	public int maximum69Number (int num) {
        int temp = num;
        int ch = 0;
        int dig = 1;
        while (temp>0) {
            if (temp%10 == 6){
                ch = 3*dig;
            }
            temp = temp/10;
            dig = dig*10;
        }
        return num + ch;
    }

}
