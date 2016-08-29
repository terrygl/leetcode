package com.leetcode;

/**
 * Created by geliang on 16/8/26.
 */
public class MergekList {
    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        if(len==0){
            return null;
        }
//        for(int i = 0 ;i<len-1;i++){
//            lists[0]=merge(lists[0], lists[i + 1]);
//        }
//        return lists[0];
        return  partion(lists,0,len-1);
    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode head = new ListNode(0);
        ListNode p = head;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                p.next = l1;
                l1 = l1.next;
            }else{
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if(l1!=null){
            p.next = l1;
        }
        if(l2!=null){
            p.next = l2;
        }
        return head.next;
    }

    public ListNode partion(ListNode[] lists ,int e,int q){
        int s = (e+q)/2;
        if(e==q) return lists[s];
        if(e<q){
            ListNode l1 = partion(lists,e,s);
            ListNode l2 = partion(lists,s+1,q);
            return  merge2(l1,l2);
        }else{
            return  null;
        }
    }
    public ListNode merge2(ListNode l1, ListNode l2){
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        if(l1.val<l2.val){
            l1.next = merge(l1.next,l2);
            return l1;
        }else {
            l2.next = merge(l1,l2.next);
            return  l2;
        }
    }
}
