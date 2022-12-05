package String;

public class Gfg_Alternate_Vowel_and_Consonant_String {
	private static final int[] vowel = new int[]{0,'e'-'a','i'-'a','o'-'a','u'-'a'};
    public String rearrange(String S, int N){
        int[] freq = new int[26];
        int count_vowel=0;
        for(int i=0;i<N;i++) {
            char ch = S.charAt(i);
            for(int idx : vowel) {
                if(idx==ch-'a') {
                    count_vowel++;
                    break;
                }
            }
            freq[ch-'a']++;
        }
        
        int count_non_vowel = N-count_vowel;
        if(!(count_non_vowel==count_vowel || count_non_vowel==count_vowel+1 || count_non_vowel+1==count_vowel)){
             return "-1";
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++) {
            if(i%2==0) {
                if(count_non_vowel==count_vowel || count_non_vowel+1==count_vowel) {
                    // vowel
                    add_vowel(freq,sb);
                } else {
                    // non_vowel
                    add_non_vowel(freq,sb);
                }
            } else {
                if(count_non_vowel==count_vowel || count_non_vowel+1==count_vowel) {
                    // non_vowel
                    add_non_vowel(freq,sb);
                } else {
                    // vowel
                    add_vowel(freq,sb);
                }
            }
        }
        return sb.toString();
    }
    
    public static void add_vowel(int[] freq,StringBuilder sb) {
        for(int idx : vowel) {
            if(freq[idx]>0) {
                freq[idx]--;
                sb.append(Character.toString((char)(idx+'a')));
                return;
            }
        }
    }
    
    public static void add_non_vowel(int[] freq,StringBuilder sb) {
        for(int i=0;i<26;i++) {
            if(freq[i]<=0) continue;
            boolean is_Vowel=false;
            for(int idx : vowel) {
                if(i==idx) {
                    is_Vowel=true;
                }
            }
            if(!is_Vowel) {
                freq[i]--;
                sb.append(Character.toString((char)(i+'a')));
                return;
            }
        }
    }
}
