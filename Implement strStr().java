class Solution {

    /// Fastest
    public int strStr(String haystack, String needle) {
        
        if(needle == null || needle.length() == 0){
            return 0;
        }
        
        for(int i = 0; i < haystack.length() - needle.length() + 1; i++){
            String test = haystack.substring(i, i + needle.length());
            if(test.equals(needle)){
                return i;
            }
        }
        return -1;
    }


    /// Slowest
    public int strStr(String haystack, String needle) {
        
        if(needle == null || needle.length() == 0){
            return 0;
        }
        
        if(haystack == null || haystack.length() == 0){
            return -1;
        }
        
        if(haystack.length() < needle.length()){
            return -1;
        }
        
        
        char[] cha1 = haystack.toCharArray();
        char[] cha2 = needle.toCharArray();
        
        for(int i = 0; i < cha1.length; i++){
            if(cha1[i] == cha2[0]){
                int start = i;
                int count = 0;
                int j = 0;
                while(start < cha1.length && j < cha2.length){
                    if(cha2[j] != cha1[start]){
                        break;
                    }
                    j++;
                    start++;
                    count++;
                }
                if(count == cha2.length){
                    return i;
                }
            }
        }
        return -1;
    }
}