public class Solution {
    public bool ContainsNearbyDuplicate(int[] nums, int k) {
        var map = new Dictionary<int,int>();

        for(int i=0; i<nums.Length;i++){
            int key = nums[i];

            if(map.ContainsKey(key)){

                if (Math.Abs(map[key]-i) <= k ) return  true; 
            }
            map[key] = i;
        }
        return false;
    }
}