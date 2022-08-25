package String;

public class LeetCode_Ransom_Note {
	public boolean canConstruct(String ransomNote, String magazine) {
        int temp[]=new int[26];
        for(char ch: magazine.toCharArray()){
            temp[ch-'a']++;
        }
        
        for(char ch:ransomNote.toCharArray()){
            if(temp[ch-'a']==0){
                return false;
            }
            temp[ch-'a']--;
        }
        return true;
    }
}
