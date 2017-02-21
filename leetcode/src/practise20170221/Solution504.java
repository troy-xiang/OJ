package practise20170221;

/**
 * Created by Troy on 2017/2/21.
 * 504. Base 7
 * Given an intger, return its base 7 string representation
 */
public class Solution504 {
    public String convertToBase7(int num) {
        /*if(num == 0) {
            return "0";
        }
        StringBuffer sb = new StringBuffer("");
        int temp = Math.abs(num);
        while(temp !=0) {
            sb.append(temp % 7);
            temp /= 7;
        }
        if(num < 0) {
            sb.append("-");
        }
        return sb.reverse().toString();*/
        //return Integer.toString(num, 7);
        if(num == 0) {
            return "0";
        }
        boolean isNeg = false;
        if(num < 0) {
            isNeg = true;
            num = -num;
        }
        StringBuilder stringBuilder = new StringBuilder("");
        while(num != 0) {
            stringBuilder.append(num % 7);
            num /= 7;
        }
        if(isNeg == true){
            stringBuilder.append("-");
        }
        return stringBuilder.reverse().toString();
    }
}
