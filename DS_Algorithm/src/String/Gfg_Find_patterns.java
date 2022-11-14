package String;

public class Gfg_Find_patterns {
	static int numberOfSubsequences(String S, String W){
        // code here
        int ans=0;
        boolean visited[]=new boolean[S.length()];
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)==W.charAt(0) && visited[i]==false){
                visited[i]=true;
                int j=i+1;
                int k=1;
                while(j<S.length() && k<W.length()){
                    if(S.charAt(j)==W.charAt(k) && visited[j]==false){
                        visited[j]=true;
                        k++;
                        
                    }
                    j++;
                }
                if(k==W.length()){
                    ans++;
                }
                else{
                    break;
                }
            }
        }
        return ans;
    }
}
