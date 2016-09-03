package com.leetcode;

import java.util.ArrayList;
import java.util.Iterator;
public class Main {


    public static int addSquareResult(int num){
        int tmpNumInt =num;
        int sumNum =0;

        int i=1;
        while(tmpNumInt!=0){
            sumNum+=(int)Math.pow(tmpNumInt%10,2);
            tmpNumInt = tmpNumInt/(10);

        }
        return sumNum;
    }

    public static void main(String[] args) {
//happy number
        int num =19;
        int res = num;
        ArrayList listNum = new ArrayList();
        listNum.add(res);
        int val =0;
        System.out.println(listNum.size());
        Iterator iter =listNum.iterator();
//        while(iter.hasNext()){
//            System.out.println(iter.next());
//        }

        while(res!=1)
        {
            res = addSquareResult(res);
            if(listNum.contains(res)){
                break;
            }
            listNum.add(res);

            System.out.println(res);
        }


        System.out.println(res);
//        System.out.println(addSquareResult(100));
        System.out.println("Hello World!");
        TestHappy testHappy = new TestHappy();
        System.out.println(testHappy.isHappy(19));

        for(int i=0;i<99;i++){
            System.out.println(i);
            i=i+5;
        }
    }

}
