class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> stk = new ArrayDeque<>();
        stk.push(s.charAt(0));

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i)=='{' || s.charAt(i) == '[' || s.charAt(i) == '('){
                stk.push(s.charAt(i));
            }
            else if(s.charAt(i)=='}' || s.charAt(i) == ']' || s.charAt(i) == ')'){
                if(stk.isEmpty()) return false;
                if(s.charAt(i)=='}' && stk.peek() == '{') stk.pop();
                else if(s.charAt(i)==']' && stk.peek() == '[') stk.pop();
                else if(s.charAt(i)==')' && stk.peek() == '(') stk.pop();
                else return false;
                
            }
            else return false;
        }

        return stk.isEmpty()?true:false;
    }
}
