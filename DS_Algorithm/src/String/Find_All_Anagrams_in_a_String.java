package String;
import java.util.*;
public class Find_All_Anagrams_in_a_String {
	public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s == null || s.length() == 0 || s.length() < p.length()) {
            return list;
        }
        if (s.length() == p.length() && isAnagram(s, p)) {
            list.add(0);
            return list;
        }

        int i = 0;
        int j = p.length();
        while (j <= s.length()) {
            if (isAnagram(s.substring(i, j), p)) {
                list.add(i);
            }
            i++;
            j++;
        }
        
        return list;
    }
    
    private boolean isAnagram(String s1, String s2) {
        int[] arr = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
