package Arrays;

public class Leetcode_Maximum_Points_You_Can_Obtain_from_Cards {

	public int maxScore(int[] cardPoints, int k) {
        int sum=0;
        for(int point:cardPoints){
            sum+=point;
        }
        int res=0;
        int window=0;
        int n=cardPoints.length;
        if(n==k){
            return sum;
        }
        for(int i=0;i<n-k-1;i++){
            window+=cardPoints[i];
        }
        for(int i=n-k-1;i<n;i++){
            window+=cardPoints[i];
            res=Math.max(res,sum-window);
            window-=cardPoints[i-(n-k-1)];
        }
        return res;
    }
}
