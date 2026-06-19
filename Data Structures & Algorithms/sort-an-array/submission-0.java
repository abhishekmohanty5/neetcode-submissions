class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }

    private void mergeSort(int [] ar, int st, int end){

        if(st == end) return ;
        int mid = st + (end-st) / 2;

        mergeSort(ar,st,mid);
        mergeSort(ar,mid+1,end);

        merge(ar,st,mid,end);
    }

    private void merge(int [] ar, int st, int mid ,int end){
        int [] temp = new int[end-st+1];
        int i=st;
        int j=mid+1;
        int k=0;

        while(i<= mid && j<=end){

            if(ar[i] < ar[j]) temp[k++]=ar[i++];
            else temp[k++] = ar[j++];

        }

        while(i<=mid){
            temp[k++] = ar[i++];
        }
        while(j <= end){
            temp[k++]=ar[j++];
        }

    
        int l= st;
        int m=0;
        while(l <= end){
            ar[l]=temp[m];
            l++;
            m++;
        }
    }

}