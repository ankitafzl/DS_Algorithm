package String;
import java.util.*;
public class Leetcode_Stamping_The_Sequence {
	public int[] movesToStamp(String stamp, String target) {
        char ch1[]=stamp.toCharArray();
        char ch2[]=target.toCharArray();
        boolean v[]=new boolean[ch2.length];
        List<Integer> ans=new ArrayList<>();
        int count=0;
        
        while(count!=ch2.length){
            boolean x=false;
            for(int i=0;i<=ch2.length-ch1.length;i++){
                if(!v[i]&&can_replace(ch2,i,ch1)){
                    count=replace(ch2,i,ch1.length,count);
                    v[i]=true;
                    x=true;
                    ans.add(i);
                    if(count==ch2.length){
                        break;
                    }
                }
            }
            if(x==false){
                return new int[0];
            }
        }
        
        int ans1[]=new int[ans.size()];
        int k=0;
        for(int i=ans.size()-1;i>=0;i--){
            ans1[k++]=ans.get(i);
        }
        return ans1;
    }
    
    boolean can_replace(char []ch2,int pos,char ch1[]){
        for(int i=0;i<ch1.length;i++){
            if(ch2[i+pos]!='?'&& ch2[i+pos]!=ch1[i]){
                return false;
            }
        }
        return true;
    }
    
    int replace(char []ch2,int pos,int n,int count){
        for(int i=0;i<n;i++){
            if(ch2[i+pos]!='?'){
                ch2[i+pos]='?';
                count++;
            }
        }
        return count;
    }
}
