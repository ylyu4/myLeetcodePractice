class Solution {
    public int romanToInt(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        
        int total = 0;
        
        for(int i = 0; i < s.length();){
            if(i <= s.length()-2 && s.charAt(i) == 'C' && s.charAt(i+1) == 'M'){
                total += 900;
                i = i + 2;
            }else if(i <= s.length()-2 && s.charAt(i) == 'C' && s.charAt(i+1) == 'D'){
                total += 400;
                i = i + 2;
            }else if(i <= s.length()-2 && s.charAt(i) == 'X' && s.charAt(i+1) == 'C'){
                total += 90;
                i = i + 2;
            }else if(i <= s.length()-2 && s.charAt(i) == 'X' && s.charAt(i+1) == 'L'){
                total += 40;
                i = i + 2;
            }else if(i <= s.length()-2 && s.charAt(i) == 'I' && s.charAt(i+1) == 'X'){
                total += 9;
                i = i + 2;
            }else if(i <= s.length()-2 && s.charAt(i) == 'I' && s.charAt(i+1) == 'V'){
                total += 4;
                i = i + 2;
            }else if(s.charAt(i) == 'M'){
                total += 1000;
                i = i + 1;
            }else if(s.charAt(i) == 'D'){
                total += 500;
                i = i + 1;
            }else if(s.charAt(i) == 'C'){
                total += 100;
                i = i + 1;
            }else if(s.charAt(i) == 'L'){
                total += 50;
                i = i + 1;
            }else if(s.charAt(i) == 'X'){
                total += 10;
                i = i + 1;
            }else if(s.charAt(i) == 'V'){
                total += 5;
                i = i + 1;
            }else{
                total += 1;
                i = i + 1;
            }
        }
        return total;       
    }
}