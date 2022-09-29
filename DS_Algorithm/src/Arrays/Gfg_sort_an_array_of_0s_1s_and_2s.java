package Arrays;

public class Gfg_sort_an_array_of_0s_1s_and_2s {
	public static void sort012(int a[], int n)
    {
        // code here 
        //Arrays.sort(a);
        int low=0;
        int high=n-1;
        int mid=0;
        int temp;
        while(mid<=high){
            switch(a[mid]){
                case 0: {
                    temp=a[low];
                    a[low]=a[mid];
                    a[mid]=temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                
                case 2:{
                    temp=a[mid];
                    a[mid]=a[high];
                    a[high]=temp;
                    high--;
                    break;
                }
            }
        }
    }
}
