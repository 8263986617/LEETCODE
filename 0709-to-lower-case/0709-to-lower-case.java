class Solution {
    public String toLowerCase(String s) {
        // Convert to a char array to easily modify elements
        char[] chars = s.toCharArray();
        
        for (int i = 0; i < chars.length; i++) {
            // Check if the character is an uppercase letter
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                // Add 32 to transition to lowercase ASCII value
                chars[i] = (char) (chars[i] + 32);
            }
        }
        
        // Return the modified characters as a new String
        return new String(chars);
    }
}
