class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int mask = 0;
        HashSet<Character> ch = new HashSet<>();

        for(char a : allowed.toCharArray()){
            ch.add(a);
        }

        int count=0;

        for(String word:words){
            boolean f = true;

            for(char h:word.toCharArray()){
                if(!ch.contains(h)){
                    f = false;
                    break;
                }
            }
            if(f){
                count++;
            }
        }
        return count;
    }
}