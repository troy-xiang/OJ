package practise20170216;

/**
 * Number Complement
 * Given a positive integer, output its complement number. 
 * The complement strategy is to flip the bits of its binary representation.
 * @author troy
 *
 * 思路： 得到一个与所给整数二进制从第一个非0开始登场的所有位数为1的数，与所给整数相异或即可求出与所给数字相反的数
 */
public class Solution476 {
	public int findComplement(int num) {
		/*int ref = 1, temp = num;
		while(temp != 0) {
			ref <<= 1;	//左移一位
			temp >>= 1;	//右移一位
		}
		return num ^ (ref - 1);*/
		String ref = Integer.toBinaryString(num);
		StringBuffer sb = new StringBuffer("");
		int count = 0;
		for(int i = 0; i < ref.length(); i++) {
			if(ref.charAt(i) != '0') {
				count = i;
				break;
			}
		}
		for(int i = count; i < ref.length(); i++) {
			sb.append((1 ^ Integer.parseInt(String.valueOf(ref.charAt(i)))));
		}
		return Integer.parseInt(sb.toString(), 2);
	}
}
