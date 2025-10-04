class Solution {
    public int maxSubArray(int[] arr) {
        int currentsum = arr[0];
        int maxsum = arr[0];
        for(int i=1;i<arr.length;i++){
            currentsum =Math.max(arr[i],currentsum+arr[i]);
            maxsum = Math.max(maxsum,currentsum);
        }
        return maxsum;
    }
}