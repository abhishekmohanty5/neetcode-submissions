class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n= word1.length();
        int m = word2.length();
        
        StringBuilder res = new StringBuilder();
       
        int i=0;
        int j=0;
        int k=0;

        while(i<n && j<m){
           res.append(word1.charAt(i));
           res.append(word2.charAt(j));
           i++;
           j++;
        }

       if(i < n){
         res.append(word1.substring(i));
       }
       if(j < m){
        res.append(word2.substring(j));
       }

        return res.toString();
        
    }
}