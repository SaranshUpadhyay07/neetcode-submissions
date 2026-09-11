class Solution {
    public int findDuplicate(int[] nums) {
        int arr[] = new int[10001];

        for(int i : nums){
            if(arr[i] == 1) return i;
            else arr[i]++;
        }

        return 0;
    }
}
