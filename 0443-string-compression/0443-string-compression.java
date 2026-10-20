
class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int j = 0;

        while (i < chars.length) {
            char current = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == current) {
                i++;
                count++;
            }

            chars[j++] = current;

            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[j++] = c;
                }
            }
        }

        return j;
    }
}
