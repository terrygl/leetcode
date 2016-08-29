package com.leetcode;

/**
 * Created by geliang on 16/8/28.
 * 2
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       return addTowNumbersRecur(l1,l2,0);
//        ListNode l = new ListNode(0);
//        l.next=l1;
//        int sum =0;
//        int carry =0;
//        while(l1!=null&&l2!=null){
//            sum = l1.val+l2.val+carry;
//            if(sum>=10){
//                l1.val = sum % 10;
//                carry=1;
//            }else{
//                l1.val = sum %10;
//                carry =0;
//            }
//            l1 = l1.next;
//            l2 = l2.next;
//        }
//        if(l1 !=null&&l2 ==null){
//            if(carry==1){
//                l1.val+=1;
//            }
//
//        }
//        if(l1==null && l2!=null){
//            l1=l2;
//            if(carry==1){
//                l1.val+=1;
//            }
//        }
//        if(l1==null && l2==null){
//            if(carry ==1){
//                l1 = new ListNode(1);
//            }
//        }
//        return l.next;
    }


    public ListNode addTowNumbersRecur(ListNode l1,ListNode l2,int carry ){
        if(l1==null&&l2!=null){
            l2.val+=carry;
            if(l2.val>=10){
                l2.val = l2.val%10;
                l2.next = addTowNumbersRecur(l1,l2.next,1);
            }
            return l2;
        }
        if(l2==null&&l1!=null ){
            l1.val+=carry;
            if(l1.val>=10){
                l1.val = l1.val%10;
                l1.next = addTowNumbersRecur(l1.next,l2,1);
            }
            return l1;
        }
        if(l1==null&&l2==null){
            if (carry==1) {
                l1 = new ListNode(carry);
            }
            return l1;
        }
        int sum = l1.val+l2.val+carry;
        l1.val = sum%10;
        if(sum>=10){
            l1.next =addTowNumbersRecur(l1.next, l2.next, 1);
        }else{
            l1.next = addTowNumbersRecur(l1.next, l2.next, 0);
        }
        return l1;
    }
}
