package com.leetcode;

import java.util.ArrayList;

/**
 * Created by geliang on 16/8/26.
 */
public class TestHappy {
    public  boolean isHappy(int n) {
        ArrayList listNum = new ArrayList();
        listNum.add(n);
        int res = n;
        while(res!=1){
            res = addSquareNum(res);
//            System.out.println(res);

            if(listNum.contains(res)){
                break;
            }
            listNum.add(res);
        }
        if(res==1){
            return true;
        }
        else{
            return false;
        }
    }

    public  int addSquareNum(int num){
        int tmpNumint = num;
        int sumNum = 0;
        while(tmpNumint!=0){
            sumNum += (int)Math.pow(tmpNumint%10,2);
            tmpNumint = tmpNumint/(10);
        }
        return sumNum;
    }
//    public  void main(){
//        System.out.println(isHappy(19));
//    }
}
