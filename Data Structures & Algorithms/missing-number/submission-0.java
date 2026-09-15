class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;

        for(int n : nums) sum+=n;

        int actual = (nums.length*(nums.length+1))/2;

        return actual - sum;
    }
}
