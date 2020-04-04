class Solution {

    /// Time Exceed Solution
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0){
            return new ArrayList<>();
        }
        
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        
        
        for(int i = 0; i < nums.length - 2; i++){
            if(nums[i] > 0){
                break;
            }
            for(int j = i+1; j < nums.length-1; j++){
                if(nums[i]+nums[j] > 0){
                    break;
                }
                for(int k = j+1; k < nums.length; k++){
                    if(nums[i]+nums[j]+nums[k] > 0){
                        break;
                    }
                        
                    if(nums[i]+nums[j]+nums[k] == 0){
                        ArrayList<Integer> arr = new ArrayList<>();
                        arr.add(nums[i]);
                        arr.add(nums[j]);
                        arr.add(nums[k]);
                        if(!set.contains(arr)){
                            set.add(arr);
                        }
                    }
                }
            }
        } 
        return new ArrayList<>(set);
    }
}



class Solution {

    /// The Best Solution
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0){
            return new ArrayList<>();
        }
        
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        
        for(int i = 0; i < nums.length - 2; i++){
            int j = i+1;
            int k = nums.length - 1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k] == 0){
                    ArrayList<Integer> arr = new ArrayList<>();
                    arr.add(nums[i]);
                    arr.add(nums[j]);
                    arr.add(nums[k]);
                    if(!set.contains(arr)){
                        set.add(arr);
                    }
                    j++;
                    k--;
                }else if(nums[i] + nums[j] + nums[k] < 0){
                    j++;
                }else if(nums[i] + nums[j] + nums[k] > 0){
                    k--;
                }
            }
        }
         
        return new ArrayList<>(set);
    }
}



