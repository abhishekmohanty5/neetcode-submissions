public class Solution {
    public bool CheckInclusion(string s1, string s2) {
       var map = new int[26];
       var windowMap = new int[26];
       foreach(char c in s1) {
         map[c-'a'] ++;
       }
       int k= s1.Length; 
       int get=0,st= 0,need = s1.Length;

        for(int end =0; end<s2.Length; end++){
           int ch = s2[end] - 'a';

           if(windowMap[ch] < map[ch]) get++;
           windowMap[ch]++;

           if(end-st+1 == k){ 
              if(get == need) return true;
                int leftCh=s2[st]-'a';

               if(windowMap[leftCh] <= map[leftCh]) get--;
               windowMap[leftCh]--;
               st++;
           }
        }
        return false;
    }
}
