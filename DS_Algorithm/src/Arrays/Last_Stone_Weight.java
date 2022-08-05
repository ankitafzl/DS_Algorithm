package Arrays;
import java.util.*;
public class Last_Stone_Weight {

	public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int stone : stones) {
            heap.add(stone);
        }
        
        while (heap.size() > 1) {
            int stone1 = heap.remove();
            int stone2 = heap.remove();
            
            if (stone1 - stone2 != 0) {
                heap.add(stone1 - stone2);
            }
            
        }
        return heap.isEmpty() ? 0 : heap.remove();
    }
}
