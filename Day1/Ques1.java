import java.util.*;
class Solution {
    public int findMinArrowShots(int[][] points) {
        int length = points.length;
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));

        int prev = points[0][1];
        int res = 1;
        for(int i=1;i<length;i++){
            if(points[i][0]<= prev) continue;
            else{
                prev = points[i][1];
                res++;
            }
        }
        return res;

    }
}
