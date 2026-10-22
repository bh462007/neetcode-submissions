class Solution {
    public int maxArea(int[] heights) {
        int maxW=0;
        int left=0;
        int right=heights.length-1;

        while(left<right){
            int width=right-left;
            int currHeight=Math.min(heights[left], heights[right]);

            int currWater=width*currHeight;
            maxW=Math.max(currWater, maxW);

            if(heights[left] < heights[right]){
                left++;
            }
            else{
                right--;
            }
        }

        return maxW;
    }
}
