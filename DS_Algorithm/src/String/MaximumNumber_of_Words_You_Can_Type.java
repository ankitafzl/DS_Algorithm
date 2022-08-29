package String;

public class MaximumNumber_of_Words_You_Can_Type {
	public int canBeTypedWords(String text, String brokenLetters) {
        int ans=0;
        int n=brokenLetters.length();
        String[] str=text.split(" ");
        int broken_word=0;
        for(String word:str){
            broken_word=0;
            for(int i=0;i<n;i++){
                if(word.indexOf(String.valueOf(brokenLetters.charAt(i)))>-1){
                    broken_word=1;
                    break;
                }
            }
            if(broken_word==0){
                ans++;
            }
        }
        return ans;
    }
}
