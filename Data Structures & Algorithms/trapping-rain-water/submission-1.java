class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int maxLeft = height[0];
        int maxRight = height[n-1];

        int totalWater=0;
        int left=0;
        int right=n-1;

        while(left < right){

            if(maxLeft< maxRight){
                totalWater += maxLeft - height[left];
                left++;
                maxLeft = height[left] > maxLeft ? height[left] : maxLeft;
    
            }
            else{
                totalWater += maxRight - height[right];
                right --;
                maxRight = height[right] > maxRight ? height[right] : maxRight;
            }
        }

      return totalWater;
        
    }
}
