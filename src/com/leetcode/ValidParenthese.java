package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by geliang on 16/9/17.
 */


public class ValidParenthese {
    Map<String,String> parent = new HashMap<String, String>();
    public boolean isValid(String s) {
//        找出最近的一个bracket
//        遍历字符串
        int len = s.length();
        ArrayList<String> startStrArray=new ArrayList<String>();

        for (int i =0;i<len;i++){
            String str=String.valueOf(s.charAt(i));
            if (parent.containsKey(str)){
                startStrArray.add(str);
            }
            if(parent.containsValue(str)){
//                考虑只有一个反括号的情况
                if (startStrArray.size()==0){
                    return false;
                }else{
                    //                比较
                    if (parent.get(startStrArray.get(startStrArray.size()-1)).equals(str)){
                        startStrArray.remove(startStrArray.size()-1);
                    }else{
                        return false;
                    }
                }

            }
        }
        if (startStrArray.size()!=0){
            return false;
        }
        return true;
    }

    public ValidParenthese() {
        this.parent.put("{","}");
        this.parent.put("[","]");
        this.parent.put("(",")");
    }
}
