package practise20160918;
/** 
 * @author Troy 
 * @date 2016��9��18�� ����7:51:44 
 * @version 1.0 
 * @category 171. Excel Sheet Column Number
 * @parameter  
 * @since  
 * @return  
 */
public class Solution171 {

	public static void main(String[] args) {

	}

}

class Solution_1 {
	public int titleToNumber(String s) {
		//����Ľⷨ
		/*if(s.length() == 1) {
			return s.charAt(0) - 'A' + 1;
		}
		int num = 0;
		for(int i = 0; i < s.length(); i++) {
			num = num + s.charAt(i) - 'A' + 1;
		}
		return num + 25;*/
		
		//������26����ת����10����
		// 3ms
		/*int res = 0;
		for(int i = s.length(); i > 0; i--) {
			char c = s.charAt(s.length() - i);
			res = (int) (res + (c - 'A' + 1) * Math.pow(26, i - 1));
		}
		return res;*/
		
		//����26��һ�У�* ����ʾ�ǵڼ��У� + ����ʾ�ڼ���   �����һ��26ά�����飬����Ƕ������
		int res = 0;
		for(int i = 0; i < s.length(); i++) {
			res += res * 26 + s.charAt(i) - 'A' + 1;
		}
		return res;
	}
}
