package Maths;

public class Leetcode_Mirror_Reflection {
	public int mirrorReflection(int p, int q) {
        int i = 1;
        while(i * p % q != 0){
            i++;
        }
        if(i * p / q % 2 == 0) {
            return 2;
        }
        return i % 2;  
    }
}
