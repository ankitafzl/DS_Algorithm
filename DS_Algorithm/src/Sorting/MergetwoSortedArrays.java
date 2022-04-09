package Sorting;

public class MergetwoSortedArrays {
	public int[] mergeArrays(int[] arr1,int[] arr2,int n,int m){
		int[] result=new int[n+m];
		int i=0;
		int j=0;
		int k=0;
		while(i<n && j<m){
			if(arr1[i]<arr2[j]){
				result[k]=arr1[i];
				i++;
			}
			else{
				result[k]=arr2[j];
				j++;	
			}
			k++;
		}
		while(i<n){
			result[k]=arr1[i];
			i++;
			k++;
		}
		while(j<m){
			result[k]=arr2[j];
			j++;
			k++;
		}
		return result;
	}
	
	public  void printArray(int[]arr){
		int n=arr.length;
		for(int i=0;i<n;i++){
		   System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
        public static void main(String []args){
        	int arr1[]={2,3,5,10};
        	int arr2[]={4,6,11,15};
        	MergetwoSortedArrays ms=new MergetwoSortedArrays();
        	ms.printArray(arr1);
        	ms.printArray(arr2);
        	
        	int[] result=ms.mergeArrays(arr1, arr2,arr1.length,arr2.length);
        	ms.printArray(result);
        }
}
