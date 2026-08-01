
public class Solution {
    public int LengthOfLongestSubstring(string s) {
        var lastSeen = new int[128];
        Array.Fill(lastSeen,-1);
        int maxLength=0;
        int st=0;
        for(int i=0; i<s.Length;i++){
            char c = s[i];
            if(lastSeen[c] > -1 && lastSeen[c] >= st){
               st = lastSeen[c]+1;
            }
            lastSeen[c] = i;
            maxLength = Math.Max(maxLength,i-st+1);
        }

        return maxLength;
    }
}
