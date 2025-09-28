import java.util.*;
class Solution {
    public boolean isPerfectSquare(int num) {
        int s=1;
        int e=num;
        while(s<=e){
            int mid=(s+e)/2;
            if((long)mid*mid == num){
                return true;
            }
            else if((long)mid*mid > num){
                e= mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return false;
        
    }
}