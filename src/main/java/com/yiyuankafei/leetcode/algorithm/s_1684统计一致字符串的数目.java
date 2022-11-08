package com.yiyuankafei.leetcode.algorithm;

/**
 * 官方题解，题目只会包含小写字母，所以可以看作26位的bitmap，用位运算来处理
 */
public class s_1684统计一致字符串的数目 {

    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String s : words) {
            char[] chars = s.toCharArray();
            boolean notContains = false;
            for (char c : chars) {
                if (allowed.indexOf(c) < 0) {
                    notContains = true;
                    break;
                }
            }
            if (notContains) {
                continue;
            }
            count = count + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        String allowed = "cad";
        String[] words = {"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"};
        System.out.println(countConsistentStrings(allowed, words));
    }

}
