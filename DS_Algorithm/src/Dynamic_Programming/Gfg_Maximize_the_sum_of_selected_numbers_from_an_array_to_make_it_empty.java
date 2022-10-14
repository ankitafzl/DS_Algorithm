package Dynamic_Programming;

public class Gfg_Maximize_the_sum_of_selected_numbers_from_an_array_to_make_it_empty {
	public static int maximizeSum (int arr[], int n) {
        //Complete the function
        
        int temp[]=new int[100001];
        for(int i:arr){
            temp[i]++;
        }
        int sum=0;
        for(int i=n-1;i>=0;i--){
            int curr=arr[i];
            if(temp[curr]!=0){
                sum+=curr;
                temp[curr]--;
                if(temp[curr-1]!=0){
                    temp[curr-1]--;
                }
            }
        }
        return sum;
    }
    
}
