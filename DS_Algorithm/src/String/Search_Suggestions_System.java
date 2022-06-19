package String;
import java.util.*;
public class Search_Suggestions_System {

	public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> list=new ArrayList<>();
        Arrays.sort(products);
        TreeMap<String,Integer> map=new TreeMap<>();
        List<String> pro_list=Arrays.asList(products);
        for(int i=0;i<products.length;i++){
            map.put(products[i],i);
        }
        String str="";
        for(char ch:searchWord.toCharArray()){
            str+=ch;
            String ceiling=map.ceilingKey(str);
            String floor=map.floorKey(str+"{");
            
            if(ceiling==null || floor==null){
                break;
            }
            list.add(pro_list.subList(map.get(ceiling),Math.min(map.get(ceiling)+3,map.get(floor)+1)));
        }
        while(list.size()<searchWord.length()){
            list.add(new ArrayList<>());
        }
            return list;
    }
}
