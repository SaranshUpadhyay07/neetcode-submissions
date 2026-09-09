class Solution {
    public int[] productExceptSelf(int[] nums) {
        int numberZero = 0;
        int product = 1;
        int[] productArr = new int[nums.length];
        int zeroIndex = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                numberZero++;
                zeroIndex = i;
            }
            else product *= nums[i];
        }

        if(numberZero > 1) return productArr;
        else if(numberZero == 1){
            productArr[zeroIndex] = product;
            return productArr;
        }

        for(int i = 0; i < nums.length; i++){
            productArr[i] = product/nums[i];
        }
        return productArr;
        
    }
}  
