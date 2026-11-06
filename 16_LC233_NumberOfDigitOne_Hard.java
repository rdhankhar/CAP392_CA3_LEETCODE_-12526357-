// LeetCode 233 - Number of Digit One
class Solution {
    public int countDigitOne(int n) {
        long count = 0;

        for (long i = 1; i <= n; i = i * 10) {
            long divider = i * 10;
            long high = n / divider;
            long current = (n / i) % 10;
            long low = n % i;

            if (current == 0) {
                count = count + high * i;
            } else if (current == 1) {
                count = count + high * i + low + 1;
            } else {
                count = count + (high + 1) * i;
            }
        }
        return (int) count;
    }
}
