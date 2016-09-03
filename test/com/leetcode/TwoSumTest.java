package com.leetcode;

import org.junit.Test;

public class TwoSumTest {
TwoSum res = new TwoSum();
    @Test
    public void testTwoSum() throws Exception {
            int target = -14;
            int a[] = {-2,4,7,3,11,-12};
            int[] b = new int[2];
            b = res.twoSum(a,target);
            for (int i=0;i<2;i++){
                System.out.println(b[i]);
            }
    }
}