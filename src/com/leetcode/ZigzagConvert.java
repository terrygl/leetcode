package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by geliang on 16/8/29.
 */
public class ZigzagConvert {
    public String convert(String s ,int nRows){
        if (s==null||s.length()==0||nRows<2){
            return  s;
        }
//        Map<Integer,Integer>[] strMap = new Map[nRows];
        List<List<Integer>> strList = new ArrayList();
        for(int i=0;i<nRows;i++) {
//            strMap[i] = new HashMap<Integer, Integer>();//在本行的位置，之前位置

            strList.add( new ArrayList<Integer>());
        }

char[] str = new char[s.length()];
        int len = s.length();
        int step = 2*nRows -2;
        int cursor=0;
        for(int i=0;i<len;i++){
                if(i%step<nRows){
                    cursor = i % step;
                    if (cursor == 0) {
                        strList.get(cursor).add(i);
                    } else {
                        strList.get(cursor).add(i);//需要注意* /的优先级问题
                    }
                }else {
                    cursor = Math.abs(i%step-step);
                    strList.get(cursor).add(i);
                }
        }
        int m =0;
        int j=0;
        int i=0;
    try{
        for(  j=0;j<nRows;j++){
//                for( Integer value : strMap[j].values()) {
            List<Integer> strList2 = strList.get(j);
            for( i=0;i<strList.get(j).size();i++){
                str[m++] = s.charAt(strList2.get(i));
            }
        }
    }catch (Exception e){
//        System.out.println(strList[j].get(i));
        System.out.println(i+"|");
    }

        System.out.println(String.valueOf(str));
        return String.copyValueOf(str);
    }


}
