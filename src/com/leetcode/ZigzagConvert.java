package com.leetcode;

/**
 * Created by geliang on 16/8/29.
 */
public class ZigzagConvert {
    public String convert(String s ,int nRows){
//        j是可能的分组长度 不会大于 len ，从0开始 j=0,1，2，3，4<len

//        i是每组的长度，固定的nRows=5
//
//  2n-2
//k1  0*i                       2*i     2*i            3i
//k2  0*i+1              2*i-1  2*i+1             3*i-1    2*i     3i
//k3  0*i+2     1*i+1         2*i+2       3*i-2          2*i       3i
//k4  0*i+3 1*i               2*i+3 3*i-3                2*i       3i
//k5  0*i+4                     2*i+4                      2*i              3i


if(nRows<=1){
    return s;
}
        int len = s.length();
        char[] strArr = new char[len];
//步长
        int step= 2*nRows-2;//1除外
        int m =0;
        int tmpPos =0;

        for(int j=0;j<nRows;j++){//行
            for(int i=0;i<len;i++){//列
                if(j==0||j==nRows-1){
                    tmpPos = step*i+j;
                }
                else {
                    if(i>0) {
                        tmpPos = step * i - j;
                        if(tmpPos<len){
                            strArr[m++] = s.charAt(tmpPos);
                        }else{
                            break;
                        }
                    }

                    tmpPos = step*i+j;

                }
                if(tmpPos<len){
                    strArr[m++] = s.charAt(tmpPos);
                }else{
                    break;
                }
            }
        }
        System.out.println(strArr);
        return String.valueOf(strArr);
    }

//PAHNAPLSIIGYIR


}
//    public String convert(String s ,int nRows){
//        if (s==null||s.length()==0||nRows<2){
//            return  s;
//        }
////        Map<Integer,Integer>[] strMap = new Map[nRows];
//        List<List<Integer>> strList = new ArrayList();
//        for(int i=0;i<nRows;i++) {
////            strMap[i] = new HashMap<Integer, Integer>();//在本行的位置，之前位置
//
//            strList.add( new ArrayList<Integer>());
//        }
//
//char[] str = new char[s.length()];
//        int len = s.length();
//        int step = 2*nRows -2;
//        int cursor=0;
//        for(int i=0;i<len;i++){
//                if(i%step<nRows){
//                    cursor = i % step;
//                        strList.get(cursor).add(i);//需要注意* /的优先级问题
//                }else {
//                    cursor = step-i%step;
//                    strList.get(cursor).add(i);
//                }
//        }
//
////        反向查找
//
//        int m =0;
//        int j=0;
//        int i=0;
//    try{
//        for(  j=0;j<nRows;j++){
////                for( Integer value : strMap[j].values()) {
//            List<Integer> strList2 = strList.get(j);
//            for( i=0;i<strList.get(j).size();i++){
//                str[m++] = s.charAt(strList2.get(i));
//            }
//        }
//    }catch (Exception e){
////        System.out.println(strList[j].get(i));
//        System.out.println(i+"|");
//    }
//
//        System.out.println(String.valueOf(str));
//        return String.copyValueOf(str);
////    }
//
//
//}
