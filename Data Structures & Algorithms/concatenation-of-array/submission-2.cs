public class Solution {
    public int[] GetConcatenation(int[] nums) {
        int [] res = new int[nums.Length*2];
        int cur=0;
        for(int i=0; i<nums.Length; i++){
            res[cur++]=nums[i];
        }

        for(int i=0; i<nums.Length; i++){
            res[cur++]=nums[i];
        }

        return res;
    }
}