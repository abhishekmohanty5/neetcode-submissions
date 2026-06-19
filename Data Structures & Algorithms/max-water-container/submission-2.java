class Solution {
    public int maxArea(int[] heights) {
        int n= heights.length;
        int st=0;
        int end = n -1;
        int maxWater = Integer.MIN_VALUE;

        while(st < end){
            int len = end-st;
            int curWater = len * Math.min(heights[st],heights[end]);
            maxWater=Math.max(curWater,maxWater);

            if(heights[st] < heights[end]) st++;
            else end --;
        }

        return maxWater;
        
    }
}
