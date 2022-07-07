package Maths;

public class Complex_Number_Multiplication {
	 public String complexNumberMultiply(String num1, String num2) {
	        int count_Real;
	        int count_Imagine;
	        int[] arr1 = new int[2];
	        int[] arr2 = new int[2];

	        arr1[0] = Integer.parseInt(num1.substring(0, num1.indexOf("+")));
	        arr1[1] = Integer.parseInt(num1.substring(num1.indexOf("+") + 1, num1.length() - 1));

	        arr2[0] = Integer.parseInt(num2.substring(0, num2.indexOf("+")));
	        arr2[1] = Integer.parseInt(num2.substring(num2.indexOf("+") + 1, num2.length() - 1));

	        count_Real = arr1[0] * arr2[0] - arr1[1] * arr2[1];
	        count_Imagine = arr1[0] * arr2[1] + arr1[1] * arr2[0];

	        return count_Real + "+" + count_Imagine + "i";
	    }
}
