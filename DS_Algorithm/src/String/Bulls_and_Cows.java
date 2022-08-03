package String;

public class Bulls_and_Cows {
	 public String getHint(String secret, String guess) {
	        int bulls = 0;
	        int cows = 0;
	        int[] num = new int[10];
	        for (int i = 0; i<secret.length(); i++) {
	              int x = Character.getNumericValue(secret.charAt(i));
	              int y = Character.getNumericValue(guess.charAt(i));
	              if (x == y) {
	                  bulls++;
	              }
	              else {
	                  if (num[x] < 0) {
	                      cows++;
	                  }
	                  if (num[y] > 0) {
	                      cows++;
	                  }
	                   num[x] ++;
	                   num[y] --;
	              }
	        }
	         return bulls + "A" + cows + "B";     
	    }
}
