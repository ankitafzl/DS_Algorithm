package String;

public class Leetcode_Satisfiability_of_Equality_Equations {
	public boolean equationsPossible(String[] equations) {
        UnionFind u = new  UnionFind(26);
        
        for(int i=0; i<equations.length; i++){
            if(equations[i].charAt(1) == '='){
                u.union(equations[i].charAt(0) - 'a', equations[i].charAt(3) - 'a');
            }
        }
        
        for(int i=0; i<equations.length; i++){
            if(equations[i].charAt(1) == '!'){
                int g1 = u.find(equations[i].charAt(0) - 'a');
                int g2 = u.find(equations[i].charAt(3) - 'a');
                if(g1 == g2){
                    return false;
                }
            }
        }
        
        return true;
    }
    
}

class UnionFind{
    private int[] parents;
    private int temp;
    
    public UnionFind(int n){
        parents = new int[n]; 
        for(int i=0; i<n; i++){
            parents[i] = i; 
        }
        temp = n;
    }
    
    public int find(int x){
        if(parents[x] == x){
            return x;
        }
        return find(parents[x]);
    }
    
    public void union(int a, int b){
        int groupA = find(a);
        int groupB = find(b);
        
        if(groupA != groupB){
            parents[groupA] = groupB; 
            temp--; 
        }
    }
}
