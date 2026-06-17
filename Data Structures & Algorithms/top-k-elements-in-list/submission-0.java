class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
      
       List<Map.Entry<Integer,Integer>> entrys
                    =  new ArrayList<>(map.entrySet());

        entrys.sort((a,b) -> b.getValue()-a.getValue());

        int[] res = new int[k];
        int i=0;

        for(Map.Entry<Integer,Integer> entry : entrys){
            res[i++] = entry.getKey();
            if(i == k) break;
        }

        return res;

        
    }
}
