class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int mask = 0;
        HashMap<Character,Integer> ch = new HashMap<>();

        for(char a : allowed.toCharArray()){
            ch.put(a,1);
        }

        int count=0;

        for(String word:words){
            boolean f = true;

            for(char h:word.toCharArray()){
                if(!ch.containsKey(h)){
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