package Arrays;

public class Calculate_Amount_Paid_in_Taxes {
	 public double calculateTax(int[][] brackets, int income) {
	        int prev=0;
	        double tax=0;
	        for(int []bracket:brackets){
	            int upper=bracket[0];
	            int precent=bracket[1];
	            if(income>upper){
	                tax+=(double) (upper-prev)*precent/100;
	                prev=upper;
	            }
	            else{
	                tax+=(double) (income-prev)*precent/100;
	                break;
	            }
	        }
	        return tax;
	    }
	
}
