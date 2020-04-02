class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        
        String string = String.valueOf(x);
        char[] cha = string.toCharArray();
        int i = 0;
        int j = cha.length-1;
        while(i<=j){
            if(cha[i] != cha[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}