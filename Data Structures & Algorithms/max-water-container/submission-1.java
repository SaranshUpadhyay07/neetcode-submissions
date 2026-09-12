class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length-1;
        int max = 0;

        while(i < j){
            int area = (j-i)*Math.min(heights[i],heights[j]);
            max = Math.max(max,area);
            if(heights[j] < heights[i]) j--;
            else i++;
        }
        return max;
    }
}
