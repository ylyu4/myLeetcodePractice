class Solution {
    public int singleNumber(int[] nums) {
        if(nums == null || nums.length == 0){
            return Integer.MIN_VALUE;
        }
        
        if(nums.length == 1){
            return nums[0];
        }
        
        Arrays.sort(nums);
        int i = 1;
        int appear = 0;
        while(i < nums.length-1){
            if(nums[i - 1] == nums[i]){
                appear++;
                i++;
            }else{
                if(appear == 0 && nums[i] != nums[i+1]){
                    return nums[i];
                }else if(appear == 0 && nums[i] != nums[i-1]){
                    return nums[i-1];
                }else{
                    appear = 0;
                }
                i++;
            }
        }
        
        if(nums[i] != nums[i-1]){
            return nums[i];
        }else{
            return Integer.MIN_VALUE;
        }
    }
}