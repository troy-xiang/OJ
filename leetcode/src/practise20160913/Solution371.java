package practise20160913;

import java.util.Scanner;

/**
 * @author xiangbo
 * 2016-09-13
 * 371. Sum of Two Integers
 */
public class Solution371 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(new Solution_3().getSum(a, b));
		s.close();
	}

}

class Solution_3 {
	public int getSum(int a, int b) {
		int x = a & b;
		int y = a ^ b;
		if(x == 0){
			return y;
		}else{
			return getSum(y, x << 1);
		}
	}
}