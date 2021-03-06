package String;

public class Wipro {

	public static void main(String []args) {
		String str="1w2i3p4r5o6";
		System.out.println(findCharsOrDigitSum(str,str.length()));
	}
	
   public static String findCharsOrDigitSum(String input1, int input2){
        
        
        if(input1.length() == 0){
            return "NULL";
        }else if(input2 == 0){
            
            int flag = 0;
            int sum = 0;
            
            for(int i = 0;i<input1.length();i++){
                if(isaNumber(input1.charAt(i))){
                    flag = 1;
                    sum+= Integer.parseInt(input1.charAt(i)+"");
                }
            }
            
            if(flag == 0){
                return "ZERO";
            }else{
                return sum+"";
            }
            
        }else if(input2 == 1){
            
            String result = "";
            
            for(int i = 0;i<input1.length();i++){
                if(!isaNumber(input1.charAt(i))){
                    result += input1.charAt(i);
                }
            }

            if(result.length() == 0){
                return "ZERO";
            }else{
                return result;
            }
            
        }
        
        return "";
        
    }
    
    
    public static boolean isaNumber(char c){
        char[] carr = {'0','1','2','3','4','5','6','7','8','9'};
        
        for(int i = 0; i<carr.length;i++){
            if(carr[i] == c){
                return true;
            }
        }
        
        return false;
    }
}
