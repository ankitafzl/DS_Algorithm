package String;

public class Minimum_Number_of_Steps_to_Make_Two_Strings_Anagram {
	public int minSteps(String s, String t) {
        int count[]=new int[26];
        int ans=0;
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            if(count[t.charAt(i)-'a']-- <=0){
                ans++;
            }
        }
        return ans;
    }
}
