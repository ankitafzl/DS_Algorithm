package String;

public class Gfg_Balanced_string {
	static String BalancedString(int N) {
        // code here
        StringBuilder ans = new StringBuilder();
        StringBuilder allCh = new StringBuilder();
        for(int i=0; i<26;i++)
        {
            allCh.append((char)('a'+i));
        }

        int allChTimes = N/26;
        int r = N%26;        
        while(allChTimes-->0)
        {
            ans.append(allCh);
        } 
        if(N%2==0)
        {
            for(int i=0; i<r/2; i++) 
            ans.append((char)('a'+i));

            for(int i=26-r/2 ;i<26; i++)
             ans.append((char)('a'+i));
        }
        else
        {
            int sod =0; int t=N;
            while(t>0)
            {
                sod += t%10; t/=10;
            }
            if(sod%2==0)
            {
                for(int i=0; i<(r+1)/2; i++) 
                ans.append((char)('a'+i));

                for(int i=26-(r-1)/2 ;i<26; i++)
                 ans.append((char)('a'+i));
            }
            else //sod is odd
            {
                for(int i=0; i<(r-1)/2; i++) 
                ans.append((char)('a'+i));

                for(int i=26-(r+1)/2 ;i<26; i++)
                 ans.append((char)('a'+i));

            }
        }
        return ans.toString();
    }
}
