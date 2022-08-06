package Maths;

public class Leetcode_Poor_Pigs {
	public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int count=0;
        int total=1;
        int x=(minutesToTest/minutesToDie)+1;
        while(buckets>total){
            total=total*x;
            count++;
        }
        return count;
    }
}
