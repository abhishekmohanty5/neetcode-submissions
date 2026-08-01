
public class Solution {
    public int LengthOfLongestSubstring(string s) {
        var map = new Dictionary<int,int>();
        int maxLength=0;
        int st=0;
        for(int i=0; i<s.Length;i++){
         
          char c = s[i];
            if(map.ContainsKey(c) && map[c] >= st){
               st = map[c]+1;
            }
            map[c] = i;
            maxLength = Math.Max(maxLength,i-st+1);
        }

        return maxLength;
    }
}
