package sqrt_x;

public class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int s = 2, c = 2;
        while (s > x / s || (s + 1) <= x / (s + 1)) {
            if (s > x / s) {
                c >>= 1;
                s -= c;
            } else {
                c <<= 1;
                s += c;
            }
        }
        return s;
    }
}
