class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     Map<String,List<String>> map = new HashMap<>();

     for(String str : strs){

        int[] ar = new int[26];
        for(char c: str.toCharArray()){
           ar[c-'a']++;
        }
       String key = Arrays.toString(ar);

        map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);

     }

      return new ArrayList<>(map.values());
        
    }
}
