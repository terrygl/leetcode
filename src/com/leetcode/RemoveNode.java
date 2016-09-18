package com.leetcode;

/**
 * Created by geliang on 16/9/15.
 */
public class RemoveNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
//        if (head ==null){
//            return null;
//        }
//        ListNode tmpNode = head;
////        遍历链表,找length
//        int i=1;
//        while(tmpNode.next!=null){
//            i++;
//            tmpNode = tmpNode.next;
//        }
//        int len = i;
//
//        if (len==n){
//            return head.next;
//        }else{
//            int j =len-n;
//            i=0;
//            tmpNode = head;
//            while(i<j-1){
//                tmpNode=tmpNode.next;
//                i++;
//            }
//            tmpNode.next = tmpNode.next.next;
//        }
//
//        one pass
//        if (head.next==null){
//            return head;
//        }
//
//
//        return  head;

        int count = 0;
        ListNode p = head, q = null;
//        count是从尾倒数n的个数，厉害
        while(p != null) {
            if(++count == n + 1)
                q = head;
            else if(count > n + 1)
                q = q.next;
            p = p.next;
        }
        if(q != null) {
            q.next = q.next.next;
            return head;
        }
        return head.next;
    }
}
