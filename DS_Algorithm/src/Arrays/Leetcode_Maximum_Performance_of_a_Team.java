package Arrays;
import java.util.*;
public class Leetcode_Maximum_Performance_of_a_Team {
	public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int[][] dp = new int[n][2];
        for (int i = 0; i < n; i++) {
            dp[i] = new int[]{efficiency[i], speed[i]};
        }
        
        Arrays.sort(dp, (a,b) -> (b[0] - a[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, (a, b) -> a - b);
        long ans = 0, sum = 0;
        long MOD = (long) Math.pow(10, 9) + 7;
        for (int[] i : dp) {
            pq.offer(i[1]);
            sum = (sum + i[1]);
            if (pq.size() > k) {
                sum -= pq.poll();
            }
            ans = Math.max(ans, (sum * i[0]));
        }
        return (int) (ans % MOD);
    }
}
