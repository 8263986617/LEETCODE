
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) {
            return result;
        }

        int[] pFreq = new int[26];
        int[] windowFreq = new int[26];

        for (char c : p.toCharArray()) {
            pFreq[c - 'a']++;
        }

        int k = p.length();

        for (int i = 0; i < s.length(); i++) {
            // Add incoming character
            windowFreq[s.charAt(i) - 'a']++;

            // Remove outgoing character
            if (i >= k) {
                windowFreq[s.charAt(i - k) - 'a']--;
            }

            // Compare once the window reaches size k
            if (i >= k - 1 &&
                Arrays.equals(pFreq, windowFreq)) {
                result.add(i - k + 1);
            }
        }

        return result;
    }
}
