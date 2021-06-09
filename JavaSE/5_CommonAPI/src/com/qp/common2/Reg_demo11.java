package com.qp.common2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg_demo11 {

    public static void main(String[] args) {
        String s = "da jia ting wo shuo ,jin tian yao xia yu,bu shang wan zi ix";
        String regex = "\\b\\w{3}\\b";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(s);
        while (matcher.find()) {
            String group = matcher.group();
            System.out.println(group);

        }
    }
}