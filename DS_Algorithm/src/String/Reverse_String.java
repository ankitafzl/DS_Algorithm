package String;

public class Reverse_String {
//        char revrseString(char input) {
//           char[] s = input.split(" ");
//
//	          String add = "";
//
//	         for (int i = 0; i < s.length; i++) {
//
//		           for (int j = s[i].length() - 1; j >= 0; j--) {
//
//			           add += s[i].charAt(j);
//                   }
//		       add += " ";	
//	}     
	         static int getInvCount(int n,int arr[])
	         {
	             int count = 0;
	             for (int i = 0; i < n - 1; i++)
	                 for (int j = i + 1; j < n; j++)
	                     if (arr[i] > arr[j])
	                         count++;
	       
	             return count;
	         }

        public static void main(String[] args) {
    		// TODO Auto-generated method stub
            int arr[]={ 1, 20, 6, 4, 5 };
        	System.out.println("Number of inversions are " + getInvCount(arr.length,arr));

    	}


}
