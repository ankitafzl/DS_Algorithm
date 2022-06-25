package String;
import java.util.*;
public class Letter_Tile_Possibilities {
	public int numTilePossibilities(String tiles) {
        HashSet<String> set=new HashSet<>();
        boolean v[]=new boolean[tiles.length()];
        dfs(set,v,tiles,new StringBuilder());
        return set.size()-1;
    }
    
    public void dfs(HashSet<String> set,boolean[] v,String tiles,StringBuilder sb){
        set.add(sb.toString());
        for(int i=0;i<tiles.length();i++){
            if(!v[i]){
                v[i]=true;
                sb.append(tiles.charAt(i));
                dfs(set,v,tiles,sb);
                v[i]=false;
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}
