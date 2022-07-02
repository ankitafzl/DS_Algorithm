package Matrix;
import java.util.*;
public class Leetcode_Maximum_Area_of_a_Piece_of_Cake_After_Horizontal_and_Vertical_Cuts {

	public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
       Arrays.sort(verticalCuts);
       int n=horizontalCuts.length;
       int max_h=Math.max(horizontalCuts[0]-0,h-horizontalCuts[n-1]);
       
       for(int i=1;i<n;i++){
           int hor_width=horizontalCuts[i]-horizontalCuts[i-1];
           max_h=Math.max(max_h,hor_width);
       }
       
       int m=verticalCuts.length;
       int max_w=Math.max(verticalCuts[0]-0,w-verticalCuts[m-1]);
       for(int i=1;i<m;i++){
           int ver_width=verticalCuts[i]-verticalCuts[i-1];
           max_w=Math.max(max_w,ver_width);
       }
       
       long ans=1L*max_h*max_w;
       return (int) (ans%1000000007);
   }
 
}
