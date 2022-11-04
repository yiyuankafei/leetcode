package com.yiyuankafei.leetcode.algorithm;

public class m_754到达终点数字 {

    /**
     *
     * 1 + 2 + 3 + ... + n >= target
     * 找到这个n，然后sum - target 如果数偶数a，那么 a/2 的步骤往回走就行了（比如往右走是+3，改成往左走是-3，总和就少了 2 * 3，所以如果sum - target是偶数a，就一定存在一个步骤a/2往回走满足要求）
     * 在上面的基础上，如果a/2是奇数，那么一定存在 n + 2步满足要求，因为按上面的方式，会离target差1，那只要先走一步，再反方向走一步，就可以弥补这1的差距
     * 问题是，sum - target是奇数的时候，存不存在n - 1
     * 那么在>=target后，不妨再往后走一步，此时sum - target如果是偶数，那么同理可得，一定存在一个步骤往回走满足要求，此时就是n + 1，否则就是 n + 2
     *
     */
    public static int reachNumber(int target) {
        target = target > 0 ? target : -target;
        int sum = 0;
        int i = 1;
        while (sum < target) {
            sum = sum + i;
            i++;
        }
        if ((sum - target) % 2 == 0) {
            return i - 1;
        }
        sum = sum + i;
        if ((sum - target) % 2 == 0) {
            return i;
        } else {
            return i + 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(reachNumber(13));
    }

}
