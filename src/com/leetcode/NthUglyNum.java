package com.leetcode;

import java.util.ArrayList;

/**
 * Created by geliang on 16/8/26.
 * 264
 */
public class NthUglyNum {
    UglyNum testUgly = new UglyNum();
   public int  nthUglyNumber(int nth){
//       1,一个一个搜
//       double max = Double.MAX_VALUE;
//       int num=0;
//       int uglyNum =0;
//       while(uglyNum<nth){
//           if(testUgly.uglynumber(++num)){
//               uglyNum++;
//           }
//       }
//       2,用生成的方法
//       1,创建一个队列，ArrayList存放数
//       2，从2，3，5的队列中选数，选其中最小的如队列
//       3，队列长度达到要求结束
       int num2listHead =0;
       int num3listHead =0;
       int num5listHead =0;
       int numPrimeLen =1;
       //一个坑 保证游标的起始值正确，让循环正确
       ArrayList<Integer> numList = new ArrayList<Integer>();
       numList.add(1);

//       找最小值
       int testMin =1;
        if(nth==1){
            return 1;
        }
//       2，3，5数组有重复的情况，这个开始没有考虑到
        while(numPrimeLen<=nth){
            int num2 = numList.get(num2listHead)*2;
            int num3 = numList.get(num3listHead)*3;
            int num5 = numList.get(num5listHead)*5;
           testMin= minPrime(num2,num3,num5);
            numList.add(testMin);
            numPrimeLen++;
            if(testMin==num2){
                num2listHead++;
            }
            if(testMin==num3){
                num3listHead++;
            }
            if(testMin==num5){
                num5listHead++;
            }
        }
       return  numList.get(nth-1);
   }
    public int minPrime(int n2,int n3,int n5){
        int min =n2;
        if(n2<n3){
            min=n2;
        }
        else{
            min =n3;
        }
        if(min>n5){
            min=n5;
        }
        return min;
    }
}
