class Solution {

    ///Solution1    Brute Force
    ///Time O(n^2)  Space O(1)
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return new int[]{};
        }
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }


    ///Solution2    HashMap
    ///Time O(1)   Space O(n)
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return new int[]{};
        }
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int res = target - nums[i];
            if(map.containsKey(res)){
                return new int[]{map.get(res),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}