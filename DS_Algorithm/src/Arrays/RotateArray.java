package Arrays;

public class RotateArray {
	public static void main(String []args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
 	   leftRotate(arr,arr.length,2);
 	   for(int ele:arr) {
 		   System.out.print(ele+" ");
 	   }
    }
    public static void leftRotate(int[] arr, int n, int d) {
        // code here
        if(d==0){
            return;
        }
        d=d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    
    public static void reverse(int arr[],int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }

}
