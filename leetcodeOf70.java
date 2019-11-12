package leetcode_70;

public class leetcodeOf70 {
    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs(4));
    }
}


class Solution {
    public int climbStairs(int n) {
        if (n < 3) {
            return n;
        }
        else {
            int a = 1;
            int b = 2;
            int temp = 0;
            for (int i = 3 ; i <= n ; i ++ ) {
                temp = a + b;
                a = b;
                b = temp;
            }
            return b;
        }
    }
}
