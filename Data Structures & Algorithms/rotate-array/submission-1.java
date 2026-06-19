class Solution {
    public void rotate(int[] nums, int k) {
       int n = nums.length;
       k = k % n;
       int [] res = new int[n];
       int st = n-k;
       int j=0;

       for(int i=st; i<n; i++){
         res[j++]=nums[i];
       }
       for(int i=0; i<st; i++){
          res[j++] = nums[i];
       }

       for(int i=0; i<nums.length; i++){
        nums[i]=res[i];
       }
        
    }
}