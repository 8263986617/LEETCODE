
import java.util.*;

class Solution {
    static final long MOD = 1_000_000_007L;

    class BIT {
        int n;
        long[] b1, b2;

        BIT(int n) {
            this.n = n;
            b1 = new long[n + 2];
            b2 = new long[n + 2];
        }

        void add(long[] bit, int i, long val) {
            while (i <= n) {
                bit[i] = (bit[i] + val) % MOD;
                i += i & -i;
            }
        }

        long query(long[] bit, int i) {
            long sum = 0;
            while (i > 0) {
                sum = (sum + bit[i]) % MOD;
                i -= i & -i;
            }
            return sum;
        }

        void rangeAdd(int l, int r, long val) {
            int L = l + 1;
            int R = r + 1;

            add(b1, L, val);
            add(b1, R + 1, (MOD - val) % MOD);

            add(b2, L, val * (L - 1) % MOD);
            add(b2, R + 1, (MOD - val) % MOD * R % MOD);
        }

        long prefixSum(int i) {
            int x = i + 1;
            long s1 = query(b1, x);
            long s2 = query(b2, x);
            return ((s1 * x % MOD - s2 + MOD) % MOD);
        }

        long rangeSum(int l, int r) {
            if (l > r) return 0;
            return (prefixSum(r) - prefixSum(l - 1) + MOD) % MOD;
        }
    }

    public int sumCounts(int[] nums) {
        int n = nums.length;
        BIT bit = new BIT(n);
        Map<Integer, Integer> seen = new HashMap<>();

        long cur = 0;
        long res = 0;

        for (int i = 0; i < n; i++) {
            int j = seen.getOrDefault(nums[i], -1) + 1;

            long sumDistinct = bit.rangeSum(j, i);
            long len = i - j + 1L;

            long increase = (2L * sumDistinct % MOD + len) % MOD;
            cur = (cur + increase) % MOD;
            res = (res + cur) % MOD;

            bit.rangeAdd(j, i, 1);
            seen.put(nums[i], i);
        }

        return (int) res;
    }
}
