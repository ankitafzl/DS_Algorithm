package Maths;

public class Leetcode_Number_of_Provinces {
	public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int visited[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(visited[i]==0){
                solve(isConnected,visited,i);
                count++;
            }
        }
        return count;
    }
    
    public void solve(int[][] isConnected,int []visited,int i){
        int n=isConnected.length;
        for(int j=0;j<n;j++){
            if(isConnected[i][j]==1 && visited[j]==0){
                visited[j]=1;
                solve(isConnected,visited,j);
            }
        }
    }
}
