package practise20160919;

import java.util.ArrayList;
import java.util.Arrays;

/** 
 * @author Troy 
 * @date 2016��9��19�� ����8:32:32 
 * @version 1.0 
 * @category 350. Intersection of Two Arrays II
 * @parameter  
 * @since  
 * @return  
 */
public class Solution350 {

	public static void main(String[] args) {

	}

}

class Solution_2 {
	public int[] intersect(int[] nums1, int[] nums2) {
		
		/**
		 * ������������ĳ��ȷֱ�ֵ���µ����飨�ɸ��ݳ�������
		 * �������������
		 * �趨�����±����������ǰ�±��ӦԪ����ȣ�����ӵ�һ��ArrayList��
		 * ����ǰ�±�Ԫ�ز��ȣ������Ӧ���±���мӴ���
		 * ���õ���ArrayListת�������鷵��
		 */
		//ֻ�ܰ����Ƚϣ�����ֱ�ӽ����е�һ�������е�Ԫ�ؿ��Ƿ�����һ�������У�
		//��Ϊ��ĿҪ��Ԫ�س��ֵĴ���Ҫһ��
		// 4ms
		/*if(nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
			return new int[0];
		}
		int[] longer = nums1;
		int[] shorter = nums2;
		if(nums1.length < nums2.length) {
			shorter = nums1;
			longer = nums2;
		}
		
		Arrays.sort(shorter);
		Arrays.sort(longer);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int p=0,q=0;
		while(p < shorter.length && q < longer.length) {
			if(shorter[p] == longer[q]) {
				arr.add(shorter[p++]);
				q++;
			}else if(shorter[p] < longer[q]){
				p++;
			}else{
				q++;
			}
		}
		
		int[] res = new int[arr.size()];
		for(int i = 0; i < arr.size(); i++) {
			res[i] = arr.get(i);
		}
		
		return res;*/
		
		//������������һ�ĸĽ������������µ���������ʾ������Ͷ�����
		/*if(nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
			return new int[0];
		}
		int l1 = nums1.length;
		int l2 = nums2.length;
		
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int p=0,q=0;
		while(p < l1 && q < l2) {
			if(nums1[p] == nums2[q]) {
				arr.add(nums1[p++]);
				q++;
			}else if(nums1[p] < nums2[q]){
				p++;
			}else{
				q++;
			}
		}
		
		int[] res = new int[arr.size()];
		for(int i = 0; i < arr.size(); i++) {
			res[i] = arr.get(i);
		}
		
		return res;*/
		
		//���������ڷ������Ļ����ϼ����ж������Ƿ�����
		//�˷���������������������
		// 3ms
		if(nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
			return new int[0];
		}
		int l1 = nums1.length;
		int l2 = nums2.length;
		
		//�ж������Ƿ����������룬������
		for(int i = 0; i < nums1.length - 1; i++) {
			if(nums1[i] > nums1[i + 1]) {
				Arrays.sort(nums1);
				break;
			}
		}
		
		for(int i = 0; i < nums2.length - 1; i++) {
			if(nums2[i] > nums2[i + 1]) {
				Arrays.sort(nums2);
				break;
			}
		}
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int p=0,q=0;
		while(p < l1 && q < l2) {
			if(nums1[p] == nums2[q]) {
				arr.add(nums1[p++]);
				q++;
			}else if(nums1[p] < nums2[q]){
				p++;
			}else{
				q++;
			}
		}
		
		int[] res = new int[arr.size()];
		for(int i = 0; i < arr.size(); i++) {
			res[i] = arr.get(i);
		}
		
		return res;
	}
}

