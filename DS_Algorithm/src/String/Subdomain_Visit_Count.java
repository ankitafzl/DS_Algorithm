package String;
import java.util.*;
public class Subdomain_Visit_Count {
	public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        
        for (String domain: cpdomains) {
            String[] cp_info = domain.split("\\s+");
            String[] frags = cp_info[1].split("\\.");
            int count = Integer.valueOf(cp_info[0]);
            String str = "";
            
            for (int i = frags.length - 1; i >= 0; --i) {
                str = frags[i] + (i < frags.length - 1 ? "." : "") + str;
                map.put(str, map.getOrDefault(str, 0) + count);
            }
        }
        List<String> ans = new ArrayList<>();
        for (String dom:map.keySet()) {
            ans.add("" + map.get(dom) + " " + dom);
        }
        return ans;
    }
}
