class Solution {
    public int removeDuplicates(int[] nums) {

        int k=0;
        int j=0;

        while(j < nums.length){
            int cur= nums[j];
            nums[k++]= cur;
            while(j < nums.length && nums[j] == cur ) j++;
        }
        return k;
    }
}