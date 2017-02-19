package practise20160914;

/**
 * @author xiangbo
 * 2016-09-14
 * 283. Move Zeroes
 */
public class Solution283 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}

class Solution_2 {
	public void moveZeros(int[] nums) {
		/**
		 * �ⷨһ��һ�������ж�����λ��Ч�ʺܵ� 135ms
		 */
		/*int i = 0;
		int count = 0;
		while(i < nums.length){
			if(count >= nums.length){
				break;
			}
			if(nums[i] == 0){
				for(int j = i; j < nums.length - 1; j++){
					nums[j] = nums[j + 1];
				}
				nums[nums.length - 1] = 0;
				i = 0;
				count++;
			}else{
				i++;
			}
		}*/
		/**
		 * �ⷨ��������Ϊ0�İ�˳��ŵ�ǰ�棬���油λ��ֱ��Ϊ0   0ms
		 */
		/*int j = 0;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] != 0){
				nums[j++] = nums[i];
			}
		}
		for(; j < nums.length; j++){
			nums[j] = 0;
		}*/
		
		/**
		 * �ⷨ�����ҵ���һ��0��Ȼ���ҵ������һ����Ϊ0�ģ����߽������Դ�ѭ��  1ms
		 * д���ӣ��ҹ��ɣ�������жϣ�
		 */
		int end = 0;
		int front = 0;
		while(end < nums.length && nums[end] != 0){
			end++;
		}
		front = end + 1;
		while(front < nums.length){
			if(nums[front] != 0){
				nums[end] = nums[front];
				end++;
				nums[front] = 0;
			}
			front++;
		}
	}
}
