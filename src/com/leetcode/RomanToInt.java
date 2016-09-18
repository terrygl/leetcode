package com.leetcode;

/**
 * Created by geliang on 16/9/4.
 */
public class RomanToInt {
    public int romanToInt(String s) {

////        String roman =new String("MDCLXVI");
//
//        Map<String,Integer> romanMap = new HashMap<String, Integer>();
//        romanMap.put("M",1000);
//        romanMap.put("D",500);
//        romanMap.put("C",100);
//        romanMap.put("L",50);
//        romanMap.put("X",10);
//        romanMap.put("V",5);
//        romanMap.put("I",1);
//        romanMap.put("",0);
//
//        int len = s.length();
//        if (len==0){
//            return 0;
//        }
//        int res =0;
//        int m=0;
//        for( m=0;m<len;m++){
//                if(m+1<len&&romanMap.get(String.valueOf(s.charAt(m)))<romanMap.get(String.valueOf(s.charAt(m + 1)))){
//                    //caluate res
//                    res-=romanMap.get(String.valueOf(s.charAt(m)));
//                }else{
//                    res+=romanMap.get(String.valueOf(s.charAt(m)));
//            }
//        }
//
//        return res;
        char[] c = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            int val = getSymbolValue(c[i]);
            if ((i + 1) < c.length && val < getSymbolValue(c[i+1])) {
                sum -= val;
            } else {
                sum += val;
            }
        }
        return sum;
    }

    public int getSymbolValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return -1;
    }


}
