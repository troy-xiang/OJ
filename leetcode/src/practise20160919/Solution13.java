package practise20160919;

import java.util.Scanner;

/** 
 * @author Troy 
 * @date 2016��9��19�� ����9:55:01 
 * @version 1.0 
 * @category 13. Roman to Integer
 * @parameter  
 * @since  
 * @return  
 */
public class Solution13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(new Solution_3().romanToInt(s));
		sc.close();
	}

}

class Solution_3 {
	public int romanToInt(String s) {
		/**
		 * ����Ҫ���˽�һ���������ֱ�ʾ���������ַ���7����I��V��X��L��C��D��M���ֱ��ʾ1��5��10��50��100��500��1000��
		 * �ڹ������ֵ�ʱ�������й���
		 * 1����ͬ��������д������ʾ����������Щ������ӵõ��������磺�� = 3��
		 * 2��С�������ڴ�����ֵ��ұߣ�����ʾ����������Щ������ӵõ������� �磺�� = 8���� = 12��
		 * 3��С�����֣������ڢ�X ��C���ڴ�����ֵ���ߣ�����ʾ�������ڴ�����С���õ��������磺��= 4����= 9��
		 * 4������ʹ��ʱ����д�������ظ����ó������Ρ�
		 */
		// 3999tests  98ms
		/*Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int result = map.get(s.charAt(0));
		int prev = result;
		for(int i = 1; i < s.length(); i++) {
			int curr = map.get(s.charAt(i));
			if(prev >= curr) {
				result += curr;
			}else {
				result = result + curr - prev * 2;	//������Ҫ��ȥ��������Ϊ֮ǰ�Ѿ����ϱ����ˣ�������Ҫ��ȥ����
			}
			prev = curr;
		}
		return result;*/
		
		//ʵ���Ͼ��ǰ�HashMap������switch�����ƥ��
		// 91ms
		int result = 0;
		int prev = result;
		int curr = 0;
		for(int i = 0; i < s.length(); i++) {
			switch(s.charAt(i)) {
			case 'I':
				curr = 1;
				break;
			case 'V':
				curr = 5;
				break;
			case 'X':
				curr = 10;
				break;
			case 'L':
				curr = 50;
				break;
			case 'C':
				curr = 100;
				break;
			case 'D':
				curr = 500;
				break;
			case 'M':
				curr = 1000;
				break;
			default:
				break;
			}
			if(prev >= curr || i == 0) {
				result += curr;
			}else {
				result = result + curr - 2 * prev;
			}
			prev = curr;
		}
		return result;
		
		/*int i = 0, ans = 0, x;
        int len = s.length();
        s = s + "$"; // avoid s.substring(i, i+2) out of index
        while (i < len) {
            if ((x = r2i(s.substring(i, i+2))) != 0) {
                ans += x;
                i += 2;
            } else {
                ans += r2i(s.substring(i, i+1));
                i += 1;
            }
        }
        return ans;
    	}
    
	    int r2i(String s) {
	    switch (s) {
	        case "M":
	            return 1000;
	        case "CM":
	            return 900;
	        case "D":
	            return 500;
	        case "CD":
	            return 400;
	        case "C":
	            return 100;
	        case "XC":
	            return 90;
	        case "L":
	            return 50;
	        case "XL":
	            return 40;
	        case "X":
	            return 10;
	        case "IX":
	            return 9;
	        case "V":
	            return 5;
	        case "IV":
	            return 4;
	        case "I":
	            return 1;
	        default:
	            return 0;
	    }*/
	}
}
