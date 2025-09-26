class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        if(n==0) return true;
        if(arr.length == 1) return arr[0] == 0 && n<=1;
        if(arr[0] == 0 && arr[1]!=1){
            arr[0]=1;
            n-=1;
        }
        int i=1;
        while(i<arr.length-1 && n!=0){
            if(arr[i]!=1 && (arr[i-1]==0 && arr[i+1] ==0)){
                arr[i] = 1;
                n-=1;
            }
            i+=1;
        }
        if(n>0 && arr[arr.length-1] == 0 && arr[arr.length-2]!=1){
            arr[arr.length-1]=1;
            n-=1;
        }
        if(n==0) return true;
        return false;
    }
}