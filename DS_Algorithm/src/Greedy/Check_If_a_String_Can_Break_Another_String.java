package Greedy;

public class Check_If_a_String_Can_Break_Another_String {

	public boolean checkIfCanBreak(String s1, String s2) {
        int[] temp1= new int[26];
        int[] temp2 = new int[26];
        for(int i=0; i<s1.length(); i++){
            temp1[s1.charAt(i)-'a']--;
            temp1[s2.charAt(i)-'a']++;
            temp2[s1.charAt(i)-'a']++;
            temp2[s2.charAt(i)-'a']--;
        }
        int acc1 = 0;
        int acc2 =0;
        boolean flag1 = true;
        boolean flag2 = true;
        
        for(int i=25; i>=0; i--){
            acc1 +=temp1[i];
            acc2 +=temp2[i];
            if(acc1 < 0){
                flag1 = false;
            } 
            if(acc2 < 0) {
                flag2 = false;
            }
         }
        
        return flag1 || flag2;
    }
}
