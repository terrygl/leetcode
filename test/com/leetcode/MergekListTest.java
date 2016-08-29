package com.leetcode;

import org.junit.Test;

public class MergekListTest {
    MergekList test = new MergekList();
    MergeList list1 = new MergeList();
    @Test
    public void testMergeKLists() throws Exception {
        ListNode l1 = list1.sortList(ListNode.createLists(6,90));
        System.out.println("--l1--");
        ListNode l2 = null;
        ListNode l3 = new ListNode(-1);
//        com.leetcode.ListNode.printListsDescend(l1);
//        System.exit(1);
//        com.leetcode.ListNode l2 = list1.sortList(com.leetcode.ListNode.createLists(2));
//        System.out.println("--l2--");
//        com.leetcode.ListNode l3 = list1.sortList(com.leetcode.ListNode.createLists(3));
//        System.out.println("--l3--");
//        com.leetcode.ListNode l4 = list1.sortList(com.leetcode.ListNode.createLists(4));
//        System.out.println("--l4--");
        ListNode[] lists = {l1, l2, l3,};
        ListNode testList = test.mergeKLists(lists);
//        while (testList != null) {
//            System.out.println(testList.val);
//            testList = testList.next;
//
//        }
        System.out.println("-- Descend --");
        ListNode.printListsDescend(testList);
        System.out.println("-- Ascend --");
        ListNode.printListsAscend(testList);
    }
}