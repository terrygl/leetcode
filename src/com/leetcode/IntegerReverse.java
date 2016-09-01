package com.leetcode;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by geliang on 16/8/30.
 */
public class IntegerReverse {
    public int reverse(int x) {

        long rev= 0;
        while( x != 0){
            rev= rev*10 + x % 10;
            x= x/10;
            if( rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
                return 0;
        }
        return (int) rev;


//        int tmp=0;
//
//        if (x<0){
//            tmp=reverseIntegerPostive(~x+1);
//            if(tmp==0)return 0;
//            tmp = ~tmp+1;
//        }
//        else{
//            tmp=reverseIntegerPostive(x);
//        }
//        return tmp;
    }

    public int splitInteger(int x,ArrayList a){
        if(x<10){ a.add(x);return x;}
        a.add(x%10);
        splitInteger(x / 10,a);
        return x%10;
    }

    public int reverseIntegerPostive(int x){
        ArrayList list = new ArrayList();
        splitInteger(x,list);
        Iterator iterator = list.iterator();
         long resTmp =0;
        int res =0;
        while(iterator.hasNext()){
            resTmp = resTmp*10+(Integer)iterator.next();
        }
        System.out.println(resTmp);
        if(resTmp<=Integer.MAX_VALUE){
            res = (int)resTmp;
        }
        return res;
    }
}
