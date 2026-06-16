class Solution {
    public String longestCommonPrefix(String[] strs) {

        String temp = strs[0];
        int i=0;
        int n= temp.length();

        StringBuilder res = new StringBuilder("");

        while(i < n){
            char c = temp.charAt(i);
          for(int j=1; j<strs.length; j++){
             if(!strs[j].startsWith(res.toString() + c)) return res.toString();
          }
           res = res.append(c);
           i++;

        }

        return res.toString();
        
    }
}