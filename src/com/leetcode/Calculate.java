package com.leetcode;

/**
 * Created by geliang on 16/9/17.
 */
public class Calculate {
    public int sumTwo (int a,int b){
//        int ret =0;
//        ret = a^b+(a&b)<<1;
//        return ret;
        if(0==b)
            return a;//若进位为0，运算结束
        return sumTwo(a^b,(a&b)<<1);//若存在不为0的进位，则重复运算  a是无进位加法，b是进位的数。没异或一次都要计算进位的情况，直到没有进位
    }
    public int minusTwo(int a,int b){
        int c = sumTwo(~b,1);//a +(-b)
        return sumTwo(a,c);
    }
    public int timeTwo(int a,int b){
//        都先变成正数
        int tmpa = a>0?a:sumTwo(~a,1);
        int tmpb = b>0?b:sumTwo(~b,1);
        int ret = 0;
//        倍数关系，每次循环后加倍
        while(tmpa>0){
            if((tmpa&0x1)>0){//最后一位是否为1
                ret = sumTwo(ret,tmpb);
            }
            tmpa=tmpa>>1;
            tmpb=tmpb<<1;
        }
        if((a^b)<0){
            ret = sumTwo(~ret,1);
        }
        return ret;
     }
    public int divideTwo(int a,int b){
        //对被除数和除数取绝对值
//        二进制除法思路 比较十进制除法思路
        if(b==0){
            return 0;
        }
        int dividend = a < 0 ? sumTwo(~a, 1) : a;
        int divisor = b < 0 ? sumTwo(~b, 1) : b;

        //获得被除数的反序 比如dividend=101011 invert=1110101,invert最高位会多一个1,
        int invert = 2;
        //这是为了防止dividend=1010,则直接反转为0101,这个时候原来的最低位的0就会丢失

        while(dividend!=0)
        {
            invert |= dividend & 0x1;//倒叙
            invert = invert << 1;
            dividend = dividend >> 1;
        }

        int quotient = 0;
        int remainder = 0;
        while(invert > 1)//排除最高位的1
        {
            remainder = remainder << 1;
            remainder |= invert & 0x1;
            invert = invert >> 1;
            quotient = quotient << 1;

            if(remainder >= divisor)
            {
                quotient |= 0x1;
                remainder = minusTwo(remainder, divisor);
            }
        }
        //求商的符号
        if((a ^ b) < 0)
        {
            quotient = sumTwo(~quotient, 1);
        }
        return quotient;
    }
    public int dividEx(int a,int b){
//        想象十进制除法
//        绝对值
        int dividend = a>0?a:sumTwo(~a,1);
        int divisor = b>0?b:sumTwo(~b,1);
        int invert =2;
//        被除数翻转，为下一步从头到尾除做准备
        while(dividend>0){
            invert|=dividend&0x1;
            dividend>>=1;
            invert<<=1;
        }

        int remainder =0;//余数
        int quotient =0;//商
        while(invert>1){
//            添加余数
            remainder <<= 1;
            remainder |= invert&0x1;
            invert>>=1;
            quotient <<=1;//商进位
//            判断商
            if (remainder>=divisor){
                quotient |=0x1;//置位
                remainder = minusTwo(remainder,divisor);
            }
        }

        if((a^b) <0){
            quotient = sumTwo(~quotient,1);
        }
        return  quotient;
    }
}
