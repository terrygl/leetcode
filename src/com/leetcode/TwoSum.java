package com.leetcode;

/**
 * Created by geliang on 16/8/28.
 * 1
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
//        if(nums ==null ||nums.length ==0)return null;
//        Map<Integer,Integer> map = new HashMap< Integer,Integer>();
//        int[] res=new int[2];
//
//        for(int i =0;i<nums.length;i++){
//            Integer diff = target-nums[i];
//            if(map.containsKey(diff)){
//                res[0] = map.get(diff);
//                res[1] = i;
//                return res;
//            }else{
//                map.put(nums[i],i);
//            }
//        }
//        return  null;
//找出最大最小值
//放入以值为下标的数组
//1，边界条件
        if(nums ==null ||nums.length ==0){
            return null;
        }
//2,找出最大最小值
        int len = nums.length;
        int min =0;
        int max =0;
        for(int i=0;i<len;i++){
            max = nums[i]>max?nums[i]:max;
            min = nums[i]<min?nums[i]:min;
        }

        int sMin =Math.min(min,target-max);
        int sMax = Math.max(max,target-min);
//创建一个数组映射(通过比较最大最小值，确定临时数组）
        int tmpLen = sMax-sMin+1;
        int[] tmpArr = new int[tmpLen];
        for (int i=0;i<tmpLen;i++){
            tmpArr[i] = -1;
        }
        for(int i=0;i<tmpLen;i++){
            tmpArr[i]=-1;
        }

        for(int i=0;i<len;i++){
            if(nums[i]<min||nums[i]>max){
                continue;
            }
            if(tmpArr[nums[i]-sMin]==-1){
                tmpArr[target-nums[i]-sMin]=i;
            }else{
                return new int[]{i,tmpArr[nums[i]-sMin]};
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
