package practise20160918;

import java.util.Scanner;

/** 
 * @author Troy 
 * @date 2016��9��18�� ����8:43:36 
 * @version 1.0 
 * @category 242. Valid Anagram
 * @parameter  
 * @since  
 * @return  
 */
public class Solution242 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		System.out.println(new Solution_2().isAnagram(s, t));
		sc.close();
	}

}

class Solution_2 {
	public boolean isAnagram(String s, String t) {
		//����ⷨ�����s�е��ַ����������t�е��ַ�Ҳ�����������ôҲ�᷵��true
		/*if(s.length() != t.length()){
			return false;
		}
		int[] count = new int[128];
		return false;
		char x = 'a';
		for(int i = 0; i < s.length(); i++){
			x ^= s.charAt(i);
			x ^= t.charAt(i);
		}
		if(x == 'a') {
			return true;
		}else {
			return false;
		}*/
		
		//����ⷨ������˵ad��bc���������ַ���Ԫ����ӵ�ֵҲ��ͬ
		/*if(s.length() != t.length()) {
			return false;
		}
		int num = 0;
		for(int i = 0; i < s.length(); i++) {
			num = num + s.charAt(i) - t.charAt(i);
		}
		return num == 0 ? true : false;*/
		
		
		//Ŀ�ľ����ж������ַ����к��е���ĸ�Ƿ���ͬ����ĸ���ͺ�������
		//��ĸ�����Ƚϣ����������洢��ĸ����
		// 6ms
		if(s.length() != t.length()){
			return false;
		}
		int[] count = new int[26];
		for(int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++; 
		}
		for(int i = 0; i < t.length(); i++) {
			if(--count[t.charAt(i)- 'a'] < 0) {
				return false;
			}
		}
		for(int x : count) {
			if(x != 0){
				return false;
			}
		}
		return true;
	}
}
