package com.leetcode;

import org.junit.Test;

public class RomanToIntTest {

    @Test
    public void testRomanToInt() throws Exception {
        RomanToInt test = new RomanToInt();
        System.out.println(test.romanToInt(""));
        System.out.println(test.romanToInt("MCM"));
        System.out.println(test.romanToInt("MMMCCCXXXIII"));
    }
}