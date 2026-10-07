public class Solution {
    public bool IsAnagram(string s, string t) {
        if(s.Length != t.Length) {
            return false;
        }
        int [] map = new int[26];
        for(int i=0; i<s.Length; i++){
            char c1 = s[i];
            char c2 = t[i];
            map[c1-'a']++;
            map[c2-'a']--;
        }

        for(int i=0; i<map.Length; i++){
            if(map[i] != 0) {
                return false;
            }
        }

        return true;

    }
}
