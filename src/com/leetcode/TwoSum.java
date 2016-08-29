package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by geliang on 16/8/28.
 * 1
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if(nums ==null ||nums.length ==0)return null;
        Map<Integer,Integer> map = new HashMap< Integer,Integer>();
        int[] res=new int[2];

        for(int i =0;i<nums.length;i++){
            Integer diff = target-nums[i];
            if(map.containsKey(diff)){
                res[0] = map.get(diff);
                res[1] = i;
                return res;
            }else{
                map.put(nums[i],i);
            }
        }
        return  null;





//        int j =1,i=0;
//        boolean done = false;
//        int[] a = new int[2];
//        int len = nums.length;
//        for(i=0;i<len-1;i++){
//            for (j=i+1;j<len;j++){
//                if(target==nums[i]+nums[j]){
//                    done = true;
//                    a[0]=i;
//                    a[1]=j;
//                    break;
//                }
//            }
//            if(done){
//                break;
//            }
//        }
//        if(done){
//            return a;
//        }else{
//            return  null;
//        }
    }
}
