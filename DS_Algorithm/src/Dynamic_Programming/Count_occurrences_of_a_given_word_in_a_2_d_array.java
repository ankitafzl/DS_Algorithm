package Dynamic_Programming;

public class Count_occurrences_of_a_given_word_in_a_2_d_array {
	public int findOccurrence(char mat[][], String target)
    {
        // Write your code here
        int ans=0;
        int m=mat.length;
        int n=mat[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans+=solve(mat,i,j,target,0);
            }
        }
        return ans;
    }
    
    int solve(char mat[][],int i,int j,String target,int idx){
        int m=mat.length;
        int n=mat[0].length;
        int occ=0;
        
        if(i<m && i>=0 && j<n && j>=0 && target.charAt(idx)==mat[i][j]){
            mat[i][j]='#';
            if(idx==target.length()-1){
                occ=1;
            }
            else{
                occ+=solve(mat,i,j-1,target,idx+1);
                occ+=solve(mat,i+1,j,target,idx+1);
                occ+=solve(mat,i-1,j,target,idx+1);
                occ+=solve(mat,i,j+1,target,idx+1);
            }
            mat[i][j]=target.charAt(idx);
        }
        return occ;
    }
}
