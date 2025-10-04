class Solution {
    public static int helper(int[] arr,int[] max ,int index,int n){
        if(index == n){
            return max[n-1];
        }
        if(index == 0){
            max[index] = arr[index];
            return helper(arr,max,index+1,n);
        }
        if(index == 1){
            max[index] = Math.max(arr[0],arr[1]);
            return helper(arr,max,index+1,n);
        }
        max[index] = Math.max(max[index-2]+arr[index],max[index-1]);
        return helper(arr,max,index+1,n);
    }
    public int rob(int[] arr) {
        int n = arr.length;
        int[] max = new int[n];
        Arrays.fill(max,-1);
        return helper(arr,max,0,n);
        
    }
}