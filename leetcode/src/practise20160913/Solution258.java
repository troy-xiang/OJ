package practise20160913;

import java.util.Scanner;

/**
 * @author xiangbo
 * 2016-09-13
 * 258. Add Digits
 */
public class Solution258 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		while(true) {
			int num = s.nextInt();
			System.out.println(new Solution_5().addDigits(num));
		}
	}
}

class Solution_5 {
	public int addDigits(int num) {
		return num == 0 ? 0 : (num % 9 == 0 ? 9 : num % 9);
	}
}
