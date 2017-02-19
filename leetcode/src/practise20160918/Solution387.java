package practise20160918;

import java.util.Scanner;

/** 
 * @author Troy 
 * @date 2016��9��18�� ����9:22:25 
 * @version 1.0 
 * @category 387. First Unique Character in a String
 * @parameter  
 * @since  
 * @return  
 */
public class Solution387 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(new Solution_3().findUniqChar(s));
		sc.close();
	}

}

class Solution_3 {
	public int findUniqChar(String s) {
		//����ⷨ
		/*if(s.length() == 1) {
			return 0;
		}*/
		/*if(s == null || s.equals("")) {
			return -1;
		}
		for(int i = 0; i < s.length() - 1; i++) {
			char x = s.charAt(i);
			String str = s.substring(i + 1);
			if(str.indexOf(x) == -1){
				return i;
			}
		}
		if(s.substring(0, s.length() - 1).indexOf(s.charAt(s.length() - 1)) == -1){
			return s.length() - 1;
		}
		return -1;*/
		
		//����һ������HashMap�洢����Ԫ�صĸ�����Ч��̫��
		//139 ms
		/*if(s == null || s.equals("")) {
			return -1;
		}
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < s.length(); i++) {
			String x = s.substring(i, i + 1);
			if(map.get(x) == null) {
				map.put(x, 1);
			}else{
				int val = map.get(x);
				val++;
				map.put(x, val);
			}
		}
		for(int i = 0; i < s.length(); i++) {
			String x = s.substring(i, i + 1);
			if(map.get(x) == 1) {
				return i;
			}
		}
		return -1;*/
		
		//��������ʹ���������飬һ���洢Ԫ��������һ���洢��ӦԪ��λ��
		//��ѰԪ�ظ���Ϊ1����С�±�
		// 37ms
		int ret = -1;
		int[] count = new int[26];
		int[] loc = new int[26];
		for(int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++;
			loc[s.charAt(i) - 'a'] = i;
		}
		for(int i = 0; i < 26; i++) {
			if(count[i] == 1){
				ret = ret == -1 ? loc[i] : Math.min(ret, loc[i]);
			}
		}
		return ret;
	}
}
