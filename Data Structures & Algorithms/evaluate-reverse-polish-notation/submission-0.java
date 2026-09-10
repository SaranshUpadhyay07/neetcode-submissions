class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();

        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].equals("+")){
                int num2 = stk.pop();
                int num1 = stk.pop();
                stk.push(num1+num2); 
            }
            else if(tokens[i].equals("-")){
                int num2 = stk.pop();
                int num1 = stk.pop();
                stk.push(num1-num2); 
            }
            else if(tokens[i].equals("/")){
                int num2 = stk.pop();
                int num1 = stk.pop();
                stk.push(num1/num2); 
            }
            else if(tokens[i].equals("*")){
                int num2 = stk.pop();
                int num1 = stk.pop();
                stk.push(num1*num2); 
            }
            else{
                stk.push(Integer.parseInt(tokens[i]));
            }
        }

        return stk.peek();
    }
}
