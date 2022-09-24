package String;
import java.util.*;
public class Partition_Labels {
	 public List<Integer> partitionLabels(String s) {
	        int temp[]=new int[26];
	        for(int i=0;i<s.length();i++){
	            temp[s.charAt(i)-'a']=i;
	        }
	        List<Integer> list=new ArrayList<>();
	        int st=0;
	        int end=0;
	        for(int i=0;i<s.length();i++){
	            end=Math.max(end,temp[s.charAt(i)-'a']);
	            if(i==end){
	                list.add(i-st+1);
	                st=i+1;
	            }
	        }
	        return list;
	    }
}
