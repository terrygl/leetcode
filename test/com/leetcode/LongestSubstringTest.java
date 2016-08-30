package com.leetcode;

import org.junit.Test;

public class LongestSubstringTest {
    LongestSubstring test = new LongestSubstring();
//    String str = new String("piqggbgobwsoktwoquqkarzfyyfdxukmfasol");
    String str = new String("piqggbgobwsoktwoquqkarzfyyfdrukmfaso");
    @Test
    public void testLengthOfLongestSubstring() throws Exception {

        System.out.println(test.lengthOfLongestSubstring(str));
    }
}