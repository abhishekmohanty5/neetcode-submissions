public class Solution {
    public int CharacterReplacement(string s, int k) {
        var mark = new int[26];
        int st=0;
        int maxFreq=0,maxLength=0;
        for(int end = 0; end <s.Length; end++){
            char ch = s[end];
            mark[ch-'A']++;
            maxFreq = Math.Max(maxFreq,mark[ch-'A']);

            while((end-st+1)-maxFreq > k){
               mark[s[st]-'A']--;
               st++;
            }
           maxLength = Math.Max(maxLength,end-st+1);
        }
        return maxLength;
    }
}
