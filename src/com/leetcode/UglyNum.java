package com.leetcode;

/**
 * Created by geliang on 16/8/26.
 * 263. Ugly Number
 */
public class UglyNum {
    public boolean uglynumber(int num){
//        1，能被2，3，5 整除 余数为0 判断方式
//        2，0，1为特殊情况
//        3，循环2，3，5除以num ，直到都无法整除
        int tmpNum = num;
        boolean res = true;
        if(tmpNum ==0|| tmpNum ==1){
            return res ;
        }
        while(tmpNum >1){
           if(tmpNum ==divide235(tmpNum)) {
               break;
           }
            tmpNum = divide235(tmpNum);
        }
        if(tmpNum==1){
            res = true;
        }else{
            res = false;
        }
        return res;
    }

    public int divide235(int num){
        int tmpNum = num;
        if(tmpNum%2==0){
            tmpNum=tmpNum/2;
        }else if(tmpNum%3==0){
            tmpNum = tmpNum/3;
        }
        else if(tmpNum%5==0){
            tmpNum = tmpNum/5;
        }

        return tmpNum;
    }
}
