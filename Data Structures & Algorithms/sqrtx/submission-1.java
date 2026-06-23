class Solution {
    public int mySqrt(int x) {

        if(x < 2) return x;
        int st=1;
        int end = x/2;

        while(st <= end){
            int mid = st + (end-st) / 2;
            long cur=(long)mid*mid;
            if(cur == x) return mid;
            else if(cur > x){
                end = mid-1;
            }
            else{
                st = mid + 1;
            }

        }

        return end;
        
    }
}