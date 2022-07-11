package Arrays;

public class Count_and_Say {
	public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        
        String x = countAndSay(n - 1);
        StringBuffer sb = new StringBuffer();
        int i = 0;
        int count = 1;
        while ((i + 1) < x.length()) {
            char ch = x.charAt(i);
            i++;
            if (ch == x.charAt(i)) {
                count++;
            } else {
                sb.append(count);
                sb.append(ch);
                count = 1;
            }
        }
        sb.append(count);
        sb.append(x.charAt(x.length() - 1));
        return sb.toString();
    }
}
