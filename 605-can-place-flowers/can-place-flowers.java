class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        int count = 0;
        if(arr.length==1){
            if(arr[0]==0 && n<=1) return true;
            else if(arr[0]==1 && n==0) return true;
            else return false;
        }

        for(int i=0; i<arr.length; i++){
            if(i==0 && arr[i]!=1){
                if(arr[i+1]!=1){
                    arr[i] = 1;
                    count++;
                }
            }else if(i==arr.length-1 && arr[i]!=1){
                if(arr[i-1]!=1){
                    arr[i] = 1;
                    count++;
                }
            }else if(arr[i]!=1){
                if(arr[i-1]!=1 && arr[i+1]!=1){
                    arr[i] = 1;
                    count++;
                }
            }
        }
        if(count>=n) return true;
        else return false;
    }
}