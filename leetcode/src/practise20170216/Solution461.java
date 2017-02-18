package practise20170216;

/**
 * @author troy
 * Hamming Distance
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 *
 * 异或运算后计算结果中1的个数
 */
public class Solution461 {
	public int hammingDistance(int x, int y) {
		int count = 0;
		int z = x ^ y;
		while(z != 0) {
			/*if(z % 2 == 1) {
				count++;
			}*/
			z &= (z - 1);
			z = z >> 1;
		}
		return count;
		//return Integer.bitCount(x ^ y);
	}
}
