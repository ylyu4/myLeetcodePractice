class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        
        int localMax = nums[0];
        int max = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            localMax = Math.max(nums[i] + localMax, nums[i]);
            max = Math.max(max, localMax);
        }
        
        return max;
    }
}