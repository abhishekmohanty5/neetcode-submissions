public class Solution {
    public string LongestCommonPrefix(string[] strs) {

        if(strs == null && strs.Length == 0) return " ";
        string str = strs[0];

        while(str.Length > 0){
            bool match =true;

            for(int i=1; i<strs.Length; i++){
                
                if(!strs[i].StartsWith(str)){
                    match=false;
                    break;
                }
            }

            if(match){
                return str;
            }

            str = str.Substring(0,str.Length-1);
            
        }
      
      return "";
    }
}