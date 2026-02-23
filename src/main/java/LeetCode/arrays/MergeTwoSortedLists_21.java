package LeetCode.arrays;

import java.util.Arrays;

public class MergeTwoSortedLists_21 {

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		Arrays.asList(list1).forEach(node -> {
			System.out.println(node.val);
			node = node.next;
		});
		return null;
	}

	public static void main(String[] args) {
		ListNode node3 = new ListNode(4, null);
		ListNode node2 = new ListNode(2, node3);
		ListNode node1 = new ListNode(1, node2);

		MergeTwoSortedLists_21 lists_21 = new MergeTwoSortedLists_21();
		lists_21.mergeTwoLists(node1, null);

	}
}
