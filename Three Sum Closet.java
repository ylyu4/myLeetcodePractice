class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        
        if(nums.length < 3){
            return 0;
        }
        
        Arrays.sort(nums);
        int closet = Integer.MAX_VALUE;
        int res = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length - 2; i++){
            int j = i+1;
            int k = nums.length-1;

            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                
                if(sum == target){
                    return sum;
                }
                
                if(Math.abs(sum - target) < closet){
                    closet = Math.abs(sum-target);
                    res = sum;
                }
                
                if(sum < target){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return res;
    }
}