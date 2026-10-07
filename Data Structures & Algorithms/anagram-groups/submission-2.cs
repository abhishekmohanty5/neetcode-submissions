public class Solution {
    public List<List<string>> GroupAnagrams(string[] strs) {
        var map = new Dictionary<string,List<string>>();

        foreach(var str in strs){
            int [] ar = new int[26];
            foreach(var c in str){
                ar[c-'a']++;
            }
            
            string key= string.Join(",", ar);
            if(!map.ContainsKey(key)){
                map[key]=new List<string>();
            }

            map[key].Add(str);
            
        }

          var res = new List<List<string>>();
          foreach(var list in map.Values){
            res.Add(list);
          }
       return res;
    }
}
