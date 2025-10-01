class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> (a[0]==b[0] ? a[1]-b[1] : a[0]-b[0]));
        int count =0;
        int i=0;
        int j =1;
        while(j<intervals.length){
            if(intervals[j][0]<intervals[i][1]){
                count++;
                if(intervals[j][1]<intervals[i][1]){
                    i=j;
                }
            }
            else{
                i=j;
            }
            j++;
            
        }
        return count;
    }
}