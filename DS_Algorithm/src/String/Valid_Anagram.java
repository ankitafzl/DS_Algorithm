package String;

public class Valid_Anagram {
	public boolean isAnagram(String s, String t) {
		if(s.length()!=t.length()) {
			return false;
		}
		
		char ch[]=new char[26];
		for(int i=0;i<s.length();i++) {
			ch[s.charAt(i)-'a']++;
			ch[t.charAt(i)-'a']--;
		}
		
		for(int i:ch) {
			if(i!=0) {
				return false;
			}
		}
		return true;
	}
}
