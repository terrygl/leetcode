package com.leetcode;

/**
 * Created by geliang on 16/9/2.
 */
public class Atoi {
    public int myAtoi(String str) {
//        1,前面的空格
//        2，考虑0 的情况
//        3，考虑0 - + 重复出现的情况
//        4，考虑int的上下限
        char[] s = str.toCharArray();
//        先做一个纯的
        long resLong = 0;

//        判断其实未知
        int len = s.length;
        int i=0;
        int startPos = 0;
        int endPos = 0;
//      空的字符串
        if(len==0){
            return 0;
        }
//        找到起始未知
        while(i<len){
//            找到数字
            if(s[i]>'0'&&s[i]<='9'){
                break;
            }
//            找到加减号
            if(s[i]=='-'||s[i]=='+'){
                if(i+1<len&&s[i+1]>'0'&&s[i+1]<='9'){
                    break;
                }
            }
            i++;
        }
//      判断是否是未找到数字
        if(i==len){
            return 0;
        }else{
            startPos=i;
        }


//        寻找结束未知
        i++;
        //结束位置起始点
        while(i<len){
            if (s[i]<'0'||s[i]>'9'){

                break;
            }
            i++;
        }
        endPos= i;
//       做数字转化
        i = startPos;
        if(s[i]=='-'){
            i++;
            while (i<endPos){
                resLong =resLong*10 + s[i]-'0';
                i++;
            }
            resLong = ~resLong+1;
        }else if(s[i]=='+'){
            i++;
            while (i<endPos){
                resLong =resLong*10 + s[i]-'0';
                i++;
            }
        }else {
            while (i<endPos){
                resLong =resLong*10 + (int)(s[i]-'0');
                i++;
            }
        }
        if(resLong>Integer.MAX_VALUE||resLong<Integer.MIN_VALUE){
            return 0;
        }
        return (int)resLong;

//        这道题设计的就有问题，只考虑到了前后是非数字的情况，没有考虑起始条件成立后，有字符符合的情况如 +-2 返回0 应该是-2；如ee-2 22 返回0，应该是-2
//        大于integer最大值就返回Integer.MAX_VALUE，那个也不好
//        double result = 0;
//        int POrN = 1;
//        int count = 0;
//        char[] charArr = str.toCharArray();
//        for(char c:charArr){
//            count ++;
//            if( c >='0' && c <='9' ){
//                result *= 10;
//                result += ( c - '0');
//            }else if( c == '-' && count == 1){
//                POrN = -1;
//            }else if( c == '+' && count == 1){
//                POrN =  1;
//            }else if( c == ' ' && count == 1){
//                count --;
//            }else{
//                break;
//            }
//
//        }
//        if( result > Integer.MAX_VALUE ){
//            if(POrN == 1)
//                return Integer.MAX_VALUE;
//            else
//                return Integer.MIN_VALUE;
//        }else{
//            return (int)(result * POrN);
//        }
//


    }
}
