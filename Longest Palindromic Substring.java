class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0){
            return "";
        }
        
        char[] cha = s.toCharArray();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        int maxLen = 0;
        
        for(int i = 0; i < cha.length; i++){
            for(int j = i+1; j < cha.length; j++){
                if(cha[i] == cha[j]){
                    if(checkPalindrome(cha, i, j) == true){
                        int len = j - i + 1;
                        if(len > maxLen){
                            maxLen = len;
                            map.put(len, i);
                        }
                    }
                }
            }
        }
        if(maxLen == 0){
            char[] arr = new char[1];
            arr[0] = cha[0];
            String string = new String(arr);
            return string;
        }
        char[] res = new char[maxLen];
        int resIndex = map.get(maxLen);
        for(int i = 0; i < maxLen; i++){
            res[i] = cha[resIndex];
            resIndex++;
        }
        String result = new String(res);
        return result;
    }
    
    public boolean checkPalindrome(char[] cha, int left, int right){
        while(left <= right){
            if(cha[left] != cha[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
        
    }
}