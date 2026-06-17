class Solution {
    public int majorityElement(int[] nums) {

        int candidate = -1;
        int count = 0;

        for(int cur : nums){
            
            if(count == 0) candidate = cur;

            if(candidate == cur) count ++;
            else count--;
        }

        return candidate;
        
    }
}