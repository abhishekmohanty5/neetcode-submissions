public class Solution {
    public int MinSubArrayLen(int target, int[] nums) {

        int st=0;
        int minLength=int.MaxValue;
        int sum=0;
        for(int end =0; end < nums.Length; end ++){   
            sum+= nums[end];

            while(sum >= target){
              minLength = Math.Min(minLength,end-st+1);
               sum -= nums[st];
               st++;
            }
        }

        return minLength == int.MaxValue ? 0 : minLength;
    }
}