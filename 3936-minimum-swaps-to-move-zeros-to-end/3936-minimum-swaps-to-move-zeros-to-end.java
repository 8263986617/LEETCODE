class Solution {
    public int minimumSwaps(int[] nums) {
        int n = nums.length;

        int nonZeroCount = 0;

        for(int a:nums){
            if(a !=0){
                nonZeroCount++;
            }
        }

        int zeroCount = n - nonZeroCount;

        int swap = 0;

        for(int i=n-zeroCount;i<n;i++){
            if(nums[i] != 0 ){
                swap++;
            }
        }
        return swap;

        
    }
}