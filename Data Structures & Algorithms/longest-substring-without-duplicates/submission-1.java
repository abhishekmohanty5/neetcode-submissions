 class Solution {
    public int lengthOfLongestSubstring(String s) {
        var map= new HashMap<Character,Integer>();
        int maxLength=0;
        int st=0;
        for(int i=0; i<s.length();i++){
         
          char c = s.charAt(i);
            if(map.containsKey(c) && map.get(c) >= st){
               st = map.get(c)+1;
            }
            map.put(c,i);
            maxLength = Math.max(maxLength,i-st+1);
        }

        return maxLength;
    }
}
