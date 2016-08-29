package com.leetcode;

/**
 * Created by geliang on 16/8/28.
 * 1
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int j =1,i=0;
        boolean done = false;
        int[] a = new int[2];
        int len = nums.length;
        for(i=0;i<len-1;i++){
            for (j=i+1;j<len;j++){
                if(target==nums[i]+nums[j]){
                    done = true;
                    a[0]=i;
                    a[1]=j;
                    break;
                }
            }
            if(done){
                break;
            }
        }
        if(done){
            return a;
        }else{
            return  null;
        }
    }
}
