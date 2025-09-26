class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long minTime = Long.MAX_VALUE;
        for(int i:time){
            minTime = Math.min(i,minTime);
        }
        
        long start = 1;
        long end = (long) minTime * totalTrips;;
        long ans = end;
        while(start<=end){
            long mid = start + (end - start) / 2;
            long t = f(mid,time);
            if(t>=totalTrips){
                end = mid-1;
                ans = mid;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
    public static long f(long mid,int[] time){
        long trip = 0;
        for(int j:time){
            trip+=mid/j;
        }
        return trip;
    }
}