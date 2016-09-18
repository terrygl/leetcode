package com.leetcode;

import org.junit.Test;

public class ValidParentheseTest {
ValidParenthese test = new ValidParenthese();
    @Test
    public void testIsValid() throws Exception {
        String s = "{}{}{}{]}";
        System.out.println(test.isValid(s));
    }
}