class Solution {

    public boolean isValid(String s) {
        if(s == null || s.length() == 0){
            return true;
        }
        
        if(s.length() % 2 != 0){
            return false;
        }
        
        char[] cha = s.toCharArray();
        
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < cha.length; i++){
            if(cha[i] == '(' || cha[i] == '{' || cha[i] == '['){
                stack.push(cha[i]);    
            }else{
                if(!stack.empty()){
                    if(cha[i] == ')' && stack.peek() != '('){
                        return false;
                    }else if(cha[i] == '}' && stack.peek() != '{'){
                        return false;
                    }else if(cha[i] == ']' && stack.peek() != '['){
                        return false;
                    }else{
                        stack.pop();
                    }
                }else{
                    return false;
                }
            }
        }
        return stack.empty();
        
    }
}