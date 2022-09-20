package Maths;

public class Gfg_Maximum_number_of_2X2_squares {
	public static long numberOfSquares(long base)
    {
        //code here
        if(base==2){
            return 0;
        }
        base=base-2;
        base=base/2;
        return (base*(base+1))/2;
    }
}
