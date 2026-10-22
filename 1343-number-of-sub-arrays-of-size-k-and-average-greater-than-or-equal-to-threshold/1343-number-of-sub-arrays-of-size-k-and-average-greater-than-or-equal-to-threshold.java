class Solution {
    public int numOfSubarrays(int[] nums, int k, int t) {
        int n = nums.length;
        double sum = 0;
        int count=0;

        // Calculate the sum of the first k elements
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        if((sum/k)>=t){
            count++;
        }

        double maxSum = sum;
        

        // Slide the window across the array
        for (int i = k; i < n; i++) {
            sum = sum + nums[i] - nums[i - k];
            if((sum/k)>=t){
                count++;
            }
            
        }

        return count;
    }
}