class Solution {
    public boolean isAnagram(String s, String t) {

        int [] ar1 = new int[26];

        if(s.length() != t.length()) return false;

        for(char c : s.toCharArray()){
           ar1[c-'a'] ++;
        }

        for(char c : t.toCharArray()){
            ar1[c-'a']--;
        }
        
        for(int i=0; i<26; i++){
            if(ar1[i] > 0) return false;
        }

        return true;
    }
}
