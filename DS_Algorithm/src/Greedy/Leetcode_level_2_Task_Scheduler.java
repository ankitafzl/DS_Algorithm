package Greedy;
import java.util.*;
public class Leetcode_level_2_Task_Scheduler {
	 public int leastInterval(char[] tasks, int n) {
         int[] map = new int[26];
         for (char task : tasks) {
             map[task - 'A']++;
         }
         Arrays.sort(map);
         int max = map[25] - 1;
         int idle = max * n;
         for (int i = 24; i >= 0 && map[i] > 0; i--) {
              idle -= (map[i] > max) ? max : map[i];
         }

         return (idle > 0) ? (tasks.length + idle) : tasks.length;
    }
}
