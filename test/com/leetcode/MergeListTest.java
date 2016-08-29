package com.leetcode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MergeListTest {
    MergeList list1 = new MergeList();
    ListNode testList = null;
    @Before
    public void testCreateLists() throws  Exception{
        testList = ListNode.createLists(4,67);
    }
    @Test
    public void testMergeTwoLists() throws Exception {
        testList = list1.sortList(testList);
    }
    @After
    public void printList() throws  Exception{
        ListNode.printListsAscend(testList);
    }
}