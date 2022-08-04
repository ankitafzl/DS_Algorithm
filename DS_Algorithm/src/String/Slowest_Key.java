package String;

public class Slowest_Key {
	public char slowestKey(int[] releaseTimes, String keysPressed) {
        char[] ch = keysPressed.toCharArray();
        int len = ch.length;
        char ans = ch[0];
        int max_num = releaseTimes[0];

        for (int i = 1; i < len; i++) {
            int temp = releaseTimes[i] - releaseTimes[i - 1];
            if (temp > max_num) {
                max_num = temp;
                ans = ch[i];
            } 
            else if (temp == max_num && ch[i] > ans) {
                max_num = temp;
                ans = ch[i];
            }
        }

        return ans;
    }
}
