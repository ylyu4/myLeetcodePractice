class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return new ArrayList<List<Integer>>();
        }
        
        Arrays.sort(nums);
        ArrayList<List<Integer>> res = new ArrayList<>();
        
        for(int i = 0; i < nums.length-3; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            for(int j = i + 1; j < nums.length-2; j++){
                if(j>i+1 && nums[j] == nums[j-1]){
                    continue;
                }
                int k = j+1;
                int end = nums.length-1;
                while(k<end){
                    int sum = nums[i]+nums[j]+nums[k]+nums[end];
                    if(sum == target){
                        ArrayList<Integer> arr = new ArrayList<Integer>();
                        arr.add(nums[i]);
                        arr.add(nums[j]);
                        arr.add(nums[k]);
                        arr.add(nums[end]);
                        res.add(arr);
                        while(k < end && nums[k] == nums[k+1]){
                            k++;
                        }
                        while(k < end && nums[end] == nums[end-1]){
                            end--;
                        }
                        k++;
                        end--;
                    }else if(sum < target){
                        k++;
                    }else{
                        end--;
                    }
                }
            }
            
        }
        return res;
    }
}