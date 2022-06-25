package Arrays;

public class Minimum_Cost_to_Move_Chips_to_The_Same_Position {

	public int minCostToMoveChips(int[] position) {
        int i=0;
        int j=0;
        for(int p:position){
            if(p%2==0){
                i++;
            }
            else{
                j++;
            }
        }
        return Math.min(j++,i++);
    }
}
