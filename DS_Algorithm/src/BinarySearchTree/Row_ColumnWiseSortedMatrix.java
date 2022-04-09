package BinarySearchTree;

public class Row_ColumnWiseSortedMatrix {
	
	public void searchGivenKey(int matrix[][],int n,int x){
		int i=0;
		int j=n-1;
		while(i<n && j>=0)
		{
			if(matrix[i][j]==x){
				System.out.print("x find at - "+i+" , "+j);
				return;
			}
			if(matrix[i][j]>x)
				j--;
			else
				i++;
		}	
		System.out.print("not found");
	}
	
     public static void main(String []args){
    	 int matrix[][]={{10,20,30,40},
    			         {15,25,35,45},
    			         {27,29,37,48},
    			         {32,33,39,51}};
    	 
    	 Row_ColumnWiseSortedMatrix bst=new Row_ColumnWiseSortedMatrix();
    	 bst.searchGivenKey(matrix,matrix.length,32);
     }
}
