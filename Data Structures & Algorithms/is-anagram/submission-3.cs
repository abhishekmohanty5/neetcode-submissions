public class Solution {
    public bool IsAnagram(string s, string t) {

        if(s.Length != t.Length){
            return false;
        }

        var freqMap1= new Dictionary<char,int>();
        var freqMap2 = new Dictionary<char,int>();

        foreach(char c in s){
          freqMap1[c]=freqMap1.GetValueOrDefault(c,0)+1;
        }

        foreach(char c in t){
         freqMap2[c]=freqMap2.GetValueOrDefault(c,0)+1;
        }

        foreach(var pair in freqMap1){
          if(freqMap2.GetValueOrDefault(pair.Key,0) != pair.Value){
            return false;
          }
        }

        return true;

    }
}
