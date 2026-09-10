class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<int[]> stk = new Stack<>();
        int[] answer = new int[temp.length];

        for(int i = 0; i < temp.length; i++){
            while(!stk.isEmpty() && stk.peek()[0] < temp[i]){
                answer[stk.peek()[1]] = i-stk.peek()[1];
                stk.pop();
            }
            stk.push(new int[]{temp[i],i});
        }
        while(!stk.isEmpty()){
            answer[stk.pop()[1]] = 0;
        }
        return answer;
    }
}
