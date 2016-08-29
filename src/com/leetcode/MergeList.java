package com.leetcode;

/**
 * Created by geliang on 16/8/26.
 * 148 sortlist
 */


public class MergeList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l1Head = l1;
        ListNode l2Head = l2;

        ListNode head = null;
        ListNode current = head;
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
//      循环比较大小，l1和l2都不为空
        while(l1Head!=null&&l2Head!=null){
            //确定要移动的头
            if(l1Head.val<=l2Head.val) {
//               1current head 的初始化很重要
//                2，未实例化的变量都是指针
                if (head==null){
                    head = l1Head;
                    current = l1Head;
                }else {
                    current.next = l1Head;
                    current = l1Head;
                }
                l1Head = l1Head.next;
            }else {
                if (head==null){
                    head=l2Head;
                    current=l2Head;
                }else {
                    current.next = l2Head;
                    current = l2Head;
                }
                l2Head=l2Head.next;
            }
        }
        if(l1Head==null&&l2Head!=null) {
            current.next = l2Head;
        }else if(l1Head!=null&&l2Head==null){
            current.next = l1Head;
        }
        return head;
    }


    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        // step 1. cut the list to two halves
        ListNode prev = null, slow = head, fast = head;
//这个方法太牛逼了
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;//改变了head的尾节点的指向

        // step 2. sort each half
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);

        // step 3. merge l1 and l2
        return merge(l1, l2);
    }
//都是有序的
    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(0), p = l;

        while (l1 != null && l2 != null) {//注意判定条件是节点本身
            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
//非常重要的点，p.next不是p
        if (l1 != null)
            p.next = l1;

        if (l2 != null)
            p.next = l2;

        return l.next;
    }


}
