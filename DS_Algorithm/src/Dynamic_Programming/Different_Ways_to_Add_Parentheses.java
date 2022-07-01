package Dynamic_Programming;
import java.util.*;
public class Different_Ways_to_Add_Parentheses {

	public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<expression.length();i++){
            char ch=expression.charAt(i);
            if(ch=='+' || ch=='-' || ch=='*'){
                String str1=expression.substring(0,i);
                String str2=expression.substring(i+1);
                List<Integer> str1_list=diffWaysToCompute(str1);
                List<Integer> str2_list=diffWaysToCompute(str2);
                for(int j:str1_list){
                    for(int k:str2_list){
                        if(ch=='-'){
                            list.add(j-k);
                        }
                        else if(ch=='+'){
                            list.add(j+k);
                        }
                        else if(ch=='*'){
                            list.add(j*k);
                        }
                    }
                }
            }
        }
        if(list.size()==0){
            list.add(Integer.valueOf(expression));
        }
        return list;
    }
}
