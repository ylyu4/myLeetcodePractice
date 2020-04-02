class Solution {

    ///Time O(n)   Space O(n)
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length()==0){
            return 0;
        }
        
        HashMap <Character, Integer> map = new HashMap<>();
        
        int slow = 0;
        int fast = 0;
        int max = 0;
        
        for(fast = 0; fast < s.length(); fast++){
            if(map.containsKey(s.charAt(fast))){
                slow = Math.max(slow, map.get(s.charAt(fast))+1);
            }
            max = Math.max(max, fast - slow + 1);
            map.put(s.charAt(fast),fast);
        }
        return max;
    }


    //Time O(n^2)  Space O(n)
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length()==0){
            return 0;
        }
        
        HashMap <Character, Integer> map = new HashMap<>();
        
        
        int max = 1;
        
        for(int slow = 0; slow < s.length(); slow++){
            map.put(s.charAt(slow), slow);
            for(int fast = slow + 1; fast < s.length(); fast++){
                if(map.containsKey(s.charAt(fast))){
                    break;
                }
                map.put(s.charAt(fast), fast);
                max = Math.max(max, fast-slow+1);
            }
            map.clear();
        }
        return max;
    }
}