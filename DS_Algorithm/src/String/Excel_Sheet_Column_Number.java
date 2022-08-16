package String;

public class Excel_Sheet_Column_Number {
	public int titleToNumber(String columnTitle) {
        int ans=0;
        for(char ch:columnTitle.toCharArray()){
            int x=ch-'A'+1;
            ans=ans*26+x;
        }
        return ans;
    }
}
