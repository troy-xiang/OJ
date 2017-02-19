package practise20160913;

import java.util.Scanner;

/**
 * @author xiangbo
 * 2016-09-13
 * 292. Nim Game
 */
public class Solution292 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(new Solution_2().canWinNim(n));
		s.close();
	}
}

//���࿴����ͷ�Ծ������ݶ��û�����ʱ�����μ��㼸��������Ȼ������ҵ�����
class Solution_2 {
	public boolean canWinNim(int n) {
		if(n <= 0){
			return false;
		}
		if(n % 4 != 0){
			return true;
		}else{
			return false;
		}
	}
}