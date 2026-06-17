class Solution {
    public void sortColors(int[] nums) {
    
    int st = -1;
    int i = 0;
    int end = nums.length ;

    while(i < end){

        if(nums[i] == 0){
            st++;
            int temp= nums[st];
            nums[st] = nums[i];
            nums[i]= temp;
            i++;
        }

        else if(nums[i] == 1){
            i++;
        }
        else{
            end --;
            int temp = nums[end];
            nums[end] = nums[i];
            nums[i] = temp;
        }
    }
        
    }
}