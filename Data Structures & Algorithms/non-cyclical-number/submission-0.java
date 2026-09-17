class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        while(n > 0){
            sum += Math.pow(n%10,2);
            n = n/10;
            if(n == 0 && sum != 0){
                n = sum;
                if(sum == 1)return true;
                if(set.contains(sum)) return false;
                set.add(sum);
                sum = 0;
            }   
        }
        return false;
    }
}
