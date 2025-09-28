import java.util.*;
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        int res1 = -1;
        int res2 = -1;
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                res1 = mid;
                high = mid-1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        low=0;high=nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                res2 = mid;
                low = mid+1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        res[0]=res1;
        res[1]=res2;
        return res;
    }
}