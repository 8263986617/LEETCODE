
class Solution {
    public int addMinimum(String word) {
        int ans = 0;
        char expected = 'a';

        for (char ch : word.toCharArray()) {
            while (expected != ch) {
                ans++;
                expected++;
                
                if (expected > 'c') {
                    expected = 'a';
                }
            }

            expected++;

            if (expected > 'c') {
                expected = 'a';
            }
        }

        if (expected != 'a') {
            while (expected != 'a') {
                ans++;
                expected++;

                if (expected > 'c') {
                    expected = 'a';
                }
            }
        }

        return ans;
    }
}
