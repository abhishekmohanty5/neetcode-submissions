class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
      Arrays.sort(nums);
      Set<List<Integer>> set =  new HashSet<>(); 
        for(int i=0; i<nums.length; i++){
            long threeSum = (long)target-nums[i];

            // 3 sum  
            for(int j=i+1; j<nums.length; j++){
                long twoSum = threeSum - nums[j];
                //Need 2 sum from j+1 to n 
                int st= j+1;
                int end = nums.length-1;

                while(st < end){
                    int sum = nums[st]+nums[end];

                    if(sum == twoSum){
                       List<Integer> cur = new ArrayList<>();
                       cur.add(nums[i]);
                       cur.add(nums[j]);
                       cur.add(nums[st]);
                       cur.add(nums[end]);
                       Collections.sort(cur);
                       set.add(cur);
                       st++;
                       end--;
                    }
                    else if(sum > twoSum) {
                        end--;
                    }
                    else{
                       st++;
                    } 
                }
            }

        }
        return new ArrayList<>(set);
        
    }
}