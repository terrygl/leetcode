package com.leetcode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AddTwoNumbersTest {
    AddTwoNumbers list = new AddTwoNumbers();
    ListNode testList1 = null;
    ListNode testList2 = null;
    ListNode testList = null;

    @Test
    public void testAddTwoNumbers() throws Exception {
        testList = list.addTwoNumbers(testList1,testList2);
    }

//    @Test
//    public void testAddTowNumbersRecur() throws Exception {
//
//    }

    @Before
    public void testCreateLists() throws  Exception{
        testList1 = ListNode.createLists(3,9);
        testList2 = ListNode.createLists(2,9);


        ListNode.printListsAscend(testList1);
        System.out.println("--");
        ListNode.printListsAscend(testList2);
        System.out.println("--");
    }
    @After
    public void printList() throws  Exception{

        ListNode.printListsAscend(testList);
    }
}