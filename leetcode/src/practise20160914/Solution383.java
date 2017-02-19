package practise20160914;

import java.util.Scanner;

/** 
 * @author Troy 
 * @date 2016��9��14�� ����11:04:06 
 * @version 1.0 
 * @category
 * @parameter  
 * @since  
 * @return  
 */
public class Solution383 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] note = new int[26];
		System.out.println(note.length);
		for(int i = 0; i < note.length; i++) {
			System.out.println(note[i]);
		}*/
		Scanner sc = new Scanner(System.in);
		String ransomNote = sc.nextLine();
		String magazine = sc.nextLine();
		System.out.println(new Solution_4().canConstruct(ransomNote, magazine));
		sc.close();
	}

}

class Solution_4 {
	public boolean canConstruct(String ransomNote, String magazine) {
		//�������û�п��Ƕ����ĸ���ڵ����
		/*for(int i = 0; i < ransomNote.length(); i++){
			if(magazine.indexOf(ransomNote.charAt(i)) == -1){
				return false;
			}
		}
		return true;*/
		/**
		 * ����һ������һ������Ϊ26��int�����飬Ȼ����������ַ�������ĸ�Դ���Ϊ������±�
		 * ransomNoteΪ�±�ļ�1
		 * magazineΪ�±ߵļ�һ
		 * ��magazine��һ����֮���Ӧ�±������Ԫ��ֵ����С��0��˵����Ԫ�ش�����ransom�У�����������magazine��
		 * 18ms
		 */
		int[] note = new int[26];		//����Ԫ��Ĭ��Ϊ0
		for(int i = 0; i < ransomNote.length(); i++) {
			note[ransomNote.charAt(i) - 'a']--;
		}
		for(int i = 0; i < magazine.length(); i++) {
			note[magazine.charAt(i) - 'a']++;
		}
		for(int i = 0; i < ransomNote.length(); i++) {
			if(note[ransomNote.charAt(i) - 'a'] < 0) {
				return false;
			}
		}
		return true;
	}
}
