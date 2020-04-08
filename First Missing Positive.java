class Solution {

    /// Find the lowest positive integer that has never appeared
    /// Put Integers to index of their value minus one
    /// put 1 at index 0; put 2 at index 1; put 3 at index 2
    public int firstMissingPositive(int[] nums) {
        if(nums == null){
            return 1;
        }
        
        int i = 0;
        while(i < nums.length){
            if(nums[i] > 0 && nums[i] < nums.length && nums[i]!=nums[nums[i]-1]){
                swap(nums, i , nums[i]-1);
            }else{
                i++;
            }
        }
        
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j + 1){
                return j + 1;
            }
        }
        
        return nums.length + 1;
    }
    
    public void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}