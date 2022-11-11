package com.yiyuankafei.leetcode.algorithm;

public class s_1704判断字符串的两端是否相似 {

    public static boolean halvesAreAlike(String s) {
        String target = "aeiouAEIOU";
        String s1 = s.substring(0, s.length() / 2);
        String s2 = s.substring(s.length() / 2);
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (target.indexOf(s1.charAt(i)) >= 0) {
                count1 ++;
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            if (target.indexOf(s2.charAt(i)) >= 0) {
                count2 ++;
            }
        }
        return count1 == count2;
    }

    public static void main(String[] args) {
        System.out.println(halvesAreAlike("textbook"));
    }
}
