package practise20160913;

import java.util.Scanner;

/**
 * @author xiangbo
 * 2016-09-13
 * 344. Reverse String
 */
public class Soultion344 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(new Solution_1().reverseString(str));
		s.close();
	}

}

class Solution_1 {
	public String reverseString(String s){
		if(s == null){
			return null;
		}else{
			StringBuffer sb = new StringBuffer();
			for(int i = s.length() - 1; i >=0 ; i--){
				sb.append(s.charAt(i));
			}
			return sb.toString();
		}
	}
}