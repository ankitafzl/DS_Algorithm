package set;
import java.util.*;
public class Gfg_Replace_every_element_with_the_least_greater_element_on_its_right {
	public static ArrayList<Integer> findLeastGreater(int n, int[] arr) {
        // code here
        TreeSet<Integer> set=new TreeSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            set.add(arr[i]);
            if(set.higher(arr[i])==null){
                list.add(-1);
            }
            else{
                list.add(set.higher(arr[i]));
            }
        }
        Collections.reverse(list);
        return list;
    }
}
