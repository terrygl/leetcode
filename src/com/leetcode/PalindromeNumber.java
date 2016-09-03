package com.leetcode;

/**
 * Created by geliang on 16/9/2.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
//        只有16%
//        String str = String.valueOf(x);
//        char[] cArray = str.toCharArray();
//        int len = cArray.length;
//        for(int i=0;i<=len/2;i++){
//            if(cArray[i]!=cArray[len-1-i]){
//                return false;
//            }
//        }
//        return true;
//        -----BEST-----
        if(x<0) return false;
        long t = 1;
        while (x / t != 0) {//t比x长10
            t *= 10;
        }
        int cal = (int) (t / 10);

        while (x != 0) {
            int last = x % 10;
            int first = x / cal;
            if (last != first)
                return false;
            x = (x % cal) / 10;//掐头去尾
            cal /= 100;
        }
        return true;
//        ----BEST END 90%----
//        if (x<0&&x%10 ==0){
//            return false;
//        }
//        int rev = 0;
//        while(x>rev){
//            rev = rev*10 + x%10;
//            x = x /10;
//        }
//        return (x==rev||x==rev/10);
    }

    public String Int2String(int x){
        int i =0;
        int len =(int) Math.floor(Math.log10(x));
        char[] intArray = new char[len];
        String str= String.valueOf(x);
        if (x==0){
            return String.valueOf(0);
        }
        while(x!=0){
            intArray[i++]=(char)(x%10);
            x=x/10;
        }
        return  String.valueOf(intArray);
    }
}
