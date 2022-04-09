package Arrays;

public class ArraysAddNdUpdate {
	public void printArray(int[]arr){
		int n=arr.length;
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public void arrayDemo(){
		int myArray[]=new int[5]; //default values //0 1 2 3 4 5
		//printArray(myArray);
		
		myArray[0]=5;
		myArray[1]=1;
		myArray[2]=8;
		myArray[3]=4;
		myArray[4]=2;
		printArray(myArray);
		
		myArray[2]=9;
		myArray[4]=7;
		printArray(myArray);
		System.out.println(myArray.length);
		System.out.println(myArray[myArray.length-1]);
		
		int []arr1={3,4,5};
		printArray(arr1);
		
	}
	
        public static void main(String []args){
        	ArraysAddNdUpdate aad=new ArraysAddNdUpdate();
        	aad.arrayDemo();
        }
}
