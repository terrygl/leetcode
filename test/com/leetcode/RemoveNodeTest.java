package com.leetcode;

import org.junit.Before;
import org.junit.Test;

public class RemoveNodeTest {
    RemoveNode test = new RemoveNode();
    ListNode testList = null;
    @Before
    public void testCreateLists() throws  Exception{
        testList = ListNode.createLists(6,100);
    }
    @Test
    public void testRemoveNthFromEnd() throws Exception {
        ListNode.printListsAscend(test.removeNthFromEnd(testList, 2));
    }
//
//    @Test
//    public void testFindRemoveNode() throws Exception {
//
//    }
}