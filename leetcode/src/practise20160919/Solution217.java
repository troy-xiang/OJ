package practise20160919;

import java.util.HashSet;
import java.util.Set;

/** 
 * @author Troy 
 * @date 2016��9��19�� ����7:41:25 
 * @version 1.0 
 * @category  217. Contains Duplicate
 * @parameter  
 * @since  
 * @return  
 */
public class Solution217 {

	public static void main(String[] args) {

	}

}

class Solution_1 {
	public boolean containsDuplicate(int[] nums) {
		//���ķ�ʽ�в�ͨ����Ϊ������ż����Ԫ��ֵΪ0����ֻ��һ��Ԫ���Ҹ�Ԫ�ص�ֵΪ0
		/*for(int i = 1; i < nums.length; i++) {
			nums[0] ^=nums[i];
		}*/
		
		//����һ��HasnMap��ÿ��Ԫ�ص�������Ч��̫��
		// 26ms
		/*Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++) {
			if(!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			}else{
				int x = map.get(nums[i]);
				x++;
				map.put(nums[i], x);
			}
		}
		for(int i = 0; i < nums.length; i++) {
			if(map.get(nums[i]) > 1) {
				return true;
			}
		}
		return false;*/
		
		//������������һ�ĸĽ���
		// 15ms
		/*Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++) {
			if(!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			}else{
				return true;
			}
		}
		return false;*/
		
		//��������������������ظ���Ԫ�أ����Ǳض�����
		// 5ms
		/*Arrays.sort(nums);
		for(int i = 0; i < nums.length - 1; i++) {
			if(nums[i] == nums[i + 1]) {
				return true;
			}
		}
		return false;*/
		
		//�����ġ�������һ�ͷ������е�HashMap����Set
		// 14ms
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < nums.length; i++) {
			if(set.contains(nums[i])) {
				return true;
			}else {
				set.add(nums[i]);
			}
		}
		return false;
	}
}
