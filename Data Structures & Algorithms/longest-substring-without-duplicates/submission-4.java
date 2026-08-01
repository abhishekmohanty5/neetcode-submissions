
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        var lastSeen = new int[128];
        Arrays.fill(lastSeen,-1);
        int maxLength=0;
        int st=0;
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(lastSeen[c] > -1 && lastSeen[c] >= st){
               st = lastSeen[c]+1;
            }
            lastSeen[c] = i;
            maxLength = Math.max(maxLength,i-st+1);
        }

        return maxLength;
    }
}
