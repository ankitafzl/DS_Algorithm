package String;

public class Gfg_Sum_of_Beauty_of_All_Substrings {
	public static int beautySum(String s) {
        // code here
        int n=s.length();
        int ans=0;
        for(int i=3;i<=n;i++){
            int j=0;
            int k=i;
            int freq[]=new int[26];
            for(int l=j;l<k;l++){
                freq[s.charAt(l)-'a']++;
            }
            ans+=beauty(freq);
            while(k<n){
                freq[s.charAt(k)-'a']++;
                freq[s.charAt(j)-'a']--;
                ans+=beauty(freq);
                j++;
                k++;
            }
        }
        return ans;
    }
    
    public static int beauty(int []freq){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i:freq){
            if(i!=0){
                min=Math.min(min,i);
                max=Math.max(max,i);
            }
        }
        return max-min;
    }
}
