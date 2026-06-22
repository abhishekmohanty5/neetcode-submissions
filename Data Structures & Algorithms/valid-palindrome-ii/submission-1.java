class Solution {
    public boolean validPalindrome(String s) {
        int st=0;
        int end=s.length()-1;
        while(st < end){
            if(s.charAt(st) != s.charAt(end)){
              boolean res = palindrome(s,st+1,end) || palindrome(s,st,end-1) ;
              return res == true ? true : false;
            }
            st++;
            end--;
        }

        return true;
        
    }
    private boolean palindrome(String s, int st, int end){
        while(st < end){
            if(s.charAt(st) != s.charAt(end)) return false;
            st++;
            end--;
        }
        return true;
    }
}