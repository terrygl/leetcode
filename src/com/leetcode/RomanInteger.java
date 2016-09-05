package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by geliang on 16/9/4.
 */


public class RomanInteger {
//    构建Roman的对应数组
    Map<Integer,String> romanMap = new HashMap<Integer, String>();

    public RomanInteger() {
        this.romanMap.put(1000,"MMM");
        this.romanMap.put(2000,"MM");
        this.romanMap.put(3000,"M");
        this.romanMap.put(100,"C");
        this.romanMap.put(200,"CC");
        this.romanMap.put(300,"CCC");
        this.romanMap.put(400,"CD");
        this.romanMap.put(500,"D");
        this.romanMap.put(600,"DC");
        this.romanMap.put(700,"DCC");
        this.romanMap.put(800,"DCCC");
        this.romanMap.put(900,"CM");
        this.romanMap.put(10,"X");
        this.romanMap.put(20,"XX");
        this.romanMap.put(30,"XXX");
        this.romanMap.put(40,"XL");
        this.romanMap.put(50,"L");
        this.romanMap.put(60,"LX");
        this.romanMap.put(70,"LXX");
        this.romanMap.put(80,"LXXX");
        this.romanMap.put(90,"XC");
        this.romanMap.put(1,"I");
        this.romanMap.put(2,"II");
        this.romanMap.put(3,"III");
        this.romanMap.put(4,"IV");
        this.romanMap.put(5,"V");
        this.romanMap.put(6,"VI");
        this.romanMap.put(7,"VII");
        this.romanMap.put(8,"VIII");
        this.romanMap.put(9,"IX");
        this.romanMap.put(0,"");

    }

    public String intToRoman(int num) {
        String res = new String("");
        if (num==0||num>3999)return res;
        int i=1000;
        while(i>0){
            int j = num/i;
            res +=romanMap.get(j*i);
            num -=j*i;
            i /=10;
        }
        return res;
    }

}
