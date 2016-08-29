package com.leetcode;

/**
 * Created by geliang on 16/8/26.
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    public static  void printListsDescend(ListNode node){
        if(node==null) {
            return;
        }
        printListsDescend(node.next);
        System.out.println(node.val);
    }
    public static  void printListsAscend(ListNode node){
        if(node==null){
            return;
        }
        System.out.println(node.val);
        printListsAscend(node.next);
    }

    public static ListNode createLists(double n,double range){
        if (n==0){
            return null;
        }
        ListNode listHead = new ListNode((int)Math.ceil(range*Math.random()));
        listHead.next =createLists(n-1,range);
        return listHead;
    }
}



