class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        for(String word:words){
            boolean valid = true;

            for(char ch:word.toCharArray()){
                if(allowed.indexOf(ch)==-1){
                    valid = false;
                    break;
                }

                
            }
            if(valid){
                    count++;
                }
        }
        return count;
    }
}