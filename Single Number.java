class Solution {

	/// HashMap
	public int singleNumber(int[] nums) {
        
        HashMap<Integer, Integer> map= new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else{
                map.put(nums[i], 2);
            }
        }
        
        for(Integer key : map.keySet()){
            if(map.get(key) != 2){
                return key;
            }
        }
        
        return Integer.MIN_VALUE;
    }





	///Bit manipulation
	/// 0 ^ a = a
	/// a ^ a = 0
	/// a ^ b ^ a = a ^ a ^ b = 0 ^ b = b
    public int singleNumber(int[] nums) {
        
        int result = 0;
        for(Integer k: nums){
            result = result ^ k;
        }
        return result;
    }
}