class Solution {

    private int searchRow(int[][]matrix, int st, int end, int target){
        while(st <= end){

            int mid = st + (end-st) / 2;

            if(matrix[mid][0] > target){
                end = mid-1;
            }
            else{
                st=mid+1;
            }
        
        }

        return end;
    }
    public boolean searchMatrix(int[][] matrix, int target) {

     int row = searchRow(matrix,0,matrix.length-1,target);
     int st=0;
     int end = matrix[0].length - 1;

     if(row < 0) return false;

     while(st <= end){
        int mid = st + (end-st) / 2;
        if(matrix[row][mid] == target){
           return true;
        }
        else if(matrix[row][mid] < target){
          st = mid+1;
        }
        else{
            end = mid - 1;
        }
     }
        return false;
    }
}
