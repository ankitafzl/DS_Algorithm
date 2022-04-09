package Arrays;

public class ResizeArray {
	public void printArray(int[]arr){
		int n=arr.length;
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	// first method
	public void resize(int []arr,int capacity){
		int []temp=new int[capacity];
		for(int i=0;i<arr.length;i++){
			temp[i]=arr[i];
		}
		arr=temp;
	}
	
	// second method
	public int[] resizeArr(int []arr,int capacity){
		int []temp=new int[capacity];
		for(int i=0;i<arr.length;i++){
			temp[i]=arr[i];
		}
		arr=temp;
		return arr;
	}
	
    public static void main(String []args){
        	ResizeArray ra=new ResizeArray();
        	//aad.printArray(new int []{3,8,5,9,4});
        	int[] original=new int []{3,8,5,9,4};
        	System.out.print("The size of original array is = "+original.length);
        	
        	System.out.println();
        	ra.resize(original,10);
        	System.out.print("The size of original array  is after resize = "+original.length);
        	
        	System.out.println();
        	original=ra.resizeArr(original,10);
        	System.out.print("The size of original array  is after resize = "+original.length);
    }
}
