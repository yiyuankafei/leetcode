package com.yiyuankafei.leetcode.algorithm;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class s_1622检查两个字符串数组是否相等 {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String collect1 = Stream.of(word1).collect(Collectors.joining());
        String collect2 = Stream.of(word2).collect(Collectors.joining());
        return collect1.equals(collect2);
    }

    public static void main(String[] args) {
        String[] word1 = {"a", "cb"};
        String[] word2 = {"ab", "c"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
}
