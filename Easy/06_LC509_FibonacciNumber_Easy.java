// LeetCode 509 - Fibonacci Number
class Solution {
    public int fib(int n) {
        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        if (n == 0) {
            return 0;
        }
        return b;
    }
}
