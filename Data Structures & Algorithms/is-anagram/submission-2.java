class Solution {
    public boolean isAnagram(String s, String t) {

        int [] ar1 = new int[26];
        if(s.length() != t.length()) return false;

        for(int i=0; i<s.length(); i++){
            char c1=s.charAt(i);
            char c2 = t.charAt(i);
            ar1[c1-'a']++;
            ar1[c2-'a']--;
        }

        for(int i=0; i<26; i++){
            if(ar1[i] > 0 || ar1[i] < 0) return false;
        }

        return true;
    }
}
