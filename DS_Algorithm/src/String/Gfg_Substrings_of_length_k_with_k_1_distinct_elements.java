package String;

public class Gfg_Substrings_of_length_k_with_k_1_distinct_elements {
	static int countOfSubstrings(String S, int K) {
        // code here
        int []freq=new int[26];
        for(int i=0;i<K;i++){
            freq[S.charAt(i)-'a']++;
        }
        
        int i=0;
        int j=K;
        int distinct_char=0;
        int ans=0;
        for(int x:freq){
            if(x>0){
                distinct_char++;
            }
        }
        while(j<=S.length()){
            if(distinct_char==K-1){
                ans++;
            }
            if(j==S.length()){
                break;
            }
            freq[S.charAt(i)-'a']--;
            if(freq[S.charAt(i)-'a']==0){
                distinct_char--;
            }
            freq[S.charAt(j)-'a']++;
            if(freq[S.charAt(j)-'a']==1){
                distinct_char++;
            }
            i++;
            j++;
        }
        return ans;
    }
}
