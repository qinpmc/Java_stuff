package com.qp.common;

public class String_demo_9 {
    public static void main(String[] args) {
        String s = "wesdf123ASD456FGbnE";
        getCaseAndNum(s);
    }

    public static void getCaseAndNum(String str){
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int numCount = 0;
        for(int i=0,length = str.length();i<length;i++){
            char character = str.charAt(i);
            if(character>='0' && character<= '9') numCount++;
            if(character>='a' && character<= 'z') lowerCaseCount++;
            if(character>='A' && character<= 'Z') upperCaseCount++;
        }
        System.out.println("小写字母："+lowerCaseCount+",大写字母："+upperCaseCount+"数字："+numCount);
    }
}
