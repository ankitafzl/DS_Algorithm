package String;

public class Leetcode_Minimum_Window_Substring {
	 public String minWindow(String s, String t) {
	        int arr[]=new int[128];
	        
	        char[] ch_s=s.toCharArray();
	        char[] ch_t=t.toCharArray();
	        
	        for(char ch:ch_t){
	            arr[ch]++;
	        }
	            int left=0;
	            int right=0;
	            
	            int min=Integer.MAX_VALUE;
	            int count=0;
	            String ans="";
	            
	            while(right<ch_s.length){
	                char curr_char=ch_s[right];
	                if(--arr[curr_char]>=0){
	                    count++;
	                }
	                
	                while(count==ch_t.length){
	                    int curr_window=right-left+1;
	                    if(curr_window<min){
	                        min=curr_window;
	                        ans=s.substring(left,right+1);
	                    }
	                    char left_char=ch_s[left];
	                    if(++arr[left_char]>0){
	                        count--;
	                    }
	                    left++;
	                }
	                right++;
	            }
	        
	        return ans;
	    }
}
