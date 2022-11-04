package com.yiyuankafei.leetcode.algorithm;

/**
 * 暴力延长子串
 */
public class s_1688最大重复子字符串 {

    public static int maxRepeating(String sequence, String word) {
        int maxCount = 0;
        if (word == null || sequence == null || word.equals("") || sequence.equals("") || sequence.length() < word.length()) {
            return maxCount;
        }
        String target = word;
        while (sequence.contains(target)) {
            maxCount = maxCount + 1;
            target = target + word;
        }
        return maxCount;
    }

    public static void main(String[] args) {
        System.out.println(maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba","aaaba"));
    }
}
