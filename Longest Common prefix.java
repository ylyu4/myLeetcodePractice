class Solution {
    
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        
        if(strs.length == 1){
            return strs[0];
        }
        
        HashMap <String, Integer> map = new HashMap<>();
        
        String start = strs[0];
        
        for(int i = 1; i <= start.length(); i++){
            map.put(start.substring(0,i),1);
        }
        
        for(int j = 1; j < strs.length; j++){
            
            for(int i = 1; i <= strs[j].length(); i++){
                if(map.containsKey(strs[j].substring(0,i))){
                    map.put(strs[j].substring(0,i),map.get(strs[j].substring(0,i))+1);
                }else{
                    map.put(strs[j].substring(0,i),0);
                }
            }
        }
        
        String res = "";
        
        for(String sub : map.keySet()){
            if(map.get(sub) == strs.length && sub.length() > res.length()){
                res = sub;
            }
        }        
        return res;
    }        
}