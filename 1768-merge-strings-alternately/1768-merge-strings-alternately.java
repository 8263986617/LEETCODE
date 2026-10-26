class Solution {
    public String mergeAlternately(String w1, String w2) {
        StringBuilder s = new StringBuilder();
        
        int i=0;
        int j=0;

        while(i<w1.length() || j<w2.length()){
            if(i<w1.length()){
                s.append(w1.charAt(i));
                i++;
            }

            if(j<w2.length()){
                s.append(w2.charAt(j));
                j++;
            }
        }

        return s.toString();
    }
}