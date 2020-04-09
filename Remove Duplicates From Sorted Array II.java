class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(i < 2 || nums[i] != nums[index-2]){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}