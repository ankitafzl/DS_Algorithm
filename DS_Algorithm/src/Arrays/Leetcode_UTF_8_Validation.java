package Arrays;

public class Leetcode_UTF_8_Validation {
	public boolean validUtf8(int[] data) {
        int n=data.length;
        for(int i=0; i<n; i++) {
            data[i] &= 0xff;
        }
            
        for(int i=0; i<n; ) {
            if( data[i] >>> 7 == 0) {
                i++;
                continue;
            }
            if( i+1 < n && (data[i] >>> 5) == 6 && (data[i+1] >>> 6) == 2) {
                i+=2;
                continue;
            }
            if( i+2 < n && (data[i] >>> 4) == 14 && (data[i+1] >>> 6) == 2 && (data[i+2] >>> 6) == 2) {
                i+=3;
                continue;
            }
            if( i+3 < n && (data[i] >>> 3) == 0x1e && (data[i+1] >>> 6) == 2 && (data[i+2] >>> 6) == 2 && (data[i+3] >>> 6) == 2 ) {
                i+=4;
                continue;
            }
            return false;
        }
        return true;
    }
}
