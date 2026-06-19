class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            
            int target = 0 - nums[i];
           Set<Integer> set = new HashSet<>();

           for(int j=i+1; j<nums.length; j++){

             int need = target- nums[j]; 
               if(set.contains(need)){
                List<Integer> cur = new ArrayList<>(List.of(nums[i],need,nums[j]));
                Collections.sort(cur); 
                res.add(cur);
               }
               
              set.add(nums[j]);
           }
        }
    
     return new ArrayList<>(res);
        
    }
}
