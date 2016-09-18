package com.leetcode;

/**
 * Created by geliang on 16/9/12.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
//        1，遍历数组
//        2，比较字符串
        if (strs.length==0||strs==null){
            return "";
        }
        String prefix = strs[0];
        for(int i=0;i<strs.length;i++){
            int j=0;
            while (j<strs[i].length()&&j<prefix.length()&&prefix.charAt(j)==strs[i].charAt(j)){
                j++;
            }
            if(j==0){
                return  "";
            }
            prefix = prefix.substring(0,j);
        }
        return  prefix;
    }
}
