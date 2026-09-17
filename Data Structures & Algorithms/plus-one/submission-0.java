class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;

        for(int i = digits.length-1; i >= 0; i--){
            int val = digits[i] + carry;
            if(i == digits.length-1) val++;
            digits[i] = val%10;
            carry = val/10;
        }
        if(carry == 0) return digits;

        int[] arr = new int[digits.length +1];
        for(int i = 1; i < arr.length; i++){
            arr[i] = digits[i-1];
        }
        arr[0] = carry;
        return arr;
    }
}
