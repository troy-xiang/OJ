package practise20160918;

import java.util.HashMap;
import java.util.Map;

/** 
 * @author Troy 
 * @date 2016��9��18�� ����10:51:12 
 * @version 1.0 
 * @category 169. Majority Element
 * @parameter  
 * @since  
 * @return  
 */
public class Solution169 {

	public static void main(String[] args) {

	}

}

class Solution_4 {
	public int majorityElement(int[] nums) {
		
		//�ⷨһ����Ԫ��ֵ�͸����浽HashMap�У�Ȼ�����HashMap��Ѱ������Ԫ�ظ�������Ҫ���Ԫ��
		// 26ms
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++) {		// 26ms
			if(map.get(nums[i]) == null) {
			//if(!map.containsKey(nums[i])) {		// 28ms
				map.put(nums[i], 1);
			}else{
				int x = map.get(nums[i]);
				x++;
				map.put(nums[i], x);
			}
		}
		for(int i = 0; i < nums.length; i++) {
			if(map.get(nums[i]) > Math.floor(nums.length / 2)){
				return nums[i];
			}
		}
		return 0;
		
		//�ⷨ����excellent��������Ȼ��ȡ�м��Ԫ��ֵ
		// 2ms
		/*if(nums.length == 1){
			return nums[0];
		}
		Arrays.sort(nums);
		return nums[nums.length / 2];*/
	}
}