class Solution {
    public int xorOperation(int t, int start) {
        int n[] = new int[t];
        int ans = 0;
        for(int i=0; i<t; i++){
            n[i] = start + 2 * i;
            ans ^= n[i];
        }
        return ans;

        
    }
}