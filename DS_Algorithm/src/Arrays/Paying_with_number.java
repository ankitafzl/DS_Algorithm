package Arrays;
import java.util.*;
public class Paying_with_number {
	public static void main(String[] args) {
		int input2[];
		Scanner sc = new Scanner(System.in);
		int input1=sc.nextInt();
		input2 = new int[input1];
		for(int i=0;i<input1;i++) 
			input2[i]=sc.nextInt();
		int input3=sc.nextInt();
		input2=rotateArray(input1,input2,input3);
		for(int i=0;i<input1;i++)
			System.out.print(input2[i]+" ");
		sc.close();
	}
	public static int[] rotateArray(int input1,int[] input2,int input3) {
		for(int i=0;i<input3;i++)
		{
			int arr=input2[0];
			for(int j=0;j<input1-1;j++) {
				input2[j]=input2[j+1];
			}
			input2[input1-1]=arr;
		}
		return input2;
	}
}
