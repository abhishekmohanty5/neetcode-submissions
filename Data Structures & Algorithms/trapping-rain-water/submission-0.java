class Solution {
    private int findRightMaximum(int st, int [] height){
        int res=-1;
        for(int i=st; i<height.length; i++){
          res = Math.max(res,height[i]);
        }
        return res;
    }
    public int trap(int[] height) {
        int totalWater=0;
        int leftMax=height[0];
        for(int i=1; i<height.length; i++){
           
           int rightMax= findRightMaximum(i+1,height);
           int cur=height[i];
           
           if(leftMax > cur && rightMax > cur){
              int curWater = Math.min(leftMax,rightMax) - cur;
              totalWater += curWater;
           }
           
           leftMax = cur > leftMax ? cur : leftMax;

        }

        return totalWater;
        
    }
}
