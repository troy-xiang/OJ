package practise20160914;

import java.util.Scanner;

/**
 * @author xiangbo 
 * 2016-09-14 389. 
 * Find the Difference
 */
public class Solution389 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		/*
		 * System.out.println("s.length: " + s.length()); System.out.println(
		 * "t.length: " + t.length());
		 */
		System.out.println(new Solution_1().findTheDifference(s, t));
		sc.close();
	}

}

class Solution_1 {
	public char findTheDifference(String s, String t) {
		/*
		 * int i; for(i = 0; i < t.length(); i++) { if(s.indexOf(t.charAt(i)) ==
		 * -1){ break; }else{ continue; } } return t.charAt(i - 1);
		 */
		/**
		 * �ⷨһ�����üӷ����������㣬������ľ����µ��ַ� 
		 * 8ms
		 */
		/*int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < s.length(); i++) {
			sum1 += s.charAt(i);
		}
		for (int i = 0; i < t.length(); i++) {
			sum2 += t.charAt(i);
		}
		return (char) (sum2 - sum1);*/
		
		/**
		 * �ⷨ����������򡣽������ַ�ƴ������Ȼ��ȫ�����������ͬ�����ʣ��0�����ʣ�¶������ 
		 * 8ms
		 */
		/*String str = s + t;
		char x = str.charAt(0);
		for(int i = 1; i < str.length();i++){
			x ^= str.charAt(i);
		}
		return x;*/
		// 9ms
		/*char x = t.charAt(0);
		for(int i = 0; i < s.length(); i++){
			x ^= s.charAt(i);
		}
		for(int i = 1; i < t.length(); i++){
			x ^= t.charAt(i);
		}
		return x;*/
		
		//7 ms
		char x = t.charAt(t.length() - 1);
		for(int i = 0; i < s.length(); i++){
			x ^= s.charAt(i);
			x ^= t.charAt(i);
		}
		return x;
	}
}
