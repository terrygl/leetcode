package com.leetcode;

import org.junit.Test;

public class CalculateTest {

    @Test
    public void testSumTwo() throws Exception {
        Calculate test = new Calculate();
        System.out.print(test.sumTwo(7,2));
    }

    @Test
    public void testMinusTwo() throws Exception {
        Calculate test = new Calculate();
        System.out.print(test.minusTwo(7,2));
        System.out.print(0x1);
    }
    @Test
    public void testTimeTwo() throws Exception {
        Calculate test = new Calculate();
        System.out.print(test.timeTwo(7,2));
        System.out.print(test.timeTwo(7,-2));
        System.out.print(test.timeTwo(-7,2));
        System.out.print(test.timeTwo(-7,-2));
        System.out.print(test.timeTwo(-7,0));
    }
    @Test
    public void testDivideTwo() throws Exception {
        Calculate test = new Calculate();
        System.out.print(test.divideTwo(81, 10)+"\n");
//        System.out.print(test.divideTwo(8, -2)+"\n");
//        System.out.print(test.divideTwo(-7, 2)+"\n");
//        System.out.print(test.divideTwo(-7, -2)+"\n");
//        System.out.print(test.divideTwo(-7,0)+"\n");
    }
    @Test
    public void testDividEx() throws Exception{
        Calculate test = new Calculate();
        System.out.print(test.dividEx(81, 10)+"\n");
    }
}