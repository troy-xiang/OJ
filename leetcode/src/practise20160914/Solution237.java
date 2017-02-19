package practise20160914;
/** 
 * @author Troy 
 * @date 2016��9��14�� ����10:09:24 
 * @version 1.0 
 * @category	237. Delete Node in a Linked List
 * @parameter  
 * @since  
 * @return  
 */
public class Solution237 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class ListNode {
	int val;
	ListNode next;
	public ListNode(int x) {
		this.val = x;
	}
}

class Solution_3 {
	public void deleteNode(ListNode node) {
		//ɾ�������Ľڵ㣬ֻ�轫��ǰ�ڵ�����Ը�Ϊ��ǰ�ڵ����һ���ڵ�����ԣ���ֵ����ָ��
		//��������һ���ڵ㣬��������ɾ����ǰ�ڵ㣬ʵ���������ٵ���һ���ڵ���ڴ�
		// 1ms 
		ListNode temp = node.next;
		node.val = temp.val;
		node.next = temp.next;
		temp = null;
	}
}
